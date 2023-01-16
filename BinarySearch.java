import java.util.*;
public  class BinarySearch{
    public static void main(String[] args){
      Scanner sc =new Scanner(System.in);
      System.out.println("enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the array elements");
        for(int i = 0; i< size; i++){
          arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("enter the element that you want to find");
        int req = sc.nextInt();
        System.out.println("the element's index is "+searcher(arr,req));
     

        }
   static int searcher(int[]arr, int e){
    int low = 0;
    int high = arr.length-1;
    int mid = 0;
  
    while(low <= high){
        mid = (low+high)/2;
        if(arr[mid] == e){
              return mid;
       }     
       else if(arr[mid] > e){
        high = mid-1;
       }    
       else if(arr[mid] < e){
        low = mid+1;
       }
     }
     return -1;
   }
    }
