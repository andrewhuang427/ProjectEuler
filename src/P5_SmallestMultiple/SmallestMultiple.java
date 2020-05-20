package P5_SmallestMultiple;
import java.util.*;
public class SmallestMultiple {

	// returns HashMap containing factorization of input, Hash Map maps base to exponent
	public static HashMap<Integer, Integer> getPrimeFactorization(int num){
		HashMap<Integer, Integer> factors= new HashMap<Integer,Integer>();
		for (int i = 2; i <= num; ++i) {
			if (num % i == 0) {
				if (factors.containsKey(i)) {
					int count = factors.get(i);
					++count;
					factors.put(i, count);
				}
				else {
					factors.put(i, 1);
				}
				num /= i;
				i = 1;
			}
		}
		return factors;
	}


	public static void main(String[] args) {
		
		// Approach 2: Generate smallest subset of numbers which contains elements which can be multiplied to achieve every 
		// number within the specified range
		
		HashMap<Integer, Integer> master = new HashMap<Integer,Integer>();      

		for (int i = 20; i >= 1; --i) {
			HashMap<Integer, Integer> factorization = getPrimeFactorization(i);

			for(Map.Entry mapElement : factorization.entrySet()) {

				int key = (int)mapElement.getKey();
				int value = (int)mapElement.getValue();

				if(master.containsKey(key)) {
					if(value > master.get(key)) {
						master.put(key, value);
					}
				}
				else {
					master.put(key, value);
				}

			}
		}

		System.out.println("Master...");
		System.out.println(master);
		
		int solution = 1;
		for(Map.Entry mapElement : master.entrySet()) {
			int base = (int)mapElement.getKey();
			int exp = (int)mapElement.getValue();
			solution *= Math.pow(base, exp);
		}
		System.out.println("Smallest Multiple..." + solution);

	}

	//	 Brute Force Solution

	//	boolean solutionNotFound = true;
	//	int solution = 0;
	//	int num = 2520;
	//	
	//	while(solutionNotFound) {
	//		num += 1;
	//		int counter = 0;
	//		for (int i = 1; i <= 20; ++i) {
	//			if (num % i == 0) {
	//				++counter;
	//			}
	//			else {
	//				break;
	//			}
	//		}
	//		if (counter == 20) {
	//			solution = num;
	//			solutionNotFound = false;
	//
	//		}
	//	}
	//	System.out.println("Smallest multiple of numbers 1-20 = " + solution);


}
