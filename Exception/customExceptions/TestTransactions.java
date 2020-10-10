package customExceptions;
import java.util.Scanner;
public class TestTransactions {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Transaction t=new Transaction();
		int totalAttempts=3;
		while(totalAttempts!=0) {
			System.out.println("Enter your login credentials");
			String userName = "arch";
			String password = "1234";
			String u = sc.nextLine();
			String p = sc.nextLine();
			if (u.equals(userName) && p.equals(password)) {
				System.out.println("Login Correct! Yoy have entered the system");
				break;
			} else {
				System.out.println("Login Incorrect");
				totalAttempts--;
			}
		}
		try {
		t.login(totalAttempts);
		System.out.println("Enter the initial balance");
		float amt=sc.nextFloat();
		t.setBalance(amt);
		int flag;
		do {
		System.out.println("1.Deposit   2.Withdrawal  3.Balance");
		int ch=sc.nextInt();
		switch(ch) {
		case 1: System.out.println("Enter the amount to be deposited");
		        float d=sc.nextFloat();
		        t.deposit(d);
		        break;
		        
		case 2:System.out.println("Enter the amount to be withdrawn");
				float w=sc.nextFloat();
				t.withdraw(w);
				break;
				
		case 3: t.printBalance();

		}

		System.out.println("Press the Corresponding option:\n1.Continue 0. Exit");
		flag = sc.nextInt();
		}
		while(flag==1);
		}
		catch(InvalidCredentialsException e) {
			e.printException();
		}
		catch(NegativeAmountException e) {
			e.printException();
		}
		catch(InsufficientFundsException e) {
			e.printException();
		}

	}

}
