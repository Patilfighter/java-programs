package question2.exception;

public class NegativeDiamaterException extends Exception{

	public NegativeDiamaterException() {
		
	}
	
	@Override
	 public void printStackTrace() {
		System.out.println("InvalidDiamaterException");
	}


}
