//Timothy Ludwig
//Lab 5
//CSC 101

import java.util.*;
import java.lang.*;
import java.text.*;

class BooleanPractice {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String gradeA = new String("A");
    String gradeB = new String("B");
    String gradeC = new String("C");
    String gradeD = new String("D");
    String gradeF = new String("F");

    int numericalGrade;

    System.out.println("Enter a numerical grade from 1-100 below: ");
    numericalGrade = scanner.nextInt();
    System.out.println("You've entered: " + numericalGrade);

    if (numericalGrade <= 100 && numericalGrade >= 90) {
      System.out.println("Your grade is: " + gradeA);
    } else if (numericalGrade <= 89 && numericalGrade >= 80) {
      System.out.println("Your grade is: " + gradeB);
    } else if (numericalGrade <= 79 && numericalGrade >= 70) {
      System.out.println("Your grade is: " + gradeC);
    } else if (numericalGrade <= 69 && numericalGrade >= 60) {
      System.out.println("Your grade is: " + gradeD);
    } else {
      System.out.println("Your grade is: " + gradeF);
    }
  }
}

class BooleanPracticeSwitch {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int grade;
    System.out.println("Enter a numerical grade between 1-100 below:");
    grade = scanner.nextInt();
    System.out.println("You've entered: " + grade);

    switch (grade)  {
      case 100:
      case 99:
      case 98:
      case 97:
      case 96:
      case 95:
      case 94:
      case 93:
      case 92:
      case 91:
      case 90:
        System.out.println("Your grade is: A");
        break;
      case 89:
      case 88:
      case 87:
      case 86:
      case 85:
      case 84:
      case 83:
      case 82:
      case 81:
      case 80:
        System.out.println("Your grade is: B");
        break;
      case 79:
      case 78:
      case 77:
      case 76:
      case 75:
      case 74:
      case 73:
      case 72:
      case 71:
      case 70:
        System.out.println("Your grade is: C");
        break;
      case 69:
      case 68:
      case 67:
      case 66:
      case 65:
      case 64:
      case 63:
      case 62:
      case 61:
      case 60:
        System.out.println("Your grade is: D");
        break;
      default:
        System.out.println("Your grade is: F");
    }
  }
}

class LeapYear {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int enterYear;

    System.out.println("Let's find whether a year is a leap year of not!");

    System.out.println("Enter a year below (e.g. 1876): ");

    enterYear = scanner.nextInt();
    System.out.println("You've entered the year: " + enterYear);

    if (enterYear % 100 != 0 && enterYear % 4 == 0) {
      System.out.println("That's a Leap Year!");
    } else if (enterYear % 100 == 0 && enterYear % 4 ==0 && enterYear % 400 == 0) {
      System.out.println("That's a Leap Year!");
    } else {
      System.out.println("That's a regular year!");
    }
  }
}

class MyJavaBurgers {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    DecimalFormat twoPlaces = new DecimalFormat("0.00");

    double baseWage = 7.25;
    double overtimeWages = 0, totalSales, finalSalary, commissionBonus = 0, hoursWorked = 0, overtimeHours = 0;


    System.out.println("Let's find out how much loot you've made this week...");
    System.out.println("How many hours did you work? Enter below: ");
    hoursWorked = scanner.nextInt();

    overtimeHours = hoursWorked - 40;

    System.out.println("Cool you've worked " + hoursWorked + " hours. Enter how much stuff you sold below (e.g. 74.52)");
    totalSales = scanner.nextDouble();

    System.out.println("Great, you've sold: $" + twoPlaces.format(totalSales));

    //OVERTIME HOUR CALCULATOR
    if (overtimeHours > 0) {
      overtimeWages = baseWage + (baseWage / 2);
      System.out.println("Whoa, you worked " + overtimeHours + " hour(s) overtime!");
    } else {
      System.out.println("No overtime this week!");
    }

    //SALES COMMISSION CALCULATOR
    if (totalSales >= 1.00 && totalSales <= 99.99) {
      commissionBonus = totalSales * 0.05;
      System.out.println("Your bonus this week is: $" + twoPlaces.format(commissionBonus));
    } else if (totalSales >= 100.00 && totalSales <= 299.99) {
      commissionBonus = totalSales * 0.10;
      System.out.println("Your bonus this week is: $" + twoPlaces.format(commissionBonus));
    } else if (totalSales >= 300.00) {
      commissionBonus = totalSales * 0.15;
      System.out.println("Your bonus this week is: $" + twoPlaces.format(commissionBonus));
    } else {
      System.out.println("YOU CAN'T ENTER NEGATIVE NUMBERS!");
    }

    //SALARY CALCULATOR
    if (overtimeHours == 0) {
      finalSalary = (hoursWorked * baseWage) + commissionBonus;
      System.out.println("This week your check is: $" + twoPlaces.format(finalSalary));
    } else if (overtimeHours > 0) {
      finalSalary = (overtimeHours * overtimeWages) + (hoursWorked * baseWage) + (commissionBonus);
      System.out.println("This week your check is: $" + twoPlaces.format(finalSalary));
    }

  }//end main
}//end class
