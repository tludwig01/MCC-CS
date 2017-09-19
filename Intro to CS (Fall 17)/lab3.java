//Tim Ludwig
//LAB 3
// CSC 101

import java.util.Scanner;
import java.text.DecimalFormat;

//#1
class outputPractice {
    public static void main(String[] args) {

      System.out.println("My programming teacher is awesome");
      System.out.println(10.5);
      System.out.println(100);
    }
}

//#2
class outputPracticeTwo {
    public static void main(String[] args) {

      String word = "My programming teacher is awesome";
      Double decimal = 10.5;
      int number = 100;

      System.out.println(word);
      System.out.println(decimal);
      System.out.println(number);
    }
}

//#3
class outputPracticeThree {
    public static void main(String[] args) {

      int numOne = 5;
      int numTwo = 10;
      int numThree = 15;
      int numFour = 20;
      int numFive = 25;

      System.out.print(numOne + "     ");
      System.out.println(numTwo);

      System.out.println(numThree);
      System.out.println();

      System.out.print(numFour + "      ");
      System.out.println(numFive);
    }
}

//#4
class outputPracticeFour {
    public static void main(String[] args) {

      Scanner keyboard = new Scanner(System.in);

      int numberOne;
      int numberTwo;

      System.out.println("Hi, how are ya?");
      System.out.println("Enter an integer here:  ");
      numberOne = keyboard.nextInt();
      System.out.println("Okay, enter one more integer here: ");
      numberTwo = keyboard.nextInt();

      int numberThree = numberOne + numberTwo;

      System.out.print("Your first number is: " + numberOne + " ");
      System.out.println("Your second number is: " + numberTwo);
      System.out.println("Finally, the sum of your numbers is: " + numberThree);
    }
}

//#5
class outputPracticeFive {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    scanner.useDelimiter(System.getProperty("line.separator")); // code pulled from text, chapter 2.

      String faveLyric;

      System.out.println("What's your favorite song lyric?");
      faveLyric = scanner.next();
      System.out.println();

      System.out.println("Your favorite color is: " + faveLyric);
  }
}

//#6
class outputPracticeSix {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    DecimalFormat threePlaces = new DecimalFormat("0.000"); //Decimal Format

      System.out.println("Enter a decimal numer (e.g. 78.4639847): ");
      double numberOne = scanner.nextDouble();

      System.out.println("Enter another decimal number (eg 15.297420)");
      double numberTwo = scanner.nextDouble();
      System.out.println();

      double numberThree = numberOne / numberTwo;

        System.out.println(numberOne + " divided by " + numberTwo + " is: " + threePlaces.format(numberThree));
  }
}
