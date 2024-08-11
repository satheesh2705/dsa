public class repeatedNumber {
    

    public static void main(String args[]){
        int arr[]  = {0,3,3,3,30,40,50};
        int target = 3;
        int last   = arr.length-1;

        repeatedNumber obj = new repeatedNumber();
        int[] ans = obj.searchrange(arr, target);

        System.out.println("the ans is:"+ans);
    }
     int[] searchrange(int arr[],  int target){
        int[] ans = {-1,-1};


        ans[0] = search(arr, target, true);

      if (ans[0] != -1) {
        ans[1] =  search(arr, target,false);
      }
        return ans; 
}
        int search(int arr[],  int target, boolean findStartIndex){

        int ans =-1;
        int start = 0;

        int end = arr.length-1;

        while( start <= end ){

           int mid = start + (end - start)/2;
           
               if ( arr[mid] < target ){
                    start = mid + 1;
               }
               
               else if(arr[mid]> target){
                end = mid -1;
            }
            else {

                ans=mid;
                
                if(findStartIndex){
                    end = end -1;
                }

                else{
                    start = mid+1;
                }
            }

        }
       return ans;
    }
}
