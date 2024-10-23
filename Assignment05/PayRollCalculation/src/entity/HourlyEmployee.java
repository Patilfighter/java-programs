package entity;
import java.util.Scanner;
public class HourlyEmployee extends Employee{
	
	private double wage;
	private int hrs;
	
	public HourlyEmployee() {
		
	}
	
	
	public HourlyEmployee(double wage, int hrs) {
		super();
		this.wage = wage;
		this.hrs = hrs;
	}
	
	
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public int getHrs() {
		return hrs;
	}
	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	
	@Override
	public void accept(Scanner input) {
		super.accept(input);
		System.out.println("Enter the wage of the Employee");
		 this.setWage(input.nextDouble());
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("The wage of the employee is: " + this.getWage());
		System.out.println("The hrs of work of employee is: " + this.getHrs());
		
	}
	
	@Override
	public double calculateSalary() {
		double salary = 0;
		if(this.getHrs() > 40 && this.getHrs() <= 80){
			int hrs = this.getHrs() % 40;
			 salary = hrs*this.getWage()*1.5;
			 salary += 40 * getWage();
			 return salary;
		}
		else {
			salary = 40*getWage();
			return salary;
		}
	}
	

}
