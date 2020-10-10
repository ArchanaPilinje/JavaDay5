package customExceptions;

public class InsufficientFundsException extends Exception {

	
	public InsufficientFundsException(){
		
	}
	
	public InsufficientFundsException(String errorMsg) {
		super(errorMsg);
	}
	
	@Override
	public void printStackTrace() {
		System.out.println("The stack trace contents are");
		super.printStackTrace();
	}
	
	
	public void printException() {
		System.out.println("Exception occured because insufficient funds in the customer account");
	}
	
	
}
