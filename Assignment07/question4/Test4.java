package question4;
import java.util.*;
public class Test4 {
   public static void main(String[] args) {
	      Scanner input = new Scanner(System.in);
	   IsPalindrome string = new IsPalindrome();
	   
	   string.getInput(input);
	   
	   if(string.check()) {
		   System.out.println("The input string is palindrome");
	   }
	   else {
		   System.out.println("The input string is not palindrome");
	   }
	   
	   
   }
   
   
}
