package com.algorithms.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorSorting {
	
	/*
	 * Using traditional ascending order for sorting
	*/
	public static Integer[] sortWithSortASC(Integer[] array){
		List<Integer> list = Arrays.asList(array);
		Collections.sort(list);
		return array;
	}
	
/*
 * Using standart Colletions.reverse comparator for reverse order
*/	
	public static Integer[] sortWithSortDesc(Integer[] array){
		List<Integer> list = Arrays.asList(array);
		Collections.sort(list, Collections.reverseOrder());
		return array;
	}

}
