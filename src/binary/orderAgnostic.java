package binary;

public class orderAgnostic {
    public static void main(String[] args) {
        
        int arr [] = {9,8,7,6,5,4,3,2,1};

        int target = 1;

        int ans = orderAgnosticSearching(arr, target);
        System.out.println(ans);
    }
     static int orderAgnosticSearching(int [] arr,int target){

            int start = 0;
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
