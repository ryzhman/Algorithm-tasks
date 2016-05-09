package com.algorithms.tests;


import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.algorithms.sorting.ComparatorSorting;

public class ComparatorSortingTest {
	private static List<Integer> list;
	private static Integer[] testArray;
	private static Integer[] sortedASCTestArray = new Integer[]{-223,-2,0,1,1,22,30};
	private static Integer[] sortedDESCTestArray = new Integer[]{30,22,1,1,0,-2,-223};
	
	@Before
	public void setUp(){
		testArray=new Integer[]{1,22,-2,0,1,30,-223};
	}
	
	@Test
	public void sortWithSortASCTest(){
		ComparatorSorting.sortWithSortASC(testArray);
		assertEquals(testArray, sortedASCTestArray);
	}
	
	@Test
	public void sortWithSortDESCTest(){
		ComparatorSorting.sortWithSortDesc(testArray);
		assertEquals(testArray, sortedDESCTestArray);
	}

}
