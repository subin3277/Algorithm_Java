package bronze3;

import java.util.Scanner;

public class no_2525 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		
		B=B+C;
		while(B>=60) {
			A++;
			B-=60;
		}
		while(A>=24)
			A-=24;
		System.out.println(A+" "+B);
	}
}
