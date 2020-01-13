import java.util.Scanner;

/**
 * @author Premsai Manthani
 * @purpose :this programs perform theinsertion sort of a integer.
 * 
 */
public class InsertionSortInt {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		System.out.println("number of elements");
		int n = sc.nextInt();
		int arr[] = new int[n];

		System.out.println("Enters Entries");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Utility.insertionSortInt(arr);
		sc.close();
		long end = System.currentTimeMillis();
		System.out.println("Time is taken by to program in milli seconds " + (end - start));

	}

}
