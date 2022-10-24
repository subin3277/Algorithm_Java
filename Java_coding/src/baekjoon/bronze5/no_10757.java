package bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class no_10757 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		BigInteger A = scanner.nextBigInteger();
		BigInteger B = scanner.nextBigInteger();
		scanner.close();

		System.out.println(A.add(B));
	}

}
