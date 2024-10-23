package entity;
import java.util.Scanner;
public class Employee {

	private String firstName;
	private String lastName;
	private int ssn;
	
	
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName, int ssn) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}
	
	
	
	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public int getSsn() {
		return ssn;
	}




	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
     
	public void accept(Scanner input) {
		System.out.println("Enter the first name");
		this.setFirstName(input.next());
		
		System.out.println("Enter the last name");
		this.setLastName(input.next());
		
		System.out.println("Enter the first SSN");
		this.setSsn(input.nextInt());
	}
	
	public void display() {
		System.out.println("Fist name is: " + this.getFirstName());
		System.out.println("Last name is: " + this.getLastName());
		System.out.println("SSN is: " + this.getSsn());
	}
	
	public double calculateSalary() {
		return 0;
	}
	
}
