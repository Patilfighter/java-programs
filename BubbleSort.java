//bubble sort algorithm.
import java.util.*;
public class BubbleSort{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the length of the Array");
        int l = input.nextInt();
        int[] arr = new int[l];
        System.out.println("enter the array elements");
       for(int i = 0; i< l;i++){
          arr[i] = input.nextInt();
       }
       
    
    for(int i = 0; i<l; i++){
        int sub = 0;
        for(int j = i+1; j < l; j++){
            if(arr[i]>arr[j]){
                sub =arr[j];
                arr[j] = arr[i];
                arr[i] = sub;
            }
        }
    }
    
    System.out.println("the sorted array is: ");
    for(int i = 0; i < arr.length; i++){
        System.out.printf(arr[i]+" ");
    }
    
    }
}