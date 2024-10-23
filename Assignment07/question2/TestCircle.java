package question2;
import question2.exception.*;
import java.util.Scanner;
public class TestCircle {
	public static void main(String[] args) {
		
		Circle circle = new Circle();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the diamater");
		 
		 try{circle.setDiameter(input.nextDouble());
		 }
		 catch(Exception e) {
			   e.printStackTrace();
		 }
		circle.getCenter();
		circle.displayDiamater();
	}

}
