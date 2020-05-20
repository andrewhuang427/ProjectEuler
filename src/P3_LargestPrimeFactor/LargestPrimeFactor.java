package P3_LargestPrimeFactor;

public class LargestPrimeFactor {

	public static void main(String[] args) {

		long A = 2520;
		long C = 1L;
		for (long i = 2; i <= A; ++i) {
			System.out.println(i);
			if (A % i ==0) {
				A /= i;
				C = i;
				i = 1;
				System.out.println("A: " + A + " C: " + C);

			}
		}
		System.out.println(C);
	}
}
