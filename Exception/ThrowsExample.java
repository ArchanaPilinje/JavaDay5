
import java.util.Scanner;
public class ThrowsExample {
	static void foo1() throws ArithmeticException{
		Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Two Numbers for divison");
		int m =sc.nextInt();
		int n = sc.nextInt();
		int res=m/n;
		System.out.println(res);
		sc.close();
	}
	 public static void main(String[] args) 
	    {   try {
	        foo1();
	    }
	    catch(ArithmeticException e) {
	    	System.out.println("Divide By zero Exception occured!");
	    }
			
	    } 
	
}