package dsa.sorting.java;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int arr [] = {8,9,7,6,5};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void insertionSort(int arr []) {
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i+1; j > 0 ; j-- ) {
				if(arr[j] < arr[j-1]) {
					swap(arr, j, j-1);
				}
			}
		}
	}
	
	public static int [] swap(int arr[], int first, int second){
		
		int temp = arr[first]; 
		arr[first] = arr[second];
		arr[second] = temp;
		
		return arr;
		
	}
	
}
