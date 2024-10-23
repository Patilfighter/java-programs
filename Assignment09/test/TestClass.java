package test;
import entity.*;
import comparison.*;
import java.util.*;
public class TestClass {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Collection<Student> student = new ArrayList<>();
		
		  
		int choice;
		
		while((choice = menu(input)) != 0) {
			
			switch(choice) {
			 
			case 1 -> {
				Student s = new Student();
				s.accept(input);
				student.add(s);
			}
			
			case 2 ->{
				 Iterator<Student> itr = student.iterator();
				while(itr.hasNext()) {
					Student ref = itr.next();
					System.out.println(ref.toString());
				}
				
			}
			
			case 3 ->{
				 Iterator<Student> itr = student.iterator();
				System.out.println("Enter Roll No for student you want to search");
				int roll = input.nextInt();
				Student ref = itr.next();
				while(itr.hasNext()) {
					if(ref.getRollNO() == roll ) {
						System.out.println(ref.toString());
					}
					itr.next();
				}
			}
			case 4 ->{
				    ArrayList<Student> ref = (ArrayList<Student>)student;
				    Collections.sort(ref);
				    System.out.println(ref.toString());
			}
			
			case 5->{
				 ArrayList<Student> ref = (ArrayList<Student>)student;
				Collections.sort(ref,new NameCompare());
			    System.out.println(ref.toString());
			}
			
			case 6 ->{
				 ArrayList<Student> ref = (ArrayList<Student>)student;
				Collections.sort(ref, new MarksComparator());
			    System.out.println(ref.toString());
			}
			}
		}
		
		
	}
	
	static int menu(Scanner input) {
		System.out.println("0. to exit");
		System.out.println("1. to accept student details");
		System.out.println("2. to display all student using iterator");
		System.out.println("3. to display student with given roll number");
		System.out.println("4. sort the student on rollno");
		System.out.println("5. sort the student on name");
		System.out.println("6. sort the student on marks");
		int choice = input.nextInt();
		return choice;
	}

}
