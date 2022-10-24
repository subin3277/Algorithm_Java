package bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class no_2338 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		BigInteger A = in.nextBigInteger();
		BigInteger B = in.nextBigInteger();
		in.close();
		
		System.out.println(A.add(B));
		System.out.println(A.subtract(B));
		System.out.println(A.multiply(B));
	}

}
