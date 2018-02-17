package org.saikat.algo.sort;

public class InsertionSort {

	public static void main(String[] args) {

		int arr[] = {22,45,12,8,10,6,72,81,33};
		
		for (int i = 0; i < arr.length; i++) {
			
			int position = i;
			int index = arr[i];
			while(position>0 && arr[position-1]>index){
				arr[position] = arr[position-1];
				position--;
			}
			arr[position] = index;
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	
	}

}
