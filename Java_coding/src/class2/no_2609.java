package class2;

import java.util.Scanner;

public class no_2609 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int M = in.nextInt();
		in.close();
		
		int A = N;
		int B = M;
		while(A!=B) {
			if(A>B) {
				A=A-B;
			}
			else if (A<B)
				B=B-A;
		}
		System.out.println(A);
		System.out.println(N*M/A);
	}

}
