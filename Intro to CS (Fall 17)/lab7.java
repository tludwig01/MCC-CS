import java.util.*;
import java.lang.*;

class ProblemOne {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean nonzero = true;

    while (nonzero == true) {
      System.out.println("Enter an integer below: ");
      int intOne = scanner.nextInt();
      System.out.println("Enter a second integer below: ");
      int intTwo = scanner.nextInt();

      int higher = larger(Math.abs(intOne), Math.abs(intTwo));

      System.out.println("Making these values absolue, you chose " + Math.abs(intOne) + " and " + Math.abs(intTwo));

      System.out.println("Larger number is: " + higher);

      if (intOne == 0 && intTwo ==0) {
        nonzero = false;
        System.out.println("Thanks for playing. Exiting program.");
      }
    }
  }//end main

  public static int larger(int intOne, int intTwo) {
    if (intOne > intTwo && intOne != intTwo) {
      return intOne;
    } else {
      return intTwo;
    }
  }//end larger

}//end class

class EstimateMath {

  public static int estimateAdd(int first, int second) {
    first = ((first + 5) / 10) * 10;
    second = ((second + 5) / 10) * 10;
    int add = first + second;
    return add;
  }//end estimateAdd

  public static int estimateSubtract(int first, int second)  {
    first = ((first + 5) / 10) * 10;
    second = ((second + 5) / 10) * 10;
    int subtract = first - second;
    return subtract;
  }//end estimateSubtract

}//end class

class EstimateMathMain {
  public static void main(String[] args) {
    Scanner type = new Scanner(System.in);
    boolean nonzero = true;

    while (nonzero == true) {
      System.out.println("Enter an integer: ");
      int first = type.nextInt();
      System.out.println("Enter another ineger: ");
      int second = type.nextInt();
      System.out.println("In our new weird Math system, the sum is: ");
      System.out.println(EstimateMath.estimateAdd(first, second));
      System.out.println("In our new weird Math system, the difference is: ");
      System.out.println(EstimateMath.estimateSubtract(first, second));

      if(first == 0 && second == 0) {
        nonzero = false;
        System.out.println("Thanks. Exiting program.");
      }
    }//end while loop
  }//end main
}//end EstimateMathMain class

//PREDICTED 11, 14, 7, 17... Not quite right, but on the right track?
class ConfuseStudents {
  public static void main(String[] args) {
    int cherry = 12;
    int orange = 9;
    int grape = 5;
    int banana = 8;

    swapit(grape, orange);

    System.out.println(swapit(orange, cherry));
    System.out.println(swapit(cherry, grape)); //WHY IS BANANA BEING PRINTED?!?!
    System.out.println(banana);
  }

  public static int swapit( int apple, int cherry) {

    int banana = apple + cherry;
    cherry = cherry + 2;
    System.out.println(cherry);

    return banana;
  }
}
