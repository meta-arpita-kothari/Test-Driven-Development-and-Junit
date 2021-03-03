package CountClump;
/*
 * Clump in an array is a series of 2 or more adjacent elements of the same value.
 */
public class CountClump {

	public static int noOfClump(int[] arr){
		if(arr.length == 0){
			throw new AssertionError("Array is Empty!");
		}
		
		int noOfItems = arr.length;
		int countClumps = 0;
		boolean flag = false;
		
		for(int i =0;i< noOfItems-1 ;i++){
			if(arr[i]==arr[i+1]) //condition satisfying clumps
        	{
        		if(!(flag))
        		{
        			flag=true;
        			countClumps++;
        		}
        	}
        	else
    		{
    			flag=false;
    		}
		}
		
		
		return countClumps;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3};
		System.out.println(CountClump.noOfClump(arr));
	}

}
