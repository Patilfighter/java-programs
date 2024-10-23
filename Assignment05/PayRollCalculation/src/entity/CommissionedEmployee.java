package entity;
import java.util.Scanner;

public class CommissionedEmployee extends Employee {

	private double grossSales;
	private double commissionRate;
	
	
	public CommissionedEmployee() {
		
	}
	
	public CommissionedEmployee(double grossSales, double commissionRate) {
		super();
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	
	
	public double getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	public double getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	
	@Override
	public void accept(Scanner input) {
		super.accept(input);
		System.out.println("Enter the gross sales");
		this.setGrossSales(input.nextDouble());
		
		System.out.println("Enter the commission rate");
		this.setCommissionRate(input.nextDouble());
		
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("The gross sales is: " + getGrossSales());
		System.out.println("The commissoin rate is: " + getCommissionRate());
	}

	
	@Override
	public double calculateSalary() {
	      double salary = getGrossSales()*(getCommissionRate()/100);
	      return salary;
	}
	
}
