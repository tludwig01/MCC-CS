class Divisors {
  public static void main(String[] args) {
    Scanner type = new Scanner(System.in);

    System.out.println("Enter an integer here: ");
    int perf = type.nextInt();
    System.out.println(perf + " is divisible by:");
    System.out.println("1");
    for (int i=2; i<=perf; i++) {
      if (perf % i == 0) {
        System.out.println(i);
      }
    }//end for loop
  }//end main
}//end Divisors class
