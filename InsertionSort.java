import java.util.*;
public class InsertionSort{
    public static void main(String[] args){
        InsertionSort obj = new InsertionSort();
            Scanner input = new Scanner(System.in);
            int arr[] = {7 ,9, 8, 12, 11 ,10};
            int count = 0;
            for(int i = 1; i < arr.length; i++){
               int current = arr[i];
                
                    int j = i-1;
                    while(j >= 0 && arr[j] > current){
                  arr[j+1] = current;
                  count++;
                  j--;
                }
                arr[j+1] = current;
            }
           System.out.println(count);
             
             
    }    
}