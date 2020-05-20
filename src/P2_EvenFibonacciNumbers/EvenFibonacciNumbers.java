package P2_EvenFibonacciNumbers;
import java.util.Vector;
public class EvenFibonacciNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<>();
		v.add(1);
		v.add(2);

		int sum = 2;
		
		int lIndex = 0;
		int rIndex = 1;
		int nextVal = 0;

		while(nextVal <= 4000000) {
			nextVal = v.get(lIndex) + v.get(rIndex);
			if (nextVal <= 4000000) {
				v.add(nextVal);
			}
			if (nextVal % 2 == 0) {
				sum += nextVal;
			}
			++lIndex;
			++rIndex;
		}

		System.out.println(v);
		System.out.println(sum);




	}

}
