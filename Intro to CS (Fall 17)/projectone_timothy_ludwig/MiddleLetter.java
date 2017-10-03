// Tim Ludwig
// JAVA PROJECT ONE
// CSC 101 - FALL 2017

//This is a string play program!
//Users will be prompted to enter a phrase of their choosing and the program will do the following:
//1) locate the first 'e' character in the string
//2) the full string length (amount of characters)
//3) remove the FIRST and LAST characters from the strong
//4) display the middle character of the phrase

import java.util.*;
import java.lang.*;
import java.text.*;

class MiddleLetter {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String phrase, letterE, middleLetter, middleLeftLetter;
    int stringLength;

    scanner.useDelimiter(System.getProperty("line.separator"));
    //Welcome message introducing the program
    System.out.println("We're going to play with words here. Start thinking of your favorite phrase, saying, or quote!");
    //User input prompt
    System.out.println("Enter your phrase below: ");
    phrase = scanner.next();
    //display user input
    System.out.println("You've entered: " + phrase);

    letterE = new String("e");
    stringLength = phrase.length(); //Character length
    middleLeftLetter = phrase.substring((stringLength / 2) -1, stringLength / 2); //For EVEN amounts of input characters
    middleLetter = phrase.substring(stringLength / 2, stringLength / 2 + 1); //for ODD amounts of input characters

    //Prints the first instance of the 'e' character
    System.out.println("The first letter 'e' is located a character number: "+ phrase.indexOf(letterE));

    //Prints the character length of the entered phrase
    System.out.println("Your phrase is " + stringLength + " characters long.");

    //Prints the entered phrase with the first and last character missing
    System.out.println("Your phrase looks weird like this because the first and last characters have mysteriously disappeared: " + phrase.substring(1, phrase.length() -1));

    //Prints the middle character of the entered phrase on the given condition: if it's a EVEN numbered phrase, there are two middle characters. This chooses the first of the two IF the condition is met. If the character count is an odd number, it prints the exact middle character.
    if (stringLength % 2 == 0) {
      System.out.println("The middle left character of this even charactered phrase is: " + middleLeftLetter);
    } else {
      System.out.println("The middle character of your phrase is: " + middleLetter);
    }

    System.out.println("Thanks for playing!");
  }
}
