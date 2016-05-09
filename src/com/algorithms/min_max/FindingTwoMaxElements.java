package com.algorithms.min_max;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FindingTwoMaxElements {
	
	public static Integer[] findTwoMaximumFromEnd(Integer[] array){
		if(array==null||array.length==0) return null;
		
		List<Integer> list = Arrays.asList(array);
		Collections.sort(list);
		Integer max1 = list.get(list.size()-1);
		Integer max2 = list.get(list.size()-2);
		return new Integer[]{max1, max2};
	}

}
