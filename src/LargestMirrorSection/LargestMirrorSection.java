package LargestMirrorSection;

/*
 * Mirror section in an array is a group of contiguous elements such 
 * that somewhere in the array, the same group appears in reverse order. 
 */
public class LargestMirrorSection {

	/*
	 * method finding largest mirror sequence
	 * 
	 * @param an array sequence containing integer element
	 * 
	 * @return size of the sequence found
	 */
	public static int maxMirror(int[] arr) {
		int len = arr.length;

		if (len == 0) {
			throw new AssertionError("Array is Empty!");
		} 
	
		int count = 0;
		int max = 0;

		for (int i = 0; i < len; i++) {
			count = 0;
			for (int j = len - 1; i + count < len && j > -1; j--) {
				if (arr[i + count] == arr[j])
					count++;
				else {
					if (count > 0) {
						max = Math.max(count, max);
						count = 0;
					}
				}
			}
		}
		max = Math.max(count, max);
		return max;
	}

	public static void main(String[] args) {
		int[] arr = {};
		System.out.println(maxMirror(arr));
	}
}
