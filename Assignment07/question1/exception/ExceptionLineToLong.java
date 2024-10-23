package question1.exception;

public class ExceptionLineToLong extends Throwable {
	
          public ExceptionLineToLong() {
        	  
          }
          @Override
          public void printStackTrace() {
        	  System.out.println("ExceptionLineTooLong");
          }

}
