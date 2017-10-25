import java.util.*;

class Prime {
  public static void main(String[] args) {
    int amountPrime = 0;

    Scanner type = new Scanner(System.in);

      //USER INPUT RANGE TO FIND PRIMES
      System.out.println("Enter an integer here: ");
      int start = type.nextInt();
      System.out.println("Enter another integer greater than the first: ");
      int end = type.nextInt();
      System.out.println("Primes between " + start + " and " + end + " are: ");

      //LOOP FROM START VALUE TO END VALUE
      for (int i = start; i<end; i++ ) {
        boolean prime = true;
        //CHECK IF NUMBERS ARE PRIME
          for (int isPrime = 2; isPrime < i; isPrime++) {
            if (i % isPrime == 0) {
              prime = false;
            }
          }//end inner for loop
          //PRINT PRIMES IN RANGE and TOTAL AMOUNT OF PRIMES
          if (prime) {
            System.out.println(i); //LIST PRIMES IN RANGE
            amountPrime++; //COUNT AMOUNT OF PRIMES
          }
      }//end outer for loop
      System.out.println("There are " + amountPrime + " total primes in your range!");
      System.out.println("See ya later!");
  }//end main
}//end Prime class
