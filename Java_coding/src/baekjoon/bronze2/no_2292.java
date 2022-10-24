package bronze2;

import java.util.Scanner;

public class no_2292 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		int N = scanner.nextInt();
		int A=0;
		for(int i=0;i<N;i++) {
			A+=i;
			if(N<=1+6*A) {
				System.out.println(i+1);
				break;
			}
		}
		scanner.close();
	}
}
