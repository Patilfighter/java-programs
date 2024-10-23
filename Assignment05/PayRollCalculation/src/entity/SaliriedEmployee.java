package entity;
import java.util.Scanner;
public class SaliriedEmployee extends Employee {
     
	private double weeklySalary;

	
	public SaliriedEmployee() {
		
	}
	
	public SaliriedEmployee(double weeklySalary) {
		super();
		this.weeklySalary = weeklySalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
	
	@Override
	public void accept(Scanner input) {
		super.accept(input);
		System.out.println("Enter the weekly salary");
		 this.setWeeklySalary(input.nextDouble());
		
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Weekly salary is: " + this.getWeeklySalary());
	}
	
	@Override
	public double calculateSalary() {
		return getWeeklySalary()*4;
	}
	
	
}
