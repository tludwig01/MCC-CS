import java.util.*;
import java.lang.*;

class ProblemOne {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter an integer below: ");
    int intOne = scanner.nextInt();
    System.out.println("Enter a second integer below: ");
    int intTwo = scanner.nextInt();

    int higher = larger(intOne, intTwo);
    System.out.println("Larger number is: " + higher);

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

  public static double estimateAdd(double first, double second) {
    int add = first + second;
    return add;
  }//end estimateAdd

  public static int estimateSubtract(int first, int second)  {
    int subtract = first - second;
    return subtract;
  }//end estimateSubtract

}//end class

class EstimateMathMain {
  public static void main(String[] args) {
    System.out.println(EstimateMath.estimateAdd(32, 26));
  }
}
