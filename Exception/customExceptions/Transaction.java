package customExceptions;

public class Transaction {
	float balance;
//	String userName="arch";
//	String password="1234";

	
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
		System.out.println("Initial Balance:"+balance);
	}
	
	void login(int count) throws InvalidCredentialsException{
		if(count==0) {
			throw new InvalidCredentialsException("Wrong credentials Entered") ;
		}
	}
	
	void deposit(float amount) throws NegativeAmountException{
		if(amount<0) {
			throw new NegativeAmountException("Negative Amount Exception");
		}
		balance+=amount;
		System.out.println("Deposited Amount:"+amount);
		System.out.println("New Balance after deposit:"+balance);
		
	}
	
	void withdraw(float amount) throws InsufficientFundsException{
		if(balance<amount) {
			throw new InsufficientFundsException("Insufficient Funds Encountered");
		}
		balance-=amount;
		System.out.println("Withdrawal Amount:"+amount);
		System.out.println("New Balance after withdrawal:"+balance);
	}
	
	void printBalance() {
		System.out.println("Final Balance:"+balance);
	}
	
	
	
}
