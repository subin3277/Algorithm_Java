package stage9;

import java.util.Scanner;

public class no_1978 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int count=0;
		for(int i=0;i<N;i++) {
			int A = scanner.nextInt();
			int prime=0;
			for (int j=1;j<A+1;j++) {
				if(A%j==0)
					prime++;
			}
			if(prime==2)
				count++;
		}
		scanner.close();
		System.out.println(count);
	}

}
