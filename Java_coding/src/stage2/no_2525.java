package stage2;

import java.util.Scanner;

public class no_2525 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		
		if(B+C>=60) {
			int num = (B+C)/60;
			A+=num;
			B=B+C-(num*60);
		} else
			B=B+C;
		if(A>=24)
			A-=24;
		System.out.println(A+" "+B);

	}

}
