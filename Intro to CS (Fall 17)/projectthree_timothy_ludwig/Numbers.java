//Tim Ludwig
//CSC 101
//Project 3

//This program allows the user to input two integers and will solve/output the Lowest Common Multiple (LCM) and Greatest Common Divisor (GCD) of the two given numbers. The user has the option to continue inputting numbers or quit the program once they're done.

import java.util.*; //IMPORTING SCANNER FOR USER INPUT

class Numbers {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in); //SCANNER IN
    boolean cont = true; //BOOLEAN FLAG TO STAY IN OR BREAK LOOP
    //WELCOME MESSAGE
    System.out.println("Welcome! We're going to solve some GCDs and LCMs. Let's do it!");
    while (cont == true) {
      System.out.println("Enter first number: "); //FIRST USER INPUT
      int num1 = in.nextInt();
      System.out.println("Enter second number: "); //SECOND USER INPUT
      int num2 = in.nextInt();
      //PRINTS GCD
      System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + GCD(num1, num2));
      //PRINTS LCM
      System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + LCM(num1, num2));

      System.out.println("Want to enter more numbers? (0 = 'no', 2 = 'yes')");
      int playOn = in.nextInt();
    //CONDITIONAL STATEMENT TO KEEP INPUTTING NUMBERS
        if (playOn == 0) {
          cont = false;
          //EXIT PROGRAM MESSAGE
          System.out.println("Thanks for playing. See ya later!");
        }
    }//WHILE WHILE LOOP
  }//END MAIN

  //GCD METHOD
  public static int GCD(int num1, int num2) {
    //SOLVES GCD USING EUCLIDEAN ALGORITHM
    while (num2 != 0) {
      int i = num2;
      num2 = num1 % num2;
      num1 = i;
    }
    return num1;
  }//END GCD

  //LCM METHOD
  public static int LCM(int num1, int num2) {
    //SOLVES LCM USING A CALL TO GCD METHOD
    return num1 * num2 / (GCD(num1, num2));
  }//END LCM
}//END Numbers CLASS
