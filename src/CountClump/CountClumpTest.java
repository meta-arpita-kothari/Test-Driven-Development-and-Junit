package CountClump;

import static org.junit.Assert.*;

import org.junit.Test;

import SplitArray.SplitArray;

public class CountClumpTest {

	/*
	 * Test function return correct count of clump
	 */
	@Test
	public void shouldReturnCountOfClumpTest() {
		int elementsArray[] = { 1, 1, 1, 2, 1 };
		int resultIndex = CountClump.noOfClump(elementsArray);

		assertEquals(1, resultIndex);
	}

	/*
	 * Test function return 0 when no clump is found
	 */
	@Test
	public void shouldReturnCountOfClumpTest1() {
		int elementsArray[] = { 1,2,3,4};
		int resultIndex = CountClump.noOfClump(elementsArray);

		assertEquals(0, resultIndex);
	}

	//negative test case
	@Test
	public void negativeCaseToCountOfClumpTest() {
		int elementsArray[] = { 1, 2, 2, 3, 4, 4 };
		int resultIndex = CountClump.noOfClump(elementsArray);

		assertNotEquals(4, resultIndex);
	}

	@Test
	public void shoudlReturnErrorOnEmptyArrayTest() {
		int elementsArray[] = {};

		try {
			int resultIndex = CountClump.noOfClump(elementsArray);
		} catch (AssertionError e) {
			assertEquals(e.getMessage(), "Array is Empty!");
		}
	}

	//negative test case
	@Test
	public void negativeCaseToCountOfClumpTest2() {
		int elementsArray[] = { 1, 2, 3, 8, 9, 3, 2, 1 };
		int resultIndex = CountClump.noOfClump(elementsArray);

		assertNotEquals(4, resultIndex);  
	}
}


