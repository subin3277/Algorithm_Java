package stage2;

import java.util.Scanner;

public class no_2480 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int max = 0;
		int A = in.nextInt();
		if(A>max)
			max = A;
		int B = in.nextInt();
		if(B>max)
			max = B;
		int C = in.nextInt();
		if(C>max)
			max = C;
		
		int res = 0;
		
		if(A==B&&B==C)
			res = 10000+A*1000;
		else if(A==B||A==C)
			res = 1000 + A*100;
		else if(B==C)
			res = 1000+B*100;
		else
			res = max*100;
			
		System.out.println(res);
	}

}
