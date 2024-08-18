package binary;
public class SplitArray {
    public static void main(String[] args) {
        int nums [] = {7,2,5,10,8};
        int m = 2;
        int ans = splitArray(nums,m);
        System.out.println("the ans is:"+ans);
    }

    public static int splitArray(int [] nums, int m){
        int start = 0;
        int end   = 0;

        for(int i = 0; i<nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
          } 
          System.out.println(end);
          while (start < end) {
            int mid = start+(end-start)/2;
            System.out.println(mid+"+"+end);
            int sum = 0;
            int piece = 1;
            for(int num : nums){
                if(sum+num>mid){
                    sum = num;
                    piece++;
                }
                else{
                    start+=num;
                }
            }
            if (piece>m) {
                start=mid+1;
            }
            else{
                end = mid;
            }

          }
    
    return end;
}

}
