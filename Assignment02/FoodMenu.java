package com.company;
import java.util.*;
public class FoodMenu {
	
	
	static Scanner input = new Scanner(System.in);
	static int sQty;
	static int dQty;
	static int iQty;
	public static void main(String[] args) {
		
		int choice;
		
		while((choice = menu())!= 0) {
			
			switch(choice) {
			case 1:
				System.out.println("Enter the quantity of samosa");
				sQty= input.nextInt();
				break;
				
			case 2:	
				System.out.println("Enter the quantity of Dosa");
				dQty = input.nextInt();
				break;
				
			case 3:
				System.out.println("Enter the quantity of Idli");
				iQty = input.nextInt();
				break;
				
				
			case 4:
				
				System.out.println("The bill is "+ calculateBill());
				System.out.println("***************************************");
				
			default:
				System.out.println("Invalid choice");
				
			}
			
		}
		
		
      
	}
	
	
	static int menu() {
		System.out.println("Enter 0 to terminate the program");
		System.out.println("Enter 1 for Samosa: ");
		System.out.println("Enter 2 for Dosa: ");
		System.out.println("Enter 3 for Idli: ");
		System.out.println("Enter 4 to Generate Bill");
		int choice = input.nextInt();
		return choice;
		
	}
	
	
	static int calculateBill() {
		return 15*sQty+ 30*dQty + 10*iQty;
		
	}
	

}
