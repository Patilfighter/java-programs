package Tester;
import com.app.geometry.Point2D;

import java.util.Scanner;

public class TestPoint {
	
	
  public static void main(String args[]) {
	  
	  Scanner input = new Scanner(System.in);
	  
	  Point2D p1= new Point2D();
	  Point2D p2 = new Point2D();
	  
	  System.out.println("Enter the point");
	  
	  p1.accept();
	  p1.getDetails();
	  System.out.println("--------------------------------");
	  p2.accept();
	  p2.getDetails();
	  
	  if(p1.isEqualTo(p2.getX(), p2.getY())) {
		  System.out.println("Two points are equal");
	  }
	  else {
		  System.out.println("The distance between two point is: " + p1.CalculateDistance(p2.getX(),p2.getY()));
	  }
	  
  	  
	  
  }
}
