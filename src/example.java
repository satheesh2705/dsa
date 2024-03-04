import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int arr [] = {1,2,3,96,5,6,9,8};

        int target = 4;
        int ans = linearSearch(arr,target);
        System.out.println("the ans is:"+ans);

    }
    

    static int linearSearch(int [] arr,int target){
        
        for(int i=0; i<arr.length; i++){
          
                if ( arr[i] == target) {
                  return i;
                
            }
        }
       return 0;
        
    }
}
