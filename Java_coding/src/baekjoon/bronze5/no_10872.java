package bronze5;

import java.util.Scanner;

public class no_10872 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		in.close();
		
		int sum = getnum(N);
		System.out.println(sum);
	}

	public static int getnum(int A) {
		if(A<=1)
			return 1;
		return A*getnum(A-1);
	}
}
