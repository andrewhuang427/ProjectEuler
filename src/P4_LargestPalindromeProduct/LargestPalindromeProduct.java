package P4_LargestPalindromeProduct;

public class LargestPalindromeProduct {

	public static int reverse(int num) {
		int nextDigit;
		int rev = 0;
		while(num > 0) {
			nextDigit = num % 10;
			rev = rev * 10 + nextDigit;
			num = (num - nextDigit)/10;
		}
		return rev;
	}
	public static void main(String[] args) {
		int largestPalindrome = 0;
		int product;
		for (int i = 999; i >= 100; --i) {
			for (int j = 999; j >= 100; --j) {
				product = i * j;
				int reverse = reverse(product);
				if (product == reverse && product > largestPalindrome) {
					largestPalindrome = product;
				}
				
			}
		}
		System.out.println("Largest palindrome product = " + largestPalindrome); 

	}

}
