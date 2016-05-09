package com.algorithms.reversing;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayReverse {
	
	public static int[] newArrayReverse(int[] array){
		int[] arr = new int[array.length];
		for(int i=0; i<array.length; i++){
			arr[array.length-1-i]=array[i];
		}
		return arr;
	}
	
	public static int[] sameArrayReverse(int[] array){
		for(int i=0; i<array.length/2; i++){
			int x = array[i];
			array[i]=array[array.length-1-i];
			array[array.length-1-i]=x;
		}
		return array;
	}
	
	public static Integer[] arraysReverse(Integer[] array){
		List<Integer> list = Arrays.asList(array);
		Collections.reverse(list);
		Integer []newArray = (Integer[]) list.toArray();
		return newArray;
	}
	
}
