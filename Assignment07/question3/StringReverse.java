package question3;
import java.util.Scanner;
public class StringReverse {
      private String string;

      public StringReverse() {
    	  
      }
      
      public StringReverse(String string) {
  		this.string = string;
  	}
        
      
	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public void accept(Scanner input) {
		
		System.out.println("Enter the string to reverse");
		this.setString(input.nextLine());
	}
	
	public String reverse() {
		 
		   String s ="";
		   int index = string.length()-1;
		   while(index >= 0) {
			   s += this.string.charAt(index);
			   index--;
		   }
		   return s;
		
	}
	
}
