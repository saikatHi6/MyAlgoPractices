package org.saikat.algo.sort;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = {22,45,12,8,10,6,72,81,33};
		
		for (int i = 0; i < arr.length-1; i++) {
			int position = i;
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[position]>arr[j]){
					position = j;
				}
			}
			if(arr[i]>arr[position]){
				int temp = arr[i];
				arr[i] = arr[position];
				arr[position] = temp;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
