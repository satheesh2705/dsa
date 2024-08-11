public class floor {
    public static void main(String args[]){
        int arr[]  = {0,1,2,3,10,20,30,40,50,55};
        //            0,1,2,3,4,,5,,6,7,,8,,9
        int target = 40;
        int last   = arr.length-1;

       int ans =  findingFloorNumber(arr,target);
       
        System.out.println("The ans is:"+arr[ans]);
    }
     static int findingFloorNumber(int arr[],  int target){

        if(target>arr[arr.length-1]){
            return arr.length-1;
        }
        
        int start = 0;
        int end = arr.length;
        
        while( start <= end ){
            int mid = (start + end)/2;
            System.out.println("the mid is:"+arr[mid]);
           
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
        return end;
    }
}
