package TwoDArray;

import java.util.Arrays;

public class TwoDArrayBs {

	public static void main(String[] args) {
		
		int arr [][] = {
				{12,13,14,15},
				{16,17,18,19},
				{21,22,24,27},
				{29,31,33,35},
				{37,38,39,40}
		};
		
		int target = 35;
		int ans[] = search(arr,target);
		System.out.println(Arrays.toString(ans));

	}
	
	static int [] binarySearch(int[][] matrix,int row, int cStart, int cEnd, int target){
		
		while(cStart <= cEnd) {
			
			int mid = cStart + (cEnd - cStart ) /2;			
			
			if( matrix[row][mid] == target) {
				return new int [] {row, mid};
			}
			else if(matrix[row][mid] < target) {
				cStart = mid + 1;
			}
			else {
				cEnd = mid - 1;
			}
			
		}
		
		return new int[]{-1,-1};
	}

 
	static int [] search (int[][] matrix,int target) {
		
		int rows = matrix.length;
		int col  = matrix[0].length;
		
		if (rows == 1) {
			return binarySearch(matrix, rows, rows, col, target);
		}
		
		int rStart = 0;
		int rEnd = rows - 1;
		int cMid = col / 2;
		
		while( rStart < (rEnd - 1)) {
			
			int mid = rStart + (rEnd - rStart) / 2;
			
			if(matrix[mid][cMid] == target) {
				return new int [] {mid, cMid};
			}
			else if( matrix[mid][cMid] > target ) {
				rEnd = mid;
			}
			else {
				rStart = mid;
			}
			
		}
		
		if(matrix[rStart][cMid] == target ) {
			return new int [] {rStart, cMid}; 
		}
		
		if(matrix[rStart + 1 ][cMid] == target ) {
			return new int [] {rStart + 1, cMid}; 
		}
		
		
		if(target <= matrix[rStart][cMid - 1]) {
			return binarySearch(matrix, rStart, 0, cMid-1, target);
		}
		if(target >= matrix[rStart][cMid + 1]) {
			return binarySearch(matrix, rStart, cMid+1, col-1, target);
		}
		
		if(target <= matrix[rStart ][cMid - 1]) {
			return binarySearch(matrix, rStart + 1, 0,col -1, target);
		}
		else {
			return binarySearch(matrix, rStart + 1, cMid+1,col -1, target);
		}
		
		
		
		
//		return new int [] {-1,-1};
	}
}
