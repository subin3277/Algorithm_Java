package stage10;

import java.util.Scanner;

public class no_10870 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		in.close();

		int sum = getnum(N);
		System.out.println(sum);
	}
	
	public static int getnum(int A) {
		if(A==0)
			return 0;
		else if(A==2||A==1)
			return 1;
		return getnum(A-2)+getnum(A-1);
	}

}
