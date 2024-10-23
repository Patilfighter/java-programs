package tester;
import com.app.geometry.*;
import java.util.Scanner;

public class TestPointArray1 {
	static Scanner input = new Scanner(System.in);
	public static void main(String args[]) {
		
		
		System.out.println("How many points do you want to point?");
		
		int no = input.nextInt();
		
        Point2D[] arr = new Point2D[no];
        for(int i = 0; i < no; i++) {
        	arr[i] = new Point2D();
        	arr[i].accept();
        }

        int choice = 0;
        while((choice = menu()) != 4) {
        	switch (choice) {
        	case 1:
        		displaySpecificPoint(arr);
        		break;
        		
        	case 2:
        		displayAllPoint(arr);
        	    break;
        	    
        	case 3:
        		displaySpecificPointDistance(arr);
        		break;
        		
        	default:
        		System.out.println("Invalid input");
        		break;
        	}
        }
		
	}
	
	public static int menu(){
	
	 System.out.println("Press 1. To Display details of a specific point");
	 System.out.println("Press 2. To x, y Coordinates of all points");
	 System.out.println("Press 3. To Validate the 2 Given points");
	 System.out.println("Press 4. To terminate the program");
	 
		int choice = input.nextInt();
		return choice;
	}
	
	public static void displaySpecificPoint(Point2D[] p) {
		
		   System.out.println("Enter the index of point you want to get");
		   int index = input.nextInt();
		   
		   if(index > 0 && index <= p.length) {
			   for(int i = 1; i <= p.length; i++ ) {
				   
			         if(index == i) {
			        	System.out.println( p[i-1].getDetails());
			        	 return;
			         }
				   
			    }
		   }
		   else {
			   System.out.println("Invalid index");
		    
		  }
	}
	
	public static void displayAllPoint(Point2D[] p) {
		
		  
		    for(int i = 0; i < p.length; i++ ) {
			   System.out.println("The details of "+ i + " is " +p[i].getDetails());
			   System.out.println("********************");
		    }
	}
	
	
	public static void displaySpecificPointDistance(Point2D[] p) {
		
		   System.out.println("Enter the index of 1st point you want to get");
		   int index1 = input.nextInt();
		   System.out.println("Enter the index of 2nd point you want to get");
		   int index2 = input.nextInt();
		   
		   if(index1 <= 0 || index1 > p.length) {
			   System.out.println("Invalid index");
			   return;
		   }
		    
		   else {
		    for(int i = 1; i <= p.length; i++ ) {
			     if(index2 == i) {
			    	System.out.println( p[i-1].getDetails());
			     }
		         if(index1 == i) {
		        	System.out.println(p[i-1].getDetails());
		         }
			   
		    }
		    
		  }
		 if(index1 > 0 && index1 <= p.length) {
		   if(p[index1-1].isEqualTo(p[index2-1].getX(), p[index2-1].getY())) {
			   System.out.println("The two points are equal");
		   }
		   else {
			  System.out.println("The distance between two point is: " + (float)p[index1-1].CalculateDistance(p[index2-1].getX(), p[index2-1].getY()));
		   }
		 }
	}
}
