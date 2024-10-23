package assignment01;
import java.util.Scanner;
public class question01 {
   public static void main(String args[]) {
	  
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the first number");
	
	String input1 = input.nextLine();
	System.out.println("Enter the next number");

	String input2 = input.nextLine();
	
	boolean flag = isDouble(input1,input2);

	if(flag){
		double n1 = Double.parseDouble(input1);
		double n2 = Double.parseDouble(input2);
		System.out.println((n1+n2)/2);
	}
	else {
		System.out.println("Invalid input");
	}
	
	
  }
   
  static boolean isDouble(String s1, String s2) {
	   try {
		   Double.parseDouble(s1);
		   Double.parseDouble(s2);
		   return true;
	   }
	   catch(Exception e) {
		   return false;
	   }
   }
   
}
