package assignment.questions;
import java.util.Scanner;


public class EmployeeTest {
 
	public static void main(String[] args) {
		Employee sun = new Employee();
		Employee moon = new Employee();
		
		sun.acceptEmployee();
		sun.displayEmployee();
		sun.getYearSalary();
		System.out.println("Employee yearly salary is: " + sun.getYearSalary());
		System.out.println( "Employee salary with bonus is: " + sun.geteYearSalaryWithRise());
		 
		System.out.println("---------------------------------");
		moon.acceptEmployee();
		moon.displayEmployee();
		System.out.println("Employee yearly salary is: " + moon.getYearSalary());
		System.out.println( "Employee salary with bonus is: " + moon.geteYearSalaryWithRise());
	}
	
}


class Employee{
	Scanner input = new Scanner(System.in);
	String fName;
	String LName;
	double mSalary;
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getLName() {
		return LName;
	}

	public void setLName(String lName) {
		LName = lName;
	}

	public double getmSalary() {
		return mSalary;
	}

	public void setmSalary(double mSalary) {
		this.mSalary = mSalary;
	}
 
	
	public void acceptEmployee() {
		System.out.println("Enter the first name");
		this.setfName(input.nextLine());
		
		System.out.println("Enter the last name");
		this.setLName(input.nextLine());
		
		System.out.println("Enter the monthly salary");
		this.setmSalary(input.nextDouble());

	}
	
	public void displayEmployee() {
		System.out.println("Emtployee name is: " + getfName() + " " + getLName());
		System.out.println("Employee salary is: " + getmSalary());
	}
	
	
	Employee(){
		this.fName = "First Name";
		this.LName = "Last Name";
		double mSalary = 0;
	}

	public Employee(String fName, String lName, double mSalary) {
	
		this.fName = "First Name";
		LName = "Last Name";
		if(mSalary > 0) {
			this.mSalary = mSalary;
		}
		else {
		this.mSalary = 0;
		}
	}
	public double getYearSalary() {
		return  getmSalary()*12;
	}
	public double geteYearSalaryWithRise() {
		return 1.10* getmSalary()*12;
	}
}