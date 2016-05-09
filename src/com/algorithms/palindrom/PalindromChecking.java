package com.algorithms.palindrom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PalindromChecking {
	
	/**
	 * Checking whether the second word is a palindrom to the first word
	 * using comparison of sorted char arrays
	 * 	@param Stirng word basic word to compare with
	 * 	@param String palindrom word to check whether it is a palindrom to the first one
	 * 	@return boolean whether a word is a palindrome or not
	*/
	public static boolean checkPalindromArrays(String word, String palindrom){
		/*
		 * checking both params for null and length
		 */
		if(word==null||palindrom==null) return false;
		if(word.length()!=palindrom.length()) return false;
		
		/*
		 *converting to Lower case 
		 */
		word = word.toLowerCase();
		palindrom = palindrom.toLowerCase();
		
		/*
		 * Java 8 style convertion of String to List<Character>
		*/
		List<Character> basicCharList = word.chars().mapToObj(c->(char)c).collect(Collectors.toList());
		List<Character> palindromCharList = palindrom.chars().mapToObj(c->(char)c).collect(Collectors.toList());
		
		Collections.sort(basicCharList);
		Collections.sort(palindromCharList);
		if(basicCharList.equals(palindromCharList)) return true;
		else return false;
	}
	
	/**
	 * Checking whether the second word is a palindrom to the first word
	 * using removing from StringBuilder chars from character array created from word to check
	 * 	@param Stirng word basic word to compare with
	 * 	@param String palindrom word to check whether it is a palindrom to the first one
	 * 	@return boolean whether a word is a palindrome or not
	*/
	public static boolean checkPalindromRemove(String word, String palindrom){
		/*
		 * checking both params for null and length
		 */
		if(word==null||palindrom==null) return false;
		if(word.length()!=palindrom.length()) return false;
		
		/*
		 *converting to Lower case 
		 */
		word = word.toLowerCase();
		palindrom = palindrom.toLowerCase();
		
		char[] array = word.toCharArray();
		StringBuilder palindromeStrBldr = new StringBuilder(palindrom);
		/*
		 * iterating through char array to find out whether all symbols of @param word are in @param palindrom
		 */
		for(int i=0; i<array.length; i++){
			String letter = ""+array[i];
			char letterInPalindrom = palindromeStrBldr.charAt(palindromeStrBldr.length()-1-i);
//			if(palindromeStrBldr.indexOf(letter)!=-1){
//				palindromeStrBldr.deleteCharAt(i);
//			}
			if(array[i]!=palindrom.charAt(palindrom.length()-1-i)) return false;
			palindromeStrBldr.deleteCharAt(palindrom.length()-1-i);
		}
		if(palindromeStrBldr.length()==0) return true;
		else return false;
	}
	
	/**
	 * Checking whether the second word is a palindrom to the first word
	 * via comparing char arrays made from @param word and @param palindrom
	 * 	@param Stirng word basic word to compare with
	 * 	@param String palindrom word to check whether it is a palindrom to the first one
	 * 	@return boolean whether a word is a palindrome or not
	*/
	public static boolean checkPalindromReverse(String word, String palindrom){
		/*
		 * checking both params for null and length
		 */
		if(word==null||palindrom==null) return false;
		if(word.length()!=palindrom.length()) return false;
		
		/*
		 *converting to Lower case 
		 */
		word = word.toLowerCase();
		palindrom = palindrom.toLowerCase();
		
		char[] wordArr = word.toCharArray();
		char[] palindromArr = palindrom.toCharArray();
		/*
		 * Reversing palindromArr
		 */
		for(int i=0; i<palindromArr.length/2; i++){
			char temp = palindromArr[i];
			palindromArr[i]=palindromArr[palindromArr.length-1-i];
			palindromArr[palindromArr.length-1-i]=temp;
		}
		return Arrays.equals(wordArr, palindromArr);
	}
	
	/**
	 * Checking whether the second word is a palindrom to the first word
	 * via comparing each character from @param word (from the beginning) and @param palindrom (from the end)
	 * 	@param Stirng word basic word to compare with
	 * 	@param String palindrom word to check whether it is a palindrom to the first one
	 * 	@return boolean whether a word is a palindrome or not
	*/
	public static boolean checkPalindromCompareCharByChar(String word, String palindrom){
		/*
		 * checking both params for null and length
		 */
		if(word==null||palindrom==null) return false;
		if(word.length()!=palindrom.length()) return false;
		
		/*
		 *converting to Lower case 
		 */
		word = word.toLowerCase();
		palindrom = palindrom.toLowerCase();
		
		char[] wordArr = word.toCharArray();
		char[] palindromArr = palindrom.toCharArray();
		
		int beginning = 0;
		int end = palindromArr.length-1;
		for(int i=0; i<palindromArr.length/2;i++){
			if(wordArr[i]==palindromArr[palindromArr.length-1-i]){
				
			}
			return false;
		}
		return true;
	}
}
