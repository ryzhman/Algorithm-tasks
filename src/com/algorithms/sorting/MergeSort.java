package com.algorithms.sorting;

public class MergeSort {
	
	@SuppressWarnings("rawtypes")
	public static Comparable[] mergeSort(Comparable[] arr){
		if(arr.length<=1)
			return arr;
		
		Comparable[]left = new Comparable[arr.length/2];
		Comparable[]right = new Comparable[arr.length-left.length];
		
		System.arraycopy(arr, 0, left, 0, left.length);
		System.arraycopy(arr, left.length, right, 0, right.length);

		mergeSort(left);
		mergeSort(right);
		
		merge(left, right, arr);
		
		return arr;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void merge(Comparable[] left, Comparable[] right, Comparable[] arr){
		int i=0;
		int j=0;
		int iResult = 0;
		
		while(i<left.length&&j<right.length){
			if(left[i].compareTo(right[j])<0){
				arr[iResult]=left[i];
				i++;
			}else{
				arr[iResult]=right[j];
				j++;
			}
			iResult++;
		}
		System.arraycopy(left, i, arr, iResult, left.length-i);
		
		System.arraycopy(right, j, arr, iResult, right.length-j);
	}

	public static void main(String[] args) {
		Integer[] arr={7,1,5,4};
		mergeSort(arr);
//		Arrays.stream(arr).forEach(e->System.out.println(e));
		
	}

}
