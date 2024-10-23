package Test;
import java.util.*;
import java.util.Scanner;
import entity.*;
import comparators.*;

public class TestClass {
	
     public static void main(String[] args) {
    	 
      Scanner input = new Scanner(System.in);
      
       
        
    	Student[] arr = new Student[5];
    	 arr[0] = new Student(3,"mukesh","pune",25);
    	 arr[1] = new Student(4,"anil","mumbai",50);
    	 arr[2] = new Student(5,"ram","parbhani",30);
    	 arr[3] = new Student(2,"sham","nanded",40);
    	 arr[4] = new Student(1,"baldwin","jerusalem",35);
    	 
    	 
    	 
    	 int choice;
    	 while((choice= menu(input))!= 0) {
    		 switch(choice) {
    		 case 1:
    			 Arrays.sort(arr, new CityComparators());
    			 System.out.println("-----------------------");
    			 for(Student i: arr) {
    				System.out.println(i.toString());
    			
    			 }
    			 System.out.println("--------------------------");
    		
    		break;
    		
    		 case 2:
    		  Arrays.sort(arr, new MarksComparators());
    		  System.out.println("-----------------------");
    		  for(Student i : arr) {
    			  System.out.println(i.toString());
    		  }
 			 System.out.println("--------------------------");

    		  break;
    		  
    		 case 3:
    			 System.out.println("-----------------------");
    			 Arrays.sort(arr, new NameComparator());
    			
     			for(Student i: arr) {
     				System.out.println(i.toString());
     			}
   			 System.out.println("--------------------------");

     			break;
     			
    		 case 4:
    			 System.out.println("-----------------------");
    			 Arrays.sort(arr);
    			
     			for(Student i: arr) {
     				System.out.println(i.toString());
     			}
   			 System.out.println("--------------------------");

     			break;
     		
     		default:
     			System.out.println("invalind choice");
    		 }
    	 }
    	
     }
     
  
     
     static int menu(Scanner input) {
    	 System.out.println("1. sort on their city");
    	 System.out.println("2. sort on their marks");
    	 System.out.println("3. sort on their name");
    	 System.out.println("4. sort on their roll No");
    	 int choice;
    	 choice = input.nextInt();
    	 return choice;
    	 
     }
     
}
