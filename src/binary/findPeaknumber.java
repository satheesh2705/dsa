import java.util.Arrays;

public class findPeaknumber {
	
    public static void main(String[] args) {
    	
        int arr [] = {0,1,2,3,2,1,0};
        int ans = searchingPeakno(arr);
        System.out.println("The peak index is:" + ans);
        
    }

    static int searchingPeakno(int [] arr){
    	
        int start = 0;
        int end = arr.length-1;

        while (start<end) {
        	
        	int mid = start + (end - start) / 2; // This line is correct.
        	
            // which mean mid+1  oda mid perusa iruntha mid or mid kku ullatha peak number irukku
            // ithu satisfy aana one by change aagi array short aagi ans finala length rendula vanthu nikku 
            //  loopukku veliya start update aagidum then  startta return pannidu
            
            if (arr[mid]>arr[mid+1]) {
                end= mid; 
            }
            
            else{
                start = mid+1;
            }
            
            // above condition satisfy aagalana midn oda mid+1 thaa perusu so we will change the start = mid +1 athavathu start aa move panrom
            // ithu satisfy aana one by change aagi array short aagi ans finala length rendula vanthu nikku 
            //  loopukku veliya start update aagidum then  startta return pannidu  
        }

        return start;
    }
       
    }
/*
array mid oda mid+1 perusa iruntha antha pakkkam tha periya number irukku 
*/ 



