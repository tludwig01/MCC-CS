import java.util.*;

class Perfect {
  public static void main(String[] args) {
    Scanner type = new Scanner(System.in);

    boolean positive = true;
    int sum = 0;

    System.out.println("Let's find some perfect numbers!");

    while (positive == true) {
      System.out.println("Enter an integer here: ");
      int perf = type.nextInt();

      if (perf <= 0) {
        System.out.println("Thanks for playing. See you next time.");
        positive = false;
      }
      else {
        for (int i = 1; i < perf; i++) {
          if (perf % i ==0) {
            sum = sum + i;
          }
        }//end for loop
          if (sum == perf) {
            System.out.println(perf + " is a perfect number.");
          }
          else {
            System.out.println(perf + " is not a perfect number.");
          }
      }
    }//end while loop
  }//end main
}//end Perfect class

class Divisors {
  public static void main(String[] args) {
    Scanner type = new Scanner(System.in);

    System.out.println("Enter an integer here: ");
    int perf = type.nextInt();
    System.out.println(perf + " is divisible by: 1, " );
    for (int i=2; i<=perf; i++) {
      if (perf % i == 0) {
        System.out.print(i);
      }
    }//end for loop
  }//end main
}//end Divisors class
