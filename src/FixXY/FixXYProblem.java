package FixXY;

import java.util.Arrays;

/*
 * Return an array that contains exactly the same numbers as the input array, 
 * but rearranged so that every X is immediately followed by a Y. 
 * Do not move X within the array, but every other number may move. 
 */
public class FixXYProblem {

	public static int[] fixXY(int[] numArray, int X, int Y) {
		int len = numArray.length;
		int countX = 0, countY = 0; // to check X & Y are equal
		
		if (len == 0) {
			throw new AssertionError("Array is Empty!");
		}

		if (numArray[len - 1] == X) {
			throw new AssertionError(
					"X value occurs at the last index of the array!");
		}
		
		for(int i =0;i<len;i++){
			if (numArray[i] == X && numArray[i + 1] == X){
				throw new AssertionError("Two adjacents X values are there!");
			}
			// count to check X & Y are equal or not
			if(numArray[i] == X)
				countX++;
			if(numArray[i] == Y)
				countY++;
		}
		
		if(countX != countY){
			throw new AssertionError("There are unequal numbers of X and Y in the input array!");
		}
		int j = 0;
		for (int i = 0; i < len - 1; ++i) {
				
				if (numArray[i] == X && numArray[i + 1] != Y) {
					/*
					 * Need to find the next movable Y That means an element
					 * that is Y and either is the first element or is preceded
					 * by anything other than X
					 */
					while (numArray[j] != Y || (j != 0 && numArray[j - 1] == X)) {
						j++;
					}
					numArray[j] = numArray[i + 1];
					numArray[i + 1] = Y;
				}			
		}
		
		
		return numArray;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 5,1, 4, 4, 2  };

		int[] res = fixXY(arr, 4, 5);
		System.out.println(Arrays.toString(res));
	}

}
