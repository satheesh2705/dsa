/**
 * muntainArray
 */
public class muntainArray {

    public static void main(String[] args) {
        
        int arr [] = {1,2,4,5,6,4,3,2};
        int target = 3;
       int ans =  search(arr,target);
       peakIndexMountainArray(arr);
        System.out.println("the ans is:"+ans);
    }

    static int search(int [] arr, int target){
        int peack = peakIndexMountainArray(arr);
        System.out.println("peack:"+peack);
        int firstTry = binarySearch(arr, target,peack);
        if (firstTry != -1) {
            return firstTry;
        }

        return orderAgnosticSearching(arr, target,peack);

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
        System.out.println("mid:"+mid+"start:"+start);

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

    static int orderAgnosticSearching(int [] arr,int target,int peack){

        int start = peack+1;
        int end = arr.length;

        while (start <= end) {
            
            int mid = (end+start) / 2;

            if ( arr[mid] == target ) {
                return mid;
            }
               else if ( arr[mid] > target ){

                start = mid + 1;

            }
               else{
                end = mid - 1;
            }
        }

    return -1;
}
}


