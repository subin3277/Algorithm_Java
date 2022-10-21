package stage9;

import java.util.Scanner;

public class no_11653 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int A=N;
		for (int i=2;i<N+1;i++) {
			if (A==1)
				break;
			else if (A%i==0) {
				System.out.println(i);
				A=A/i;
				i-=1;
			}
			
		}
		scanner.close();

	}

}
