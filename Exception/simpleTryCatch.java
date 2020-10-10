import java.util.Scanner;
public class simpleTryCatch {
	public static void main(String args[]) {
	      int num1, num2;
	      try {
	         /* We suspect that this block of statement can throw 
	          * exception so we handled it by placing these statements
	          * inside try and handled the exception in catch block
	          */
	    	  Scanner sc=new Scanner(System.in);
	    	  System.out.println("Enter the numerator and denominator");
	         num1 = sc.nextInt();
	         num2 = sc.nextInt();
	         int res=num1/num2;
	         System.out.println("Hey I'm at the end of try block so no exception occured in the code");
	      }
	      catch (ArithmeticException e) { 
	         /* This block will only execute if any Arithmetic exception 
	          * occurs in try block
	          */
	         System.out.println("You should not divide a number by zero");
	      }
	      catch (Exception e) {
	         /* This is a generic Exception handler which means it can handle
	          * all the exceptions. This will execute if the exception is not
	          * handled by previous catch blocks.
	          */
	         System.out.println("Exception occurred");
	      }
	}
}
