package com.algorithms.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.algorithms.reversing.StringReverse;

public class StringReverseTest {
	String str = "abcd";
	String strTest = "dcba";
	
	@Test
	public void reverseStringTest(){
		assertTrue(strTest.equals(StringReverse.reverseString(str)));
	}
	
	
}
