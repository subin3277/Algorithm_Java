package bronze1;

import java.util.Scanner;

public class no_2775 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		int T = scanner.nextInt();
		for (int i=0;i<T;i++) {
			int k = scanner.nextInt();
			int n = scanner.nextInt();
			System.out.println(sum(k,n));
		}
		scanner.close();

	}
	
	private static int sum(int k,int n) {
		if (k==0) {
			return n;
		} else if (n==0) {
			return 0;
		} else {
			return sum(k-1,n)+sum(k,n-1);
		}
	}

}
