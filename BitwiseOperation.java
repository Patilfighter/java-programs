/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class BitwiseOperation
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while(t-- >0){
		    int n = input.nextInt();
		    int x = input.nextInt();
		    int[] arr = new int[n];
		    for(int i = 0; i < n; i++){
		        arr[i] = input.nextInt();
		    }
		    int or = arr[0];
		    for(int i = 1; i< n; i++){
		        or = or | arr[i];
		    }
		    int flag = 0;
		   int number = or^x;
		   int z = or|number;
		   if(z == x){
		       System.out.println(number);
		   }
		   else{
		       System.out.println(-1);
		   }
		  
		}
	}
}
