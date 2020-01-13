
import java.util.ArrayList;
/**
 * @author Premsai Manthani
 * @purpose :this programs is the utility class for all the algorithm programs 
 * 
 */
import java.util.Arrays;
import java.util.Scanner;

public class Utility {
	// check whether a string is Anagaram are not
	public static boolean isAnagramString(String str1, String str2) {
		if (str1.length() == str2.length()) {
			char a[] = str1.toCharArray();
			char b[] = str2.toCharArray();

			Arrays.sort(a);
			Arrays.sort(b);
			if (Arrays.equals(a, b)) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	public static int isAnagramInt(int a, int b) {
		int p = 0;
		String.valueOf(a);
		String.valueOf(b);

		return p;
	}

	public static boolean isAnagram(String n1, String n2) {

		char a[] = n1.toCharArray();
		char b[] = n2.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);
		if (Arrays.equals(a, b)) {
			return true;
		}
		return false;
	}

	// check whether a number is prime are not
	public static boolean isPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	// if it is prime no then it stores in a arraylist
	public static ArrayList<Integer> isPrimePallindrom(ArrayList<Integer> alist) {
		ArrayList<Integer> blist = new ArrayList<Integer>();
		for (int i = 0; i < alist.size(); i++) {
			int a = alist.get(i);
			int reverse = 0;
			while (a > 0) {
				int r = a % 10;
				reverse = reverse * 10 + r;
				a = a / 10;
			}
			if (reverse == alist.get(i)) {
				blist.add(reverse);
			}

		}
		return blist;
	}

	// this performs the binary search of a integer
	public static int binarySearchInt(int arr[], int x) {
		int l = 0;
		int r = arr.length - 1;

		while (l <= r) {
			int m = l + (r - l) / 2;
			if (arr[m] == x)
				return m;

			if (arr[m] < x)
				l = m + 1;
			else
				r = m - 1;
		}
		return -1;
	}

	// this performs the binary search of a string
	public static int binarySearchString(String arr[], String x) {
		int l = 0;
		int r = arr.length;
		while (l <= r) {
			int m = l + (r - 1) / 2;
			int val = x.compareTo(arr[m]);
			if (val == 0) {
				return m;
			}
			if (val > 0)
				l = m + 1;
			else
				r = m - 1;
		}
		return -1;
	}

	// this performs the bubblesort of a integer
	public static void bubbleSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	// this performs the bubble sort of a String
	public static void bubbleSortString(String arr[]) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].compareTo(arr[j]) > 0) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	// this performs the insertion sort of a integer
	public static void insertionSortInt(int arr[]) {

		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j = j - 1;
			}
			arr[j] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	// this performs the insertion sort of a String
	public static void insertionSortString(String arr[]) {
		for (int i = 1; i < arr.length; i++) {
			String temp = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1].compareTo(temp) > 0) {
				arr[j] = arr[j - 1];
				j = j - 1;
			}
			arr[j] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static void main(String[] args) {
	}
}
