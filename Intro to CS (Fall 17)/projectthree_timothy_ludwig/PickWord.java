//Tim Ludwig
//CSC 101
//Project 3

//This program finds words in sentences. Enter a sentence. Then enter the number for the word you want to find.

//EXAMPLE:
//Sentence: "Is this the real life or is this just fantasy?"
//Number: "5"
//Output: "Word number 5 in your sentence is: 'or'!"

//In your notes on my project, please tell me why my while loop isn't working like I want. You'll notice that if you want to continue inputting sentences that it prints the prompts for the variable phrase and the variable index at the same time. Then everything start going to hell. It shouldn't be doing this, but I can't figure out why.

import java.util.*; //IMPORTING SCANNER

class PickWord {
  public static void main(String[] args) {
    boolean cont = true;
    int index;
    String phrase;
    Scanner in = new Scanner(System.in);
    //WLECOME MESSAGE
    System.out.println("Welcome! I'm going to pick a word out of a sentence for you. Give me a sentence, then give me a number. I'll pick that word out of the sentence.");
    //LOOP TO KEEP THE PROGRAM GOING
    while(cont == true) {
      try {
      System.out.println("Enter a sentence: ");
      phrase = in.nextLine();
      System.out.println("Enter a number to access that word index in the phrase: ");
      index = in.nextInt();
        if (index <= 0) {
          throw new Exception("Invalid entry. Enter number again.");
        }
      //OUTPUT DISPLAY CALLING WordLocation METHOD
      System.out.println("Word number " + index + " in the entered phrase is: ");
      System.out.println(WordLocation(phrase, index));
      }
      //CATCH FOR INVALID NUMBERS
      catch (Exception e) {
        System.out.println(e.getMessage());
        in.next();
      }
      System.out.println("Want to enter another sentence? (0 = 'no', 2 = 'yes')");
      int playOn = in.nextInt();
    //CONDITIONAL STATEMENT TO KEEP INPUTTING NUMBERS
        if (playOn == 0) {
          cont = false;
          //EXIT PROGRAM GOODBYE MESSAGE
          System.out.println("Thanks for playing. See ya later!");
        }
        else {
          cont = true;
        }
    }
  }//END MAIN

//WORD LOCATION METHOD
  public static String WordLocation(String phrase, int word) {
      int index = 0;
      for (int i = 1; i < word; i++) {
          while (index < phrase.length() && phrase.charAt(index) != ' ') {
            index++;
          } //AVOID NON SPACES
          while (index < phrase.length() && phrase.charAt(index) == ' ') {
            index++;
          }//AVOID SPACES
      }//END FOR LOOP
      int start = index;  //AT THE START OF THE WORD
      while (index < phrase.length() && phrase.charAt(index) != ' ') {
      index++;
    }// TO THE END OF THE WORD
      return phrase.substring(start, index); //RETURNS TO MAIN METHOD
  }//END WordLocation METHOD
}//END PickWord CLASS
