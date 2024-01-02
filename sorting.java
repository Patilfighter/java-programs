

class sorting{
    public static void main(String[] args) {
        int[] arr = {4,3,2,5,1};
        for(int i = 0; i < arr.length; i++){
            for(int j= i; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int current = arr[i];
                    arr[i] = arr[j];
                    arr[j] = current;
                }
            }
        }
        for(int i= 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}