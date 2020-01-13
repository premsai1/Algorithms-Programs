import java.util.ArrayList;

/**
 * @author Premsai Manthani
 * @purpose :this programs perform whether a prime no r not.
 * 
 */
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		ArrayList<Integer> alist = new ArrayList<Integer>();

		for (int i = 0; i <= 1000; i++) {
			if (Utility.isPrime(i)) {
				alist.add(i);
			}
		}
		System.out.println(alist);
		long end = System.currentTimeMillis();
		System.out.println("Time is taken by to program in milli seconds " + (end - start));

	}
}