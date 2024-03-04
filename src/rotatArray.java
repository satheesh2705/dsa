/**
 * muntainArray
 */
public class rotatArray {

    public static void main(String[] args) {
        
        int arr [] = {6,7,8,9,10,1,2,3,4,5};
        int target = 0;
       int ans =  search(arr,target);
       peakIndexMountainArray(arr);
        System.out.println("the ans is:"+ans);
    }

    static int search(int [] arr, int target){
        int peack = peakIndexMountainArray(arr);
        int firstTry = binarySearch(arr, target,peack);
        System.out.println("firsttry"+firstTry);
        if (firstTry != -1) {
            return firstTry;
        }

        return afterPivotBS(arr, target,peack);

    }

    static int peakIndexMountainArray(int [] arr){
        
        int start = 0;
        int end = arr.length-1;


        while (start<end){

            int mid = (start+end) / 2 ;
           
            if (arr[mid] > arr[mid+1]){
                end = mid;
            }
            else {

                start = mid +1;
            }
        }

        return start;    
    }


    static int binarySearch(int arr[],  int target,int peack){

        int start = 0;
        int end = peack;
        

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


    static int afterPivotBS(int arr[],  int target,int peack){

        int start = peack+1;
                System.out.println("st"+start);

        int end = arr.length;
                System.out.println(end);
        

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
        return -10;
    }


}


