import java.util.ArrayList;

/**
 * @author Premsai Manthani
 * @purpose :this programs performs a primr pallindrome check .
 * 
 */
public class PrimePallindrom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		ArrayList<Integer> alist = new ArrayList<Integer>();
		ArrayList<Integer> blist = new ArrayList<Integer>();

		for (int i = 0; i <= 1000; i++) {
			if (Utility.isPrime(i)) {
				alist.add(i);
			}
		}

		System.out.println(alist);
		blist = Utility.isPrimePallindrom(alist);
		System.out.println(blist);

		long end = System.currentTimeMillis();

		System.out.println("Time is taken by to program in milli seconds " + (end - start));

	}

}
