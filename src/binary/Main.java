package binary;

public class Main {


    public static void main(String args[]){
        int arr[]  = {0,1,2,3,10,20,30,40,50};
        int target = 3;
        // int last   = arr.length-1;

       int ans =  binarySearch(arr,target);
       
        System.out.println(ans);
        System.out.println("helo");
    }
     static int binarySearch(int arr[],  int target){

        int start = 0;
        int end = arr.length;


        while( start <= end ){

            int mid = (start + end)/2;

            if ( arr[mid] == target ) {
                return mid;
            }
               else if ( arr[mid] < target ){
                    start = mid + 1;
               }
               else{
                end = mid - 1;
            }

        }
        return -1;
    }
}