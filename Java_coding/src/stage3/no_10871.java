package stage3;

import java.util.Scanner;

public class no_10871 {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		
		int N = num.nextInt();
		int X = num.nextInt();
		
		for(int i=0;i<N;i++) {
			int A = num.nextInt();
			if (A<X) {
				System.out.print(A);
			}
		}

	}

}
