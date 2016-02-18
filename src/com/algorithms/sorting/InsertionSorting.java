package com.algorithms.sorting;

public class InsertionSorting {
	
	public static void sort(int[] array){
		int j;
		int key;
		int i;
		
		for(j=1; j<array.length; j++){
			key=array[j];
			for(i=j-1; (i>=0)&&(key<array[i]);i--){
				array[i+1]=array[i];
			}
			array[i+1]=key;
		}
	}

	public static void main(String[] args) {
		int [] array={2,8,1,0,6,-1,4,7};
		sort(array);
		for(int e: array){
			System.out.print(e + " ");
		}
		
	}

}
