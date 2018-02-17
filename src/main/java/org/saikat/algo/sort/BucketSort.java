package org.saikat.algo.sort;

public class BucketSort {

	public static void main(String[] args) {
		
		int arr[] = {22,45,12,8,10,6,72,81,33};
		
		int arrSize = arr.length;
		
		int max = maxNo(arr);
		int min = minNo(arr);
		int[] b[] = new int[10][];
		double divisable = calculateDivisable(max,b.length);
		System.out.println(divisable);
		
		for (int i = 0; i < arr.length; i++) {
			insertToBucket(arr[i],b,divisable);
		}
		
		
		
	}

	private static void insertToBucket(int i, int[][] b, double divisable) {
		int position = (int) Math.floor(i/divisable);
		int bucketList[] = b[position];
		
	}

	private static double calculateDivisable(int max, int length) {
		double divisable = Math.ceil((max+1)/length);
		return divisable;
	}

	private static int minNo(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]<min){
				min = arr[i];
			}
		}
		return min;
	}

	private static int maxNo(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>max){
				max = arr[i];
			}
		}
		return max;
	}

}
