/**
 * muntainArray
 */
public class muntainArray {

    public static void main(String[] args) {
        
        int arr [] = {1,2,4,5,6,4,3,2};
        int target = 1; 
       int ans =  search(arr,target);
        System.out.println("the ans is:     "+ans);

        int one ;
        
    }


    static int search(int [] arr, int target){
        // first i will find the mountain value in the array
        // then the value is strored in peak variable and then 
        int peack = peakIndexMountainArray(arr);
        System.out.println("peack:"+peack);
        //next the start=0 and end = peack then the values are give the binarysearch i will store binarysearch method in firsttry if firsttry value is -1 iruntha target does not here thats mean target value doesn't have first half so  we go to the next half
        // may be answer(target) here we got a answer and its return to main method


        int firstTry = binarySearch(arr, target,peack);
        int count = 0;
        if (firstTry != -1) {
        	count++;
            System.out.println("first try are "+count);
            return firstTry;
        }

        // target doesn't exist in first half we goto the second of like above peak number 
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


