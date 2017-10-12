// Tim Ludwig
// JAVA PROJECT ONE
// CSC 101 - FALL 2017

//Program to solve the quadratic equation with prompts for user input variables! 

import java.util.Scanner;
import java.text.DecimalFormat;

class Quadratic {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    DecimalFormat twoPlaces = new DecimalFormat("0.00"); //To keep the decimals at two places

    double numA; //coefficient 'a' not named as a single letter!
    double numB; //coefficient 'b'
    double numC; //coefficient 'c'

    //Welcome message
    System.out.println("It's math time. Let's solve Quadratic equations!");

    //Enter first coefficient
    System.out.println("Enter first variable here: ");
    //user input variable
    numA = scanner.nextDouble();

    //Enter second coefficient
    System.out.println("Enter second variable here: ");
    //user input variable
    numB= scanner.nextDouble();

    //Enter third coefficient
    System.out.println("Enter third variable here: ");
    //User input variable
    numC = scanner.nextDouble();

    //Solves first answer in equation
    double answerOne = (-numB + Math.sqrt(Math.pow(numB, 2)- (4 * numA * numC))) / (2 *numA);

    //Solves second answer in equation
    double answerTwo = (-numB - Math.sqrt(Math.pow(numB, 2) - (4 * numA * numC))) / (2 * numA);

    //Prints whole equation, showing user input numbers
    System.out.println("You've entered the equation as: " + twoPlaces.format(numA) + "*x^2 + " + twoPlaces.format(numB) + "*x + " + twoPlaces.format(numC) + " = 0");

    //Prints answer one
    System.out.println("Your first answer is: " + twoPlaces.format(answerOne));

    //Prints answer two
    System.out.println("Your second answer is: " + twoPlaces.format(answerTwo));

    //Goodbye message
    System.out.println("See, Math is easy when Java does it for you. Thanks for dropping by!");
  }
}
