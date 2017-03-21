/**
 * Homework 1 for CSC-281.001 Spring 2017
 * 
 * Your codename:
 * 
 * This assignment consists of 7 problems. Problem 1 asks you to modify existing
 * code for three subproblems.The remaining six problems each require you to 
 * write a method that satisfies the requirements stated in their descriptions.
 * 
 * You are required to create a javadoc style comment for each method you
 * create. See the sample method named add3 for an example to follow. 
 * 
 * Your homework will be graded in the following manner:
 * 70 points for correctness.
 * 		10 points per problem.
 * 		Does your input match the expected output exactly?
 * 30 points for following standards. Evaluation considerations for these points:
 *		Did you use vi to craft your code?
 *		Are camel case and Pascal case used correctly?
 * 		Did you follow the the submission instructions properly?
 */

import java.math.*; // math has been imported for you

public class Homework1 {

  /**
   * The entry point for the program.
   * 
   * @param args Commandline input arugments.
   */
  public static void main(String[] args) {
    Homework1 hw1 = new Homework1();
    System.out.println("===Problem 1===");
    hw1.problem1();
/**  
   * PROBLEM 1 // can run, but get compile errors 
   * Change the expressions in the variable assignments so the program prints "successfully
   * completed!". This may involve changing the arithmetic operators or the type of number that is
   * produced.
   */  
    public void problem1() {
    double result1 = 5.0 / 4.0;
    System.out.println(result1);
    if (result1 == 1.25) {
      System.out.println("Problem 1a: successfully completed!");
    } else {
      System.out.println("Problem 1a: not quite right.");
    }

    double result2 = Math.pow(4,2);
    if (result2 == 16) {
      System.out.println("Problem 1b: successfully completed!");
    } else {
      System.out.println("Problem 1b: not quite right.");
    }

    String strA = new String("foo");
    String strB = new String("foo");
    if (strA.equals(strB)) { // this boolean expression is fair game as long as it involves both strings
      System.out.println("Problem 1c: successfully completed!");
    } else {
      System.out.println("Problem 1c: not quite right.");
    }
  }

    System.out.println("===Problem 2===");
}
}

  /*
   * PROBLEM 2
   *
   * When a double or float is cast into an integer via (int), the fractional part of the number
   * after that decimal place is thrown away (e.g. 3.3 becomes 3). An example: int x = (int)3.3;
   * 
   * 1) Write a method called "topInt" that takes a double as a parameter and returns an int that
   * is rounded up from the double instead of being rounded down.
   *
   * For example, 4.5 would become 5 (the lack of a decimal point after 5 is important). Take care
   * that your method does not round up numbers with no fractions (i.e. 5.0 should not be rounded
   * up to 6.0).
   *
   * Hint: use a method in the math package that we covered in class.
   * 
   * Your method will be ran with the following input: 1.5 5.1 1.0 -4.2
   */

    // Uncomment to print the results of calling your topInt method with the following input:
     public int topInt(double d){ //@param x 
     return Math.ceil(d);    // @return the next biggest integer
     }

 // define function called topInt(x) @param double x

     // topInt(x) = Math.ceil(x); //Returns the closest int to the argument
      System.out.println(hw1.topInt(5.1));
      System.out.println(hw1.topInt(5.1));
      System.out.println(hw1.topInt(1.0));
      System.out.println(hw1.topInt(-4.2));
   
}
    System.out.println("===Problem 3===");

  /*
   * PROBLEM 3
   * 
   * 1) Declare a method named "draw4x4" that prints a 4 by 4 box of a character. This character
   * should be defined by the first parameter of the method. This parameter should be of the char
   * data type. The output of this method is the printed box. This means there will be no return
   * statement in this method.
   *
   * Here is what the output of draw4x4('x') should look like: 
   * xxxx
   * x  x
   * x  x
   * xxxx
   *
   * Your method will be ran with the following input: '-' '4'
   */
    // Uncomment to print the results of calling your draw4x4 method with the following input:
    // hw1.draw4x4('-');
    // hw1.draw4x4('4');

    System.out.println("===Problem 4===");
    // Uncomment to print the results of calling your citationName method with the following input:
  /*
   * PROBLEM 4
   * 
   * 1) Write a method named "citationName" that takes two String parameters: a first name and a
   * last name. It should return a String that contains the last name concatenated with a comma, a
   * space, the first letter of the first name, and a period.
   *
   * This example: citationName("Jack", "Beatty") should return: "Beatty, J."
   *
   * Your method will be ran with the following input: "Alastair" "Reynolds", "Grace" "Hopper"
   */
    public String ( string a, string b);
    public void citationName(string a, string b){  // @param string a, string b
      System.out.println(String b "," string a[0]);  
    System.out.println(hw1.citationName("Alastair","Reynolds"));
    System.out.println(hw1.citationName("Grace","Hopper"));
}
     
    
    System.out.println("===Problem 5===");
}
  /*
   * PROBLEM 5
   * 
   * 1) Write a method named "min3" that takes 3 doubles as parameters and returns the lowest
   * value of the three.
   *
   * Print what your min3 method returns for the following triples of doubles as input: 1.0 2.0             * 3.0, 4.0 3.0 2.0, 0.5 0.1 0.5*/
      public static double min ( double a, double b, double c)
      {
         double m = 0;

         if ( a < b and a < c);
         {
            m = a;    // a is the smallest value          
         }
         if (b < a and b < c){
	    m = b;
            }
         else
         {
            m = b;    // b is the smaller value
         }

         return(m);   // Return value of the method
      }
   }
    // Uncomment to print the results of calling your min3 method with the following input:
    System.out.println(String.valueOf(hw1.min3(1.0, 2.0, 3.0)));
    System.out.println(String.valueOf(hw1.min3(4.0, 3.0, 2.0)));
    System.out.println(String.valueOf(hw1.min3(0.5, 0.1, 0.5)));
    
    System.out.println("===Problem 6===");
 /*
   * PROBLEM 6
   * 1) Write a method named fibonacci that calculates
   * Fibonacci numbers: http://en.wikipedia.org/wiki/Fibonacci_number
   *
   * Your fib	onacci method should have a single int as its only parameter. It should return
   * the fibonacci number as in int.
   *
   * Assume the seed values of F(0) = 1 and F(1) = 1.
   *
   * This method should use recursion which means the method should call itself. 
   *
   * Your method will be ran on following input: 0,1,2,3,10,25
   */
    // Uncomment to print the results of calling your fibonacci method with the following input:
<<<<<<< HEAD
    static int n1=0,n2=1,n3=0;     
    static void printFibonacci(int count){  //@param count    
      if(count>0){    
         n3 = n1 + n2;    
         n1 = n2;    
         n2 = n3;    
         System.out.print(" "+n3);   
         printFibonacci(count-1);    
     }    
   }    
   public static void main(String args[]){    
   int count=10;    
   System.out.print(n1+" "+n2);//printing 0 and 1    
   printFibonacci(count-2);//n-2 because 2 numbers are already printed   
=======
    static int n1=0,n2=1,n3=0; ¬†¬†¬†¬†
    static void printFibonacci(int count){  //@param count¬†¬†¬†¬†
¬†¬†¬†¬†  if(count>0){¬†¬†¬†¬†
¬†¬†¬†¬†¬†¬†¬†¬†¬†n3 = n1 + n2;¬†¬†¬†¬†
¬†¬†¬†¬†¬†¬†¬†¬†¬†n1 = n2;¬†¬†¬†¬†
¬†¬†¬†¬†¬†¬†¬†¬†¬†n2 = n3;¬†¬†¬†¬†
¬†¬†¬†¬†¬†¬†¬†¬†¬†System.out.print(" "+n3);¬†¬†¬†
¬†¬†¬†¬†¬†¬†¬†¬†¬†printFibonacci(count-1);¬†¬†¬†¬†
¬†¬†¬†¬†¬†}¬†¬†¬†¬†
   }¬†¬†¬†¬†
   public static void main(String args[]){¬†¬†¬†¬†
¬† ¬†int count=10;¬†¬†¬†¬†
¬† ¬†System.out.print(n1+" "+n2);//printing 0 and 1¬†¬†¬†¬†
¬† ¬†printFibonacci(count-2);//n-2 because 2 numbers are already printed¬†¬†¬†
>>>>>>> fc87cc41066d012e6b97e826303f9e629d65ee80

   System.out.println(hw1.fibonacci(0));
   System.out.println(hw1.fibonacci(1));
   System.out.println(hw1.fibonacci(2));
   System.out.println(hw1.fibonacci(3));
   System.out.println(hw1.fibonacci(10));
   System.out.println(hw1.fibonacci(25));
 }
<<<<<<< HEAD
  
=======
¬†¬†
>>>>>>> fc87cc41066d012e6b97e826303f9e629d65ee80

    
    
    System.out.println("===Problem 7===");
 /* PROMBLEM 7
   * A palindrome is where a word or sentence is spelled the same
   * forward as it is backward. For example, "pop" is a palindrome where "cat" is not. The sentence
   * "Was it a car or a cat I saw" is a palindrome when the spaces are extracted and it is converted
   * to all lowercase letters.
   *
   * 1) Write a method named "isPalindrome" that takes a single String parameter. It should return
   * the boolean value of true if the string is a palindrome or false if it is not.
   *
   * Your method is only expected to run correctly on input consisting only of lowercase strings.
   *
   * Your method will be ran on the following input:
   * "racecar"
   * "cat"
   * "hannah"
   * "saippuakivikauppias"
   * 
   * hint: build a string that is the reverse of the input
   */
   import java.util.Scanner;

public class FindAllPalindromes {
static String longestPalindrome;
public String oldPalindrome="";
static int longest;

<<<<<<< HEAD
public void allSubstrings(String s){        
    for(int i=0;i<s.length();i++){
        for(int j=1;j<=s.length()-i;j++){
            String subString=s.substring(i, i+j);  
           isPalindrome(subString);             
        }
public void isPalindrome(String sub){
    System.out.println("String to b checked is "+sub);
    StringBuilder sb=new StringBuilder();
    sb.append(sub);     // append string to string builder 
    sb.reverse();        
    if(sub.equals(sb.toString())){                        // palindrome condition 
        System.out.println("the given String :"+sub+" is a palindrome");
        longestPalindrome(sub);
    }
    else{
        System.out.println("the string "+sub+"iss not a palindrome");
=======
public void allSubstrings(String s){¬†¬†¬†¬†¬†¬†¬†¬†
¬†¬†¬†¬†for(int i=0;i<s.length();i++){
¬†¬†¬†¬†¬†¬†¬†¬†for(int j=1;j<=s.length()-i;j++){
¬†¬†¬†¬†¬†¬†¬†¬†¬†¬†¬†¬†String subString=s.substring(i, i+j);¬†¬†
¬†¬†¬†¬†¬†¬†¬†¬†¬†¬†¬†isPalindrome(subString);¬†¬†¬†¬†¬†¬†¬†¬†¬†¬†¬†¬†¬†
¬†¬†¬†¬†¬†¬†¬†¬†}
public void isPalindrome(String sub){
¬†¬†¬†¬†System.out.println("String to b checked is "+sub);
¬†¬†¬†¬†StringBuilder sb=new StringBuilder();
¬†¬†¬†¬†sb.append(sub);¬†¬†¬†¬†¬†// append string to string builder 
¬†¬†¬†¬†sb.reverse();¬†¬†¬†¬†¬†¬†¬†¬†
¬†¬†¬†¬†if(sub.equals(sb.toString())){¬†¬†¬†¬†¬†¬†¬†¬†¬†¬†¬†¬†¬†¬†¬†¬†¬†¬†¬†¬†¬†¬†¬†¬†// palindrome condition 
¬†¬†¬†¬†¬†¬†¬†¬†System.out.println("the given String :"+sub+" is a palindrome");
¬†¬†¬†¬†¬†¬†¬†¬†longestPalindrome(sub);
¬†¬†¬†¬†}
¬†¬†¬†¬†else{
¬†¬†¬†¬†¬†¬†¬†¬†System.out.println("the string "+sub+"iss not a palindrome");
>>>>>>> fc87cc41066d012e6b97e826303f9e629d65ee80
}


}
  // Uncomment to print the results of calling your isPalindrome method with the following input:
    System.out.println(hw1.isPalindrome("racecar"));
    System.out.println(hw1.isPalindrome("cat"));
    System.out.println(hw1.isPalindrome("hannah"));
    System.out.println(hw1.isPalindrome("saippuakivikauppias"));
  }

  /**
   * (This is an example of a javadoc comment. All of your methods should have a similar comment.) 
   * This method adds three numbers together and returns
   * their sum.
   * 
   * @param x The first number to sum.
   * @param y The second number to sum.
   * @param z The third number to sum.
   * @return The sum of x, y, and z.
   */
 // public double add3(double x, double y, double z) {
   // return x + y + z;
  }


}
<<<<<<< HEAD
=======

>>>>>>> fc87cc41066d012e6b97e826303f9e629d65ee80
