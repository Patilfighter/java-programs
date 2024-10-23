package com.company;


	import java.util.Scanner;




	public class Test {
 
		public static void main(String args[]) {
			
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the integer");
		 int num = input.nextInt();
		 
		System.out.println("binary value is: "+Integer.toBinaryString(num));
		System.out.println("Octal value is: " + Integer.toOctalString(num));
		System.out.println("Hexadecimal value is: "+Integer.toHexString(num));
		
		}
		
	}


