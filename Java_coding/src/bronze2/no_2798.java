package bronze2;

import java.util.Scanner;

public class no_2798 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int M = in.nextInt();
		int[] lst = new int[N];
		for(int i=0;i<N;i++) {
			lst[i] = in.nextInt();
		}
		in.close();
		
		int ans = 0;
		
		//¿ÏÀü Å½»ö
		for(int i=0;i<N-2;i++) {
			for(int j=i+1;j<N-1;j++) {
				for(int k=j+1;k<N;k++) {
					int tmp = lst[i] + lst[j] + lst[k];
					if (tmp <= M && tmp > ans) {
						ans = tmp;
					}
				}
			}
		}
		
		System.out.print(ans);
	}

}
