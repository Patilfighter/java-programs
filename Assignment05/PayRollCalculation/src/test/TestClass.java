package test;
import entity.*;
import java.util.*;

public class TestClass {
   
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice;
		ArrayList<Employee> list = new ArrayList<>();
		while((choice = menu(input))!= 3) {
		
			switch(choice) {
			case 1 -> {
                            int choose;
                            while((choose = menu2(input))!= 5) {
                                switch(choose) {
                                    case 1 -> {
                                        SaliriedEmployee emp1 = new SaliriedEmployee();
                                        emp1.accept(input);
                                        list.add(emp1);
                                    }
                                        
                                    case 2 -> {
                                        HourlyEmployee emp2 = new HourlyEmployee();
                                        emp2.accept(input);
                                        list.add(emp2);
                                    }
                                        
                                    case 3 -> {
                                        CommissionedEmployee emp3 = new CommissionedEmployee();
                                        emp3.accept(input);
                                        list.add(emp3);
                                    }
                                        
                                    case 4 -> {
                                        BaseSalariedCommissionedEmployee emp4 = new BaseSalariedCommissionedEmployee();
                                        emp4.accept(input);
                                        list.add(emp4);
                                    }
                                        
                                    default -> System.out.println("Invalid choice!");
                                }
                                
                            }
                        }
				
			case 2 -> {
                            System.out.println(chooseEmployee(list,input));
                            System.out.println("\n");
                        }
				
			default -> System.out.println("Invalid choice");
			}
			
			
		}
		
		
		
	}
	
	static public int menu(Scanner input) {
		System.out.println("press 1. To Enter the type of Employee for which calculation need to be done");
		System.out.println("press 2. To calculate the pay roll calculation");
		System.out.println("press 3. To exit");
		int choice = input.nextInt();
		return choice;
		
	}
	
	static public int menu2(Scanner input) {
		System.out.println("Enter 1. to Enter salaried employee");
		System.out.println("Enter 2. to Enter hourly employee");
		System.out.println("Enter 3. to Enter commission employee");
		System.out.println("Enter 4. to Enter base salaried commission employee");
		System.out.println("Enter 5. to exit");
		
		int choice = input.nextInt();
		return choice;
	}
	
	static String chooseEmployee(ArrayList<Employee> list, Scanner input) {
		boolean flag = false;
		double slry = 0;
		System.out.println("Enter the ssn for which you want to find pay roll");
		int ssn = input.nextInt();
		for(Employee i : list) {
			if(i.getSsn() == ssn) {
				i.display();
				System.out.println("-----------------------");
				slry= i.calculateSalary();
				flag = true;
				break;
			}
			
		}
		if(flag) {
			return "The calculated salary is: " + slry;
		}
		else {
			return "invalid SSN";
		}
		
	}
	
}
