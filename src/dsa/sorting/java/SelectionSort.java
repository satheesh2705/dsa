package dsa.sorting.java;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int arr [] = {12,21,86,96,97,98,99,3,4}; 
		int ans[] = bubbleSort(arr);
		System.out.println(Arrays.toString(ans));
	}
	
	public static int[] bubbleSort(int arr []) {
		for(int i = 0; i<arr.length; i++) {
			int start = 0;
			int last = arr.length - 1 - i;
			int maxValue = getMaxVal(arr,start,last);
			swap(arr, maxValue, last);
		}
		return arr;
	}
		
	public static int getMaxVal(int [] arr,int start,int last) {
			int max = start;
			for(int i=start; i<last; i++ ) {
				if( arr[max] < arr[i]) {
					max = i;
				}
			}
		return max;
		}
	
	public static int [] swap(int arr[], int first, int second){
	
		int temp = arr[first]; 
		arr[first] = arr[second];
		arr[second] = temp;
		
		return arr;
		
	}

}
