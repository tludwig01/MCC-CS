// LAB 2

class Goodbye {
   public static void main(String [] args)   {

   String message;
   message = "Before I say goodbye to this cruel world, a couple notes to make..."; // Goodbye message

   String name;
   name = "Timothy P. Ludwig"; // Name variable
   
   int age;
   age = 27; // Age set
   
   double gpa = 4.0; // GPA set
   
   boolean male = true;// I am male
   
   boolean female = false; // I am not female

   String nameBlurb;
   nameBlurb = "My name is " + name + " , I am " + age + " years old. I have a " + gpa + " GPA.";

   System.out.println(message);
   System.out.println(nameBlurb);
   System.out.println(male); // Sex test for true boolean value   
   System.out.println(female); // Sex test for false boolean value
   System.out.println(name); // for good measure



   }// close main
} // close class
