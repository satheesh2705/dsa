

public class infinityArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,20,30,40,50,60,70,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100};
        int target = 90;
        int ans = searchRange(arr,target);
        System.out.println("The index is:"+ans+"the ans is:"+arr[ans]);

    }
    static int searchRange(int arr [], int target ){

        int start = 0;
        int end = 1;

        while (target > arr[end]){


            System.out.println("start"+start);
            System.out.println("end:"+end);

            int temp = end + 1 ;
            start = temp;
            end = end * 2 ;
            // end = end + (end-start+1) * 2 ;
            
           

        }

        return binarySearch( arr, target,start, end);

    }
    static  int binarySearch(int arr [], int target , int start , int end){

        while (start<=end){

            int mid = ( start + end) / 2;

            if (target == arr[mid]){
                return mid;
            } else if (target>arr[mid]) {
                start = mid+1;
            }
            else {
                end = mid -1;
            }
        }

        return -1;
    }
}