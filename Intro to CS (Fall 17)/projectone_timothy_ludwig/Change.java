// Tim Ludwig
// JAVA PROJECT ONE
// CSC 101 - FALL 2017

//Program calculating change after a transaction. It breaks the change down in to denominations of ones, quarters, dimes, nickels, and pennies.

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

class Change {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    DecimalFormat twoPlaces = new DecimalFormat("0.00");
    //Welcome message
    System.out.println("Your favorite day of the week has arrived. Grocery day.");

    //User input item cost as a double
    System.out.println("Enter cost of items here (e.g. 5.37): ");
    double productCost = scanner.nextDouble();
    System.out.println("You owe: $" + twoPlaces.format(productCost));

    //User inputs cashGiven. ASSUMED to be MORE than productCost
    System.out.println("Okay, how much are you paying with? Enter here (e.g. 15.24): ");
    double cashGiven = scanner.nextDouble();
    System.out.println("You've paid with: $" + twoPlaces.format(cashGiven));

    //Calculates total change and displays message
    double change = cashGiven - productCost;
    System.out.println("Thanks! Your change is: $" + twoPlaces.format(change));

    //Calculates amount of ones to be returned. Displays message.
    double ones = Math.floor(change) / 1;
    System.out.println("Ones back: " + Math.round(ones));

    //Calculates remaining change
    double coins25 = change - ones;

    //Calculates quarters to be returned. Displays message.
    double quarters = Math.floor((coins25 * 100) / 25);
    System.out.println("Quarters back: " + Math.round(quarters));

    //Calculates remaining change
    double coins10 = change - ones - (quarters * 0.25);

    //Calculates dimes to be returned. Displays message.
    double dimes = Math.floor((coins10 * 100) / 10);
    System.out.println("Dimes back: " + Math.round(dimes));

    //Calculates remaining change
    double coins5 = change - ones - (quarters * 0.25) - (dimes * 0.10);

    //Calculates nickels to be returned. Displays message.
    double nickels = Math.floor((coins5 * 100) / 5);
    System.out.println("Nickels back: " + Math.round(nickels));

    //Calculates remaining change
    double coins1 = change - ones - (quarters * 0.25) - (dimes * 0.10) - (nickels * 0.05);

    //Calculates pennies to be returned. Displays message.
    double pennies = (coins1 * 100) / 1;
    System.out.println("Pennies back: " + Math.round(pennies));

    //Displays closing message
    System.out.println("Shopping isn't THAT bad. Have a fabulous day!");

  } //End main
} //End class
