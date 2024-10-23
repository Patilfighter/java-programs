package assignment.questions;

import java.util.Scanner;

public class InvoiceTest {
	
	
   public static void main(String[] args) {
	   
	    Scanner input = new Scanner(System.in);
	   
	   Invoice inv = new Invoice();
	   
	   inv.accept();
	   inv.display();
	   
	   System.out.println("The bill amount is: " + (float)inv.calculateBill());
        
	   
   }
	
}


class Invoice{
	
	private String pNumber;
	private String pDescription;
	private int pQty;
	private double pricePerItem;
	Scanner input = new Scanner(System.in);
	
	public String getpNumber() {
		return this.pNumber;
	}

	public void setpNumber(String pNumber) {
		this.pNumber = pNumber;
	}

	public String getpDescription() {
		return this.pDescription;
	}

	public void setpDescription(String pDescription) {
		this.pDescription = pDescription;
	}

	public int getpQty() {
		return this.pQty;
	}

	public void setpQty(int pQty) {
		this.pQty = pQty;
	}

	public double getPricePerItem() {
		return this.pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}

    
	public void accept() {
		
		   
		   System.out.println("Enter the product number");
	        this.setpNumber(input.nextLine());	
	        
	        System.out.println("Enter the product Description");
	        this.setpDescription(input.nextLine());
	        
	        System.out.println("Enter the product quantity");
	        this.setpQty(input.nextInt());
	        
	        System.out.println("Enter the price per item");
	        this.setPricePerItem(input.nextDouble());
	        
	       
	        
	}
	
	public void display() {
		
		   
		   System.out.println("The product number is ");
	        System.out.println(this.getpNumber());
	        
	        System.out.println("The product Description is ");
	        System.out.println( this.getpDescription());
	       
	        
	        System.out.println("The product quantity is ");
	        System.out.println(this.getpQty());
	        
	        System.out.println("The price per item");
	        System.out.println(this.getPricePerItem());
	        
		
		
	}
	Invoice(){
		pNumber = "p101";
		pDescription = "Screw Driver";
		pQty = 0;
		pricePerItem = 22.13;
	}

	public Invoice(String pNumber, String pDescription, int pQty, double pricePerItem) {
		super();
		this.pNumber = pNumber;
		this.pDescription = pDescription;
		this.pQty = pQty;
		this.pricePerItem = pricePerItem;
	}
	
	
	public double calculateBill(){
		double bill = 0;
		if(pQty >0 && pricePerItem > 0) {
			bill = (pricePerItem * pQty);
			return bill;
			
		}
		return 0;
		
	}
	
}