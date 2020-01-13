import java.util.Scanner;

/**
 * @author Premsai Manthani
 * @purpose :this programs perform theinsertion sort of a string.
 * 
 */

public class InsertionSortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		System.out.println("number of Strings");
		int n = sc.nextInt();
		String arr[] = new String[n + 1];

		System.out.println("Enters Entries");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLine();
		}
		Utility.insertionSortString(arr);
		sc.close();
		long end = System.currentTimeMillis();
		System.out.println("Time is taken by to program in milli seconds " + (end - start));
	}

}
