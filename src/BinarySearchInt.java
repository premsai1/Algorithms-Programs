
public class BinarySearchInt {
	/**
	 * @author Premsai Manthani
	 * @purpose :this programs binary search of integer.
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int x = 9;

		int result = Utility.binarySearchInt(arr, x);
		if (result == -1) {
			System.out.println("Element Not Found");
		} else {
			System.out.println("found at position" + result);
		}
		long end = System.currentTimeMillis();
		System.out.println("Time is taken by to program in milli seconds " + (end - start));
	}

}
