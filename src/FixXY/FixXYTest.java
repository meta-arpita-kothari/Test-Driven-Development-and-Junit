 package FixXY;

 import static org.junit.Assert.*;

 import org.junit.Test;

 public class FixXYTest {

 	/*
 	 * Test function return correct index
 	 */
 	@Test
 	public void shouldReturnFixed_X_Y_Array() {
 		int elementsArray[] = { 5, 4, 9, 4, 9, 5};
 		int[] outputArray = FixXYProblem.fixXY(elementsArray,4,5);
 		int[] expectedArray = {9, 4, 5, 4, 5, 9};
 		assertArrayEquals(expectedArray, outputArray);
 	}

 	//negative test case
 	@Test
 	public void negativeCaseToReturnFixed_X_Y_Array() {
 		int elementsArray[] = { 1, 4, 1, 5, 5, 4, 1 };
 		int[] outputArray = FixXYProblem.fixXY(elementsArray,4,5);
 		int[] expectedArray = {1, 4, 5, 1, 5, 4, 1};
 		assertFalse(expectedArray.equals(outputArray));
 	}
 	
 	/*
 	 * If array is empty
 	 */
 	@Test
 	public void shoudlReturnErrorOnEmptyArrayTest() {
 		int elementsArray[] = {};

 		try {
 			int[] outputArray = FixXYProblem.fixXY(elementsArray,4,5);
 		} catch (AssertionError e) {
 			assertEquals(e.getMessage(), "Array is Empty!");
 		}
 	}

 	
 	/*
 	 * If there are unequal numbers of X and Y in the input array.
 	 */
 	@Test
 	public void shoudlReturnErrorOn_Unequal_X_Y() {
 		int elementsArray[] = {1, 4, 1, 5, 2, 4, 1};

 		try {
 			int[] outputArray = FixXYProblem.fixXY(elementsArray,4,5);
 		} catch (AssertionError e) {
 			assertEquals(e.getMessage(), "There are unequal numbers of X and Y in the input array!");
 		}
 	}

 	
 	/*
 	 * If two adjacent X values are there.
 	 */
 	@Test
 	public void shoudlReturnErrorOn_TwoAdjacentX_Value() {
 		int elementsArray[] = {1, 4, 1, 5, 4, 4, 5, 2};

 		try {
 			int[] outputArray = FixXYProblem.fixXY(elementsArray,4,5);
 		} catch (AssertionError e) {
 			assertEquals(e.getMessage(), "Two adjacents X values are there!");
 		}
 	}

 	/*
 	 * If X occurs at the last index of the array.
 	 */
 	@Test
 	public void shoudlReturnErrorOnX_ValueAtLastPosition() {
 		int elementsArray[] = {1, 4, 1, 5, 5, 1, 4};

 		try {
 			int[] outputArray = FixXYProblem.fixXY(elementsArray,4,5);
 		} catch (AssertionError e) {
 			assertEquals(e.getMessage(), "X value occurs at the last index of the array!");
 		}
 	}

 

 }
