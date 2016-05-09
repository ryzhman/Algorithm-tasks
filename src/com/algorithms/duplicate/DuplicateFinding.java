package com.algorithms.duplicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateFinding {
	
	/**
	 * Universal method finds (via iteration) and stores in ArrayList elements from @param list1 which are unique for this List 
	 * and aren't contained in @param list2.
	 * @param list1 Collection containing set of elements to check
	 * @param list2 Collection containing set of control elements
	 * @return List<String> list collection containing all unique elements from the @param list1
	 */
	public static <T> List<T> findNonDuplicateElementsIter(List<T> list1, List<T> list2){
		if(list1==null||list2==null||list1.isEmpty()||list2.isEmpty()) return null;
		
		List<T> list = new ArrayList<>();
		
		/*
		 *iterating through list1 and search duplicate element in it via indexOf & lastIndexOf, and then search for 
		 *duplicate in list2 via indexOf 
		 */
		for(T c:list1){
			if((list1.indexOf(c)==list1.lastIndexOf(c))&&(list2.indexOf(c)==-1)){
				list.add(c);
			}
		}
		return list;
	}
	
	/**
	 * Method finds (via adding to HashSet) and stores in ArrayList elements from @param list1 which are unique for this List 
	 * and aren't contained in @param list2.
	 * @param list1 Collection containing set of elements to check
	 * @param list2 Collection containing set of control elements
	 * @return List<String> list collection containing all unique elements from the @param list1
	 */
	public static <T> List<T> findNonDuplicateElementsSet(List<T> list1, List<T> list2){
		if(list1==null||list2==null||list1.isEmpty()||list2.isEmpty()) return null;

		Set<T> set = new HashSet<>();
		List<T> resultList = new ArrayList<>();
		
		/*
		 * set.add() return false if an element is already in HashSet
		 */
		for(T s: list1){
			if(set.add(s)&&(list2.indexOf(s)==-1)){
				resultList.add(s);
			}
		}
		return resultList;
	}
	
	/**
	 * Method finds and stores in ArrayList duplicate elements which are stored in @param col1
	 * @param col1 List to find duplicates
	 * @return ArrayList of duplicates
	 */
	public static <T> List<T> findDuplicatesInCollection(List<T> col1){
		if(col1==null||col1.isEmpty()) return null;
		
		List<T> list = new ArrayList<>();
		Set<T> set = new HashSet<>();
		for(T e: col1){
			if(!(set.add(e))){
				list.add(e);
			}
		}
		return list;
	}
	
	

}
