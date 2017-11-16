//Tim Ludwig
//Lab 6
//CSC 101

import java.util.*;

class LoopLabOne {
  public static void main(String[] args) {

    for (int tenPlus=10; tenPlus<20; tenPlus++) {
      System.out.print(" " + tenPlus);
    }
      System.out.println();

    for (int twentyPlus=20; twentyPlus<30; twentyPlus++) {
      System.out.print(" " + twentyPlus);
    }
      System.out.println();

    for (int thirtyPlus=30; thirtyPlus<40; thirtyPlus++ ) {
      System.out.print(" " + thirtyPlus);
    }
      System.out.println();

    for (int fortyPlus=40; fortyPlus<50; fortyPlus++) {
      System.out.print(" " + fortyPlus);
    }
    System.out.println();
  }//main method
}//LoopLabOne class


class PrimeNumber {
  public static void main(String[] args) {
    int primeCheck;
    boolean primeNumber = true;

    Scanner scanner = new Scanner(System.in);

      while (primeNumber = true) {
        System.out.println("Enter a number below: ");
        int primeTest = scanner.nextInt();

        for (int i=2; i<=primeTest/2; i++) {
          if (primeTest % i == 0) {
            primeCheck=primeTest%i;
              if (primeCheck == 0) {
                primeNumber = false;
              }
          }
        }//for loop end
        if (primeNumber) {
          System.out.println("Prime");
        }
        else {
          System.out.println("Not Prime");
        }//Boolean test and prime/not prime display
      }//end while loop
  }//main method
}//PrimeNumber class

class FibonacciNumbers {
  public static void main(String[] args) {
    int num=1, num2=1, num3=1;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to Fibonacci sequence. How many numbers to you wish to see: ");
    int count = scanner.nextInt();
    System.out.println("===============================");

    for ( int i=0; i<count; i++) {
      num3 = num + num2;
      num = num2;
      num2 = num3;
      System.out.print(num);
      System.out.println();
    }
  }//end main method
}//end FibonacciNumbers Class
