package bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class no_1271 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		BigInteger n = in.nextBigInteger();
		BigInteger m = in.nextBigInteger();
		
		BigInteger res1 = n.divide(m);
		BigInteger res2 = n.remainder(m);
		
		in.close();
		System.out.println(res1);
		System.out.println(res2);
	}
}
