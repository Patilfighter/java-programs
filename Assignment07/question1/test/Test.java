package question1.test;
import question1.exception.*;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		try{read(input);
		}
		catch (Throwable e){
			e.printStackTrace();
		}
         System.out.println("Hii i am end");
	}
	
	static public void read(Scanner input) throws ExceptionLineToLong {
		System.out.println("Enter the String");
		String s = input.nextLine();
		if(s.length()> 5) {
			throw new ExceptionLineToLong();
		}
	}

}
