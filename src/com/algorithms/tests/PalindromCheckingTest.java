package com.algorithms.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.algorithms.palindrom.PalindromChecking;

public class PalindromCheckingTest {
	private String testWord = "Mykola";
	private String palindrom = "alokyM";
	private String invorrectPalindrom = "alikyL";
	private String nullString;
	private String incorrLength = "Mykolasd";
	
	@Test
	public void checkPalindromArraysTest(){
		assertTrue(PalindromChecking.checkPalindromArrays(testWord, palindrom));
		assertFalse(PalindromChecking.checkPalindromArrays(testWord, invorrectPalindrom));
		assertFalse(PalindromChecking.checkPalindromArrays(testWord, nullString));
		assertFalse(PalindromChecking.checkPalindromArrays(testWord, incorrLength));
	}
	
	@Test
	public void checkPalindromReverseTest(){
		assertTrue(PalindromChecking.checkPalindromReverse(testWord, palindrom));
		assertFalse(PalindromChecking.checkPalindromReverse(testWord, invorrectPalindrom));
		assertFalse(PalindromChecking.checkPalindromReverse(testWord, nullString));
		assertFalse(PalindromChecking.checkPalindromReverse(testWord, incorrLength));
	}
	
	@Test
	public void checkPalindromCompareCharByCharTest(){
		assertTrue(PalindromChecking.checkPalindromCompareCharByChar(testWord, palindrom));
		assertFalse(PalindromChecking.checkPalindromCompareCharByChar(testWord, invorrectPalindrom));
		assertFalse(PalindromChecking.checkPalindromCompareCharByChar(testWord, nullString));
		assertFalse(PalindromChecking.checkPalindromCompareCharByChar(testWord, incorrLength));
	}
	
	

}
