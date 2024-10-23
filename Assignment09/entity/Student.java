package entity;
import java.util.*;

public class Student implements  Comparable<Student> {
	private int rollNO;
	private String name;
	private String city;
	private double marks;
	
	
	public Student() {
		
	}
	
	public Student(int rollNO, String name, String city, double marks) {
		super();
		this.rollNO = rollNO;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}
	public int getRollNO() {
		return rollNO;
	}
	public void setRollNO(int rollNO) {
		this.rollNO = rollNO;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	public void accept(Scanner input) {
		System.out.println("Enter name");
		this.setName(input.next());
		
		System.out.println("Enter Roll number");
		this.setRollNO(input.nextInt());
		
		System.out.println("Enter city");
		this.setCity(input.next());
		
		System.out.println("Enter the marks");
		this.setMarks(input.nextDouble());
		

	}
  
        
   




	@Override
	public String toString() {
		return "Student [rollNO=" + rollNO + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {
		int diff = this.rollNO- o.rollNO;
		return diff;
	}


	

}
