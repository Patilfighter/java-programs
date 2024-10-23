package question4;
import java.util.*;
public class IsPalindrome {
	
	private String s;
	
	
    public IsPalindrome() {
    	
    }
    
    public IsPalindrome(String s) {
    	this.s = s;
    }
    
    
    public void setS(String s) {
		this.s = s;
	}
	
    
    public void getInput(Scanner input) {
    	
    	System.out.println("Enter the string");
    	this.setS(input.nextLine());
    	
    }
    
    
	public boolean check(){
    	 int front = 0;
    	 int last = this.s.length()-1;
    	 boolean flag = true;
    	 while(front < last) {
    		 if(this.s.charAt(front) != this.s.charAt(last)){
    			flag = false; 
    		 }
    		 front++;
    		 last--;
    	}
    	 return flag;
     }
}
