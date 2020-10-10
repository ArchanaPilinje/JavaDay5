package customExceptions;

public class InvalidCredentialsException extends Exception {

	public InvalidCredentialsException() {
		
	}
	
	public InvalidCredentialsException(String errorMsg) {
		super(errorMsg);
	}
	
	@Override
	public void printStackTrace() {
		System.out.println("The stack trace contents are");
		super.printStackTrace();
	}
	
	
	public void printException() {
		System.out.println("You are locked out of the system since you entered wrong credentials 3 times!");
	}
}
