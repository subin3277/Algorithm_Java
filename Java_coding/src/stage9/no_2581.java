package stage9;

import java.util.Scanner;

public class no_2581 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int sum=0;
		int min=B;
		for(int i=A;i<B+1;i++) {
			int prime=0;
			for (int j=1;j<i+1;j++) {
				if(i%j==0)
					prime++;
			}
			if(prime==2) {
				sum+=i;
				if(i<min) {
					min=i;
				}
			}
		}
		if(sum==0) {
			System.out.println("-1");
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
		scanner.close();
	}

}
