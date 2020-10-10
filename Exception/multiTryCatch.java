import java.util.Scanner;

public class multiTryCatch {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the 2 number x and y");
			 int num1 = sc.nextInt();
	        int num2 = sc.nextInt();
	         int res=num1/num2;
	         System.out.println("Division of x and y is:"+res);
	         
	         int[] a=new int[5];
	         System.out.println("Enter the index and the value of the array ( index from 0-5)");
	         int index=sc.nextInt();
	         int val=sc.nextInt();
	         a[index]=val;
	         
	         System.out.println("Hey I'm at the end of try block so no exception occured in the code");
	         
		} catch (ArithmeticException e) {
			System.out.println("Exception:Divide by zero not allowed!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception:Index values from 0 to 5!");
		} catch (Exception e) {
			System.out.println("Some Exception occured!");
		}
		
		finally {
			System.out.println("Congratulations finally block executed");
		}
	}

}
