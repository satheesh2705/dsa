package TwoDArray;

import java.util.Arrays;

public class TwoDArray {
	public static void main(String[] args) {
		
		int arr [][] = {
				{12,13,14,15},
				{16,17,18,19},
				{21,22,24,27},
				{29,31,33,35}
		};
		
		int target = 24;
		int ans[] = search(arr,target);
//		System.out.println(Arrays.toString(ans));
	}
	
	static int [] search(int arr[][], int target) {
		
		int r = 0;
		int c = arr.length-1;
		
		while(r < arr.length && c > 0) {
			
			if( arr[r][c] == target ) {
				
				return new int [] {r, c};
			
			}
			else if (  arr[r][c] < target ) {
				r++;
			}
			else {
				c--;
			}
		}
		
		
		return new int[] {-1,-1};
	}
}
