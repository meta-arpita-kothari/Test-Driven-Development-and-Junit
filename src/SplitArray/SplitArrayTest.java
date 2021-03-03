package SplitArray;

import static org.junit.Assert.*;

import org.junit.Test;

public class SplitArrayTest {

	/*
	 * Test function return correct index
	 */
	@Test
	public void shouldReturnIndexToSplitArrayTest() {
		int elementsArray[] = { 1, 1, 1, 2, 1 };
		int resultIndex = SplitArray.splitArray(elementsArray);

		assertEquals(3, resultIndex);
	}

	/*
	 * Test function return -1 as no index is found
	 */
	@Test
	public void shouldReturnIndexToSplitArrayTest1() {
		int elementsArray[] = { 2, 1, 1, 2, 1 };
		int resultIndex = SplitArray.splitArray(elementsArray);

		assertEquals(-1, resultIndex);
	}

	//negative test case
	@Test
	public void negativeCaseToReturnIndexToSplitArrayTest() {
		int elementsArray[] = { 10, 7, 9, 8 };
		int resultIndex = SplitArray.splitArray(elementsArray);

		assertNotEquals(4, resultIndex);
	}

	@Test
	public void shoudlReturnErrorOnEmptyArrayTest() {
		int elementsArray[] = {};

		try {
			int resultIndex = SplitArray.splitArray(elementsArray);
		} catch (AssertionError e) {
			assertEquals(e.getMessage(), "Array is Empty!");
		}
	}

	//negative test case
	@Test
	public void negativeCaseToReturnIndexToSplitArray() {
		int elementsArray[] = { 1, 2, 3, 8, 9, 3, 2, 1 };
		int resultIndex = SplitArray.splitArray(elementsArray);

		assertNotEquals(4, resultIndex);  
	}
}
