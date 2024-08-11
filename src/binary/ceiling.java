package binary;

import java.util.Arrays;

public class ceiling {
    
    public static void main(String args[]){
//         int arr[]  = new int [5];
        int arr[]  = {2,3,5,6,7,12,15,18,19,24,27,28,30};
        
        int target = 31;

       int ans =  ceilingSearch(arr,target);
       
        System.out.println("the ans is:" + ans);
   
    }
     static int ceilingSearch(int arr[],  int target){

        if(target>arr[arr.length-1]){
            return (arr.length-1)+1;
        }

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
        return start;
    }
    
}
