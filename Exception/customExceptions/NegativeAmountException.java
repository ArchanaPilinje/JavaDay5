package customExceptions;

public class NegativeAmountException extends Exception {
  
	public NegativeAmountException() {
		
	}
	
	public NegativeAmountException(String errorMsg) {
		super(errorMsg);
	}

	@Override
	public void printStackTrace() {
		System.out.println("The stack trace contents are");
		super.printStackTrace();
	}
	
	
	public void printException() {
		System.out.println("Exception occured because negative amount entered for deposit");
	}
	
	
	
}
