package stage15;

import java.util.Scanner;

public class no_1003 {

	static int count0, count1;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		for(int i=0;i<T;i++) {
			int N = in.nextInt();
			count0 = 0;
			count1 = 0;
			fibonacci(N);
			System.out.println(count0+" "+count1);
		}
		in.close();
	}
	
	public static int fibonacci(int n) {
		if(n==0) {
			count0++;
			return 0;
		} else if(n==1) {
			count1++;
			return 1;
		} else {
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}
}
