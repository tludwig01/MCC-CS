import java.util.*;

class Digits {
  public static void main(String[] args) {
    Scanner type = new Scanner(System.in);
    System.out.println("Hello there.");

    boolean positive = true;

    while (positive == true) {
      //LOOP CONTINUALLY PROMPTING USER TO ENTER DIFFERENT NUMBERS
      System.out.println("Enter a number, I'll tell you how many digits it has: ");
      int digits = type.nextInt();
      int amount = 0;

      if (digits <= 0) {
        //EXITS PROGRAM UPON USER ENTERING NEGATIVE NUMBER
        System.out.println("Exited program. Thanks for playing!");
        positive = false;
      }
      else {
        //LOOP FOR COUNTING DIGITS
        while (digits != 0) {
          digits = digits/10;
          amount = amount + 1;
        }//end inner while loop
        System.out.println("Digit total is: " + amount);
      }
    }//end outer while loop
  }//end main
}//end digits class
