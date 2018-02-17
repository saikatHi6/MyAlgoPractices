package org.saikat.algo.sort;

public class MergeSort {

	public static void main(String[] args) {
		


		int arr[] = {22,45,12,8,10,6,72,81,33};
		
		mergeSort(arr);
		
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	
	
	}

	private static void mergeSort(int[] arr) {
		
		int size = arr.length;
		if(size<2){
			return;
		}
		int mid = size/2;
		int[] left = new int[mid];
		int[] right = new int[size-mid];
		
		for (int i = 0; i < mid; i++) {
			left[i] = arr[i];
		}
		for(int j=0;j<right.length;j++,mid++){
			right[j] = arr[mid];
		}
		
		mergeSort(left);
		mergeSort(right);
		merge(left,right,arr);
		
	}

	private static void merge(int[] left, int[] right, int[] arr) {
		int i=0,j=0,k=0;
		while(i<left.length && j<right.length){
			if(left[i]<right[j]){
				arr[k] = left[i];
				k++;
				i++;
			}
			else if(right[j]<left[i]){
				arr[k] = right[j];
				k++;
				j++;
			}
		}
		while(i<left.length){
			arr[k] = left[i];
			i++;
			k++;
		}
		while(j<right.length){
			arr[k] = right[j];
			j++;
			k++;
		}
	}

}
