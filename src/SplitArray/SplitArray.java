package SplitArray;

/*
 * Return the index if there is a place to split the input array 
 * so that the sum of the numbers on one side is equal to the sum of the numbers
 * on the other side else return -1.
 */
public class SplitArray {

	public static int splitArray(int[] arr){
		if(arr.length == 0)
    	{
    		throw new AssertionError("Array is Empty!");
    	}
    	else
    	{
	        int leftSum = 0; //sum of element of one split
	        int rightSum = 0; //sum of elements of other split
	        int index = -1; //index where array is split
	        for (int i = 0; i < arr.length; i++) {
	            leftSum += arr[i];
	            for (int j = i + 1; j < arr.length; j++) {
	                rightSum += arr[j];
	            }
	
	            if (leftSum == rightSum) {
	                index = i + 1;
	                break;
	            } else {
	                rightSum = 0;
	                continue;
	            }
	        }
	        return index;
    	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,1,2,1};
		System.out.println(SplitArray.splitArray(arr));
	}

}
