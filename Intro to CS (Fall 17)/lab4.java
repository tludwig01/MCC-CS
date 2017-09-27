// Tim Ludwig
// Lab 4
// CSC 101

import java.util.*;
import java.lang.*;
import java.text.*;

//Splitting a string into TWO strings at the "!" character.
class problemOne {
  public static void main(String[] args) {

      Scanner keyboard = new Scanner(System.in);

      String text, exclamation;

      exclamation = new String("!");

      keyboard.useDelimiter(System.getProperty("line.separator"));

      System.out.println("On the line below, enter a statement that contains one '!' in it:");
      text = keyboard.next();

      System.out.println(text.substring(0, text.indexOf(exclamation)));
      System.out.println(text.substring(text.indexOf(exclamation) + 1, text.length()));
  }
}

//Compound interest formula
class problemTwo {
  public static void main(String[] args) {

//Solve P(1 + R/100)^N
    Scanner keyboard = new Scanner(System.in);
    DecimalFormat twoPlaces = new DecimalFormat("0.00");

    double dollarsP;
    double interestR;
    int yearsN;

    System.out.println("How much money are you investing: ");
    dollarsP = keyboard.nextDouble();

    System.out.println("What's your interest rate (enter a decimal e.g. 2.54): ");
    interestR = keyboard.nextDouble();

    System.out.println("How many years do you plan on investing: ");
    yearsN = keyboard.nextInt();

    double moneyEarned = dollarsP * Math.pow(1 + interestR/100, yearsN);

    System.out.println("Your earned investment total is: $" + twoPlaces.format(moneyEarned));
  }
}

//Finding the velocity of a satelite revolving around the Earth
class problemThree {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    DecimalFormat twoPlaces = new DecimalFormat("0.00");

    double earthMass = 5.98 * Math.pow(10, 24);
    double gravConstant = 6.67 * Math.pow(10, -11);

    System.out.println("Earth's mass is approximately " + earthMass + "kg.");
    System.out.println("Universal gravitational constant is approximately " + gravConstant + "");

    int radius;

    System.out.println("Enter a number for radius: ");
    radius = keyboard.nextInt();

    double velocity = Math.sqrt((gravConstant * earthMass) / radius);

    System.out.println("Velocity is " + twoPlaces.format(velocity) + " meters per second.");
  }
}
