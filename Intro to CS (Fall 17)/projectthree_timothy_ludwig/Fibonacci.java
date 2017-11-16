//Tim Ludwig
//CSC 101
//Project 3

//This program will print a list of Fibonacci numbers. The user will be asked an amount of numbers they want to see output to the screen and the program calculate them up do the user input amount desired.

import java.util.*; //IMPORTING SCANNER
import java.lang.*; //IMPORTING MATH

class Fibonacci {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in); //SCANNER FOR USER INPUT
    int index;
    int num=1, num2=1, num3=1;
    System.out.println("Welcome to the world of Fibonacci numbers! Let's explore.");
    System.out.println("How many Fibonacci values would you like to see output?");
    index = in.nextInt();
    //FIBONACCI LOOP
      for ( int i=1; i<=index; i++) {
      num3 = num + num2;
      num = num2;
      num2 = num3;
      System.out.println("The Fibonacci number at position " + i + " is: " + userInput(i));
      }

      System.out.println("Thanks for stopping in. Goodbye!");
  }//end main

  //RETURNS INTEGER VALUE OF SINGLE FIBONACCI NUMBER
  public static int userInput(int num) {
    //USES FORMULA TO FIND FIBONACCI PLACE //A LOT SIMPLER WITH RECURSION AND/OR ITERATION
    double golden = (1 + Math.sqrt(5)) / 2; //GOLDEN RATIO HAPPENS TWICE
    return ((int) ((Math.pow(golden, num) - Math.pow(1 - golden, num)) / Math.sqrt(5))); //RETURNS INTEGER VALUE
  }//END userInput METHOD
}//END Fibonacci CLASS
