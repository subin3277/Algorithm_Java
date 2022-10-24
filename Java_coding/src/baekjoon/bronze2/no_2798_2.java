package bronze2;

import java.util.Scanner;

public class no_2798_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int M = in.nextInt();
		
		int[] list = new int[N]; 
		for(int i=0;i<N;i++) {
			list[i]=in.nextInt();
		}
		in.close();
		
		int close=0;
		for(int i=0;i<N-2;i++) {
			for(int j=i+1;j<N-1;j++) {
				for(int k=j+1;k<N;k++) {
					int sum = list[i]+list[j]+list[k];
					if(sum<=M) {
						if((Math.abs(M-sum))<(Math.abs(M-close))) {
						close=sum;
						}
					}
					
				}
			}
		}
		System.out.println(close);
	}
}
