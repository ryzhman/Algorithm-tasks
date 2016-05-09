package com.algorithms.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.algorithms.duplicate.DuplicateFinding;

public class DuplicateFindingTest {
	private String[]arr1 = {"a","s","d","c", "a","b","e"};
	private String[]arr2 = {"a","r","q","z","e","b"};
	private List<String> testList1 = Arrays.asList(arr1);
	private List<String> testList2 = Arrays.asList(arr2);
	private List<String> nullList1 = null;
	private List<String> nullList2 = null;
	private List<String> emptyList1 = new ArrayList<>();
	private List<String> emptyList2 = new ArrayList<>();
	private List<String> correctResultList = Arrays.asList("s","d","c");
	private List<String> duplicateList = Arrays.asList("a");
	
	@Test
	public void findNonDuplicateElementsIterTest(){
		assertEquals(DuplicateFinding.findNonDuplicateElementsIter(testList1, testList2), correctResultList);
		assertNull(DuplicateFinding.findNonDuplicateElementsIter(testList1, nullList2));
		assertNull(DuplicateFinding.findNonDuplicateElementsIter(nullList1, nullList2));
		assertNull(DuplicateFinding.findNonDuplicateElementsIter(testList1, nullList2));
		assertNull(DuplicateFinding.findNonDuplicateElementsIter(emptyList1, nullList2));
		assertNull(DuplicateFinding.findNonDuplicateElementsIter(emptyList1, emptyList2));
		assertNull(DuplicateFinding.findNonDuplicateElementsIter(testList1, emptyList2));
	}
	
	@Test
	public void findNonDuplicateElementsSetTest(){
		assertEquals(DuplicateFinding.findNonDuplicateElementsSet(testList1, testList2), correctResultList);
		assertNull(DuplicateFinding.findNonDuplicateElementsIter(testList1, nullList2));
		assertNull(DuplicateFinding.findNonDuplicateElementsIter(nullList1, nullList2));
		assertNull(DuplicateFinding.findNonDuplicateElementsIter(testList1, nullList2));
		assertNull(DuplicateFinding.findNonDuplicateElementsIter(emptyList1, nullList2));
		assertNull(DuplicateFinding.findNonDuplicateElementsIter(emptyList1, emptyList2));
		assertNull(DuplicateFinding.findNonDuplicateElementsIter(testList1, emptyList2));
	}
	
	@Test
	public void findDuplicatesInCollectionTest(){
		assertEquals(DuplicateFinding.findDuplicatesInCollection(testList1),duplicateList);
		assertNull(DuplicateFinding.findDuplicatesInCollection(emptyList2));
	}
	
	
	
}
