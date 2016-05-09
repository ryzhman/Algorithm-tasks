package com.algorithms.tests;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import com.algorithms.reversing.ArrayReverse;

public class ArrayReverseTest {
	
	int[]array = {1,2,3,4};
	int[]correctArray = {4,3,2,1};
	
	
	@Test
	public void newArrayReverseTest(){
		assertTrue(Arrays.equals(correctArray, ArrayReverse.newArrayReverse(array)));
	}

	@Test
	public void sameArrayReverseTest(){
		assertTrue(Arrays.equals(correctArray, ArrayReverse.sameArrayReverse(array)));
	}
	
	@Test
	public void arraysReverse(){
		assertTrue(Arrays.equals(correctArray, ArrayReverse.newArrayReverse(array)));
	}
	
	
}
