package driving;
import driving.DrivingCost;
import java.util.*;
public class DrivingTest {
	
	  static Scanner input = new Scanner(System.in);
  public static void main(String arsg[]) {
	  
	 ArrayList <DrivingCost> list = new ArrayList<>();
	  
	  int choice;
	  while((choice = menu())!= 4) {
		  
		  
		  switch(choice) {
		   
		  case 1:
			  DrivingCost cost = new DrivingCost();
			  cost.accept();
			  list.add(cost);
			  break;
	     
		  case 2:
			 System.out.println("Enter the driver id for which you want to get driving details");
			 boolean flag = false;
			  int id = input.nextInt();
			  for(DrivingCost i : list) {
				  if(i.getId() == id) {
					 i.display();
					 flag = true;
					 break;
				  }
			  }
			  if(!flag) {
				  System.out.println("Invalid id");}
			  break;
			   
		  case 3:
			  System.out.println("Enter the driver id for which you want to get driving cost");
			  int idn = input.nextInt();
			  boolean flag1 = false;
			  for(DrivingCost i : list) {
				  if(i.getId() == idn) {
					System.out.println("The driving cost is: " + i.calculateDrivingCost());
					flag1 = true;
					 break;
				  }
			  }
			  if(!flag1) {
			  System.out.println("Invalid id");}
			  break;
			  
		  default:
			  System.out.println("You Entered wrong choice");
			  break;
		  
		  
		  }
	  }
	  
  }
  
  static int menu() {
	  System.out.println("Enter 1 to give input for all fields");
	  System.out.println("Enter 2 to show all entered detais");
	  System.out.println("Enter 3 to calcualte the driving cost per day");
	  System.out.println("Enter 4 to terminate the program");
	  int choice = input.nextInt();
	  return choice;
	
  }
  
}
