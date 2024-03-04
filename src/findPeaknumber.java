
public class findPeaknumber {
    public static void main(String[] args) {
        int arr [] = {0,1,2,3,4,5,6,0};
        int ans = searchingPeakno(arr);
        System.out.println("The peak index is:" + ans);
    
    }

    static int searchingPeakno(int [] arr){

        int start = 0;
        int end = arr.length-1;
        while (start<end){

            int mid = (start+end) / 2 ;
            System.out.println(mid);
            
            if (arr[mid] > arr[mid+1]){
                end = mid;
            }
            else {

                start = mid +1;
            }
        }

        return start;
    }
}
