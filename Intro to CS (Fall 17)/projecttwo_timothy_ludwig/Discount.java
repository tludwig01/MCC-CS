// Tim Ludwig
//Project 2
//CSC 101

import java.util.*;
import java.text.*;

class Discount {
  public static void main(String[] args) {

    double perBag = 5.5; //PRICE PER BAG OF COFFEE at $5.50
    double discount, shipping;

    DecimalFormat two = new DecimalFormat("0.00");
    Scanner type = new Scanner(System.in);
    //WELCOME MESSAGE AND PROGRAM START
    System.out.println("Welcome! You own a coffee shop now. Stock is running low!");
    //USER INPUT FOR BAGS PURCHASED
    System.out.println("How many bags of coffee are you purhcasing?");
    int bags = type.nextInt();
    //CALCULATES USER INPUT BAG QUANTITY AND PRICE AT $5.50 EACH
    double price = bags * perBag;
    //INITIAL BAG ORDER DISPLAY AND PRICE NON-DISCOUNTED
    System.out.println("You ordered: " + bags + " bags of coffee for $" + two.format(price));

    //CONDITIONAL STATEMENT CALCULATING ORDER QUANTITY DISCOUNT
    if (bags >= 25 && bags <= 49) {
      discount = (price * 0.05);
      System.out.println("Thanks. Your order discount is: $" + two.format(discount));
    }
    else if (bags >= 50 && bags <= 99) {
      discount = (price * 0.10);
      System.out.println("Thanks. Your order discount is: $" + two.format(discount));
    }
    else if (bags >= 100 && bags <= 149) {
      discount = (price * 0.15);
      System.out.println("Thanks. Your order discount is: $" + two.format(discount));
    }
    else if (bags >= 150 && bags <= 199) {
      discount = (price * 0.20);
      System.out.println("Thanks. Your order discount is: $" + two.format(discount));
    }
    else if (bags >= 200 && bags <= 299) {
      discount = (price * 0.25);
      System.out.println("Thanks. Your order discount is: $" + two.format(discount));
    }
    else {
      discount = (price * 0.30);
      System.out.println("Thanks. Your order discount is: $" + two.format(discount));
    }
    //CALCULATES BOXES USED
    System.out.println();
    System.out.println("Boxes used: ");
        //BOX QUANTITY AND SHIPPING PRICE FOR LARGE BOXES
    double large = Math.round(bags) / 20;
    double nextLarge = 20 * large;
    double largePrice = large * 1.8;
    System.out.println("Large boxes: " + large);
    System.out.println("Shipping cost: $" + two.format(largePrice));
        //BOX QUANTITY AND SHIPPING PRICE FOR MEDIUM BOXES
    double medium = Math.round(bags - (nextLarge)) / 10;
    double nextMed = 10 * medium;
    double medPrice = medium * 1;
    System.out.println("Medium boxes: " + medium);
    System.out.println("Shipping cost: $" + two.format(medPrice));
        //BOX  QUANTITY AND SHIPPING PRICE FOR SMALL BOXES
    double small  = Math.round(Math.ceil(bags - (nextLarge) - (nextMed)) / 4);
    double smallPrice = small * 0.6;
    System.out.println("Small boxes: " + small);
    System.out.println("Shipping cost: $" + two.format(smallPrice));

        //CALCULATES GRAND TOTAL AND PRINTS GOODBYE MESSAGE
    double total = (price - discount) + largePrice + medPrice + smallPrice;
    System.out.println();
    System.out.println("Your grand total is: $" + two.format(total));
    System.out.println("Thanks for shopping!");
  }//end main
}//end Discount class
