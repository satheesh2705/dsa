package dsa.sorting.java;
import java.util.Arrays;

public class bubbleSort {
	public static void main(String[] args) {
		
			  int arr [] = {11,	1,2,8,7,6,5,4};
			  int ans[] = bubbleSortAlg(arr);
			  System.out.println(Arrays.toString(ans));
	}  
		  	
		public static  int [] bubbleSortAlg(int [] arr) {
				boolean swap;
				
		  		for(int i = 0; i<arr.length-1; i++) {
		  			swap = false ;
		  			for(int j = 1; j<arr.length-i; j++) {
		  				
		  	  			if( arr[j-1] > arr[j]) {	  	  				
		  	  				int temp = arr[j-1];
		  	  				arr[j-1] = arr[j];
		  	  				arr[j] = temp;
		  	  				swap = true;
		  	  				
		  	  			}
		  	  		}

		  			if(!swap) {
		  				System.out.println("Array is sorted...");
		  				break;
		  			}
		  		}
		  		
		  		return arr;
		  		
		
	}
}
