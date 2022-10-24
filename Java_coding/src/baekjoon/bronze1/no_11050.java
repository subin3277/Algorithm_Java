package bronze1;

import java.util.Scanner;

public class no_11050 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int K = in.nextInt();

		int res = (factorial(N))/(factorial(K)*factorial(N-K));
		System.out.println(res);
		in.close();
	}

	public static int factorial(int A) {
		if(A<=1)
			return 1;
		return A*factorial(A-1);
	}
}
