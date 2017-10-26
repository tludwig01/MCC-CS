import java.util.*;

class Perfect {
  public static void main(String[] args) {
    Scanner type = new Scanner(System.in);
    boolean positive = true; //MAINTAINING POSITIVE INTEGER USER INPUT TO KEEP PROGRAM RUNNING UNTIL USER ENTERES NEGATIVE

    System.out.println("Let's find some perfect numbers!");

    //KEEPS THE PROGRAM RUNNING AS LONG AS NUMBER ENTEREDT IS POSITIVE
    while (positive == true) {
      int sum = 0;
      System.out.println("Enter an integer here: ");
      int perf = type.nextInt();
      //FOR LOOP SOLVING WHETHER NUMBER IS PERFECT OR NOT
        for (int i = 1; i < perf; i++) {
          if (perf % i ==0) {
            sum = sum + i;
          }
        }//end for loop
        //PERFECT OR IMPERFECT NUMBER STATEMENT
          if (sum == perf) {
            System.out.println(perf + " is a perfect number.");
          } else if (perf < 0) {
            //PROGRAM EXIT CONDITION, BREAKS OUT OF WHILE LOOP
            positive = false;
            System.out.println("Negative number entered. Thanks for playing, byeeeee!");
          }
          else {
            System.out.println(perf + " is not a perfect number.");
          }
    }//end while loop
  }//end main
}//end Perfect class
