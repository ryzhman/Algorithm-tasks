package com.algorithms.tests;


import static org.junit.Assert.*;

import org.junit.Test;

import com.algorithms.min_max.FindingTwoMaxElements;

public class FindingTwoMaxElementsTest {
	private Integer[] testArray = {1,55,-12,0,1,44};
	private Integer[] maxArray = {55,44};
	private Integer[] emptyArray = {};
	
	@Test
	public void findTwoMaximumFromEndTest(){
		assertEquals(FindingTwoMaxElements.findTwoMaximumFromEnd(testArray), maxArray);
		assertNull(FindingTwoMaxElements.findTwoMaximumFromEnd(emptyArray));
		
	}

}
