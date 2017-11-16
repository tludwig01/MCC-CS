//Tim Ludwig
//Lab 8
//CSC 101

import java.util.*;

class PositiveInteger {
  public static void main(String[] args) {
    Scanner type = new Scanner(System.in);

    int num = 0;
    boolean valid = false;

    for (int i = 1; i < 6; i++) {
        System.out.println("Enter number " + i + ":");

          try {
            num = type.nextInt();

            if (num < 0) {
              throw new Exception("No negative numbers. Try again.");
            }
            valid = false;
          }

          catch (InputMismatchException e) {
            System.out.println("Not an integer. Try again.");
            type.next();
          }

          catch (Exception e) {
            System.out.println(e.getMessage());
            type.next();
          }
    }//for loop end

    int avg = num++ / 5;
    System.out.println("Your average is: " + avg);

  }//end main
}//end Class
