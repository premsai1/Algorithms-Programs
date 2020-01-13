
public class BinarySearchString {

	/**
	 * @author Premsai Manthani
	 * @purpose :this programs performs binary search of a string.
	 * 
	 */
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		String arr[] = { "ank", "bnk", "cnk", "dnk", "enk" };
		String x = "bnk";
		int result = Utility.binarySearchString(arr, x);

		if (result == -1) {
			System.out.println("Element dont Found");
		} else {
			System.out.println("found at index ==>> " + result);
		}
		long end = System.currentTimeMillis();
		System.out.println("Time is taken by to program in milli seconds " + (end - start));
	}

}
