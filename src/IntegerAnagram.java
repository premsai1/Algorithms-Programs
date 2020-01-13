import java.util.Scanner;


public class IntegerAnagram {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		String n1 = sc.next();
		System.out.println("Enter the second Number");
		String n2 = sc.next();
		System.out.println(Utility.isAnagram(n1, n2));
		sc.close();
		long end = System.currentTimeMillis();
		System.out.println("Time is taken by to program in milli seconds "+(end-start));
		
	}

}
