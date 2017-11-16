import java.util.*;
import java.lang.*;

class Palindrome {
  public static void main(String[] args) {
    String palindrome;
    Scanner in = new Scanner(System.in);
    System.out.println("Let's check for palindromes. Enter a word or phrase here: ");
    palindrome = in.nextLine();

    String palindromeCheck = new StringBuilder(palindrome).reverse().toString();

    if (palindrome.equals(palindromeCheck)) {
      System.out.println("That's a palindrome!");
    }
    else {
      System.out.println("That's not a palindrome.");
    }
  }
}


class SwitchCase {
  public static void main(String[] args) {
    String sentence;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a sentence here: ");
    sentence = in.nextLine();
    int len = sentence.length();

    for (int i = 0; i < sentence.length(); i++) {
      char letter = sentence.charAt(i);

      if (Character.isUpperCase(letter)) {
        System.out.print(Character.toLowerCase(letter));
      }
      else if (Character.isLowerCase(letter)) {
        System.out.print(Character.toUpperCase(letter));
      }
      else {
        System.out.print(letter);
      }
    }
  }
}

class ReverseString {
  public static void main(String[] args) {
    String send;
    Boolean valid = false;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a sentence here, I'll give you it backwards!");
    send = in.nextLine();
    String back = new StringBuilder(send).reverse().toString();
    System.out.println(back);
  }
}
