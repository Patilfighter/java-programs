package entity;
import java.util.Scanner;
public class BaseSalariedCommissionedEmployee extends CommissionedEmployee{
    private double baseSalary;
    
    public  BaseSalariedCommissionedEmployee() {
    	
    }

	public BaseSalariedCommissionedEmployee(double baseSalary) {
		super();
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
    
	@Override
	public void accept(Scanner input) {
		super.accept(input);
		System.out.println("Enter the base salary");
		this.setBaseSalary(input.nextDouble());
	}
	
	@Override
	public void display() {
		super.display();
		 System.out.println("The base salary is: " + this.getBaseSalary());
	}
	
	@Override
	public double calculateSalary() {
		double salary = super.calculateSalary()+this.getBaseSalary();
		return salary;
	}
}
