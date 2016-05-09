package com.algorithms.reversing;

public class StringReverse {
	public static String reverseString(String str){
		char[] array = str.toCharArray();
		char[] newArr = new char[array.length];
		for(int i=0; i<array.length; i++){
			newArr[i]=array[array.length-1-i];
		}
		return newArr.toString();
	}

}
