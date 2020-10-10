package customShape;

public class InvalidShapeException extends Exception {

	public InvalidShapeException() {
		
	}
	
	public InvalidShapeException(String errorMsg) {
		super(errorMsg);
	}
	
	@Override
	public void printStackTrace() {
		System.out.println("The stack trace contents are");
		super.printStackTrace();
	}
	
	
	public void printException() {
		System.out.println("Exception occured because the Shapes array contains different Shapes (Mixture of Circle and Square)");
	}
}
