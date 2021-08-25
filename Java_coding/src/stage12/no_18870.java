package stage12;

import java.util.Scanner;

public class no_18870 {
	
	private static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int[] lenarr = new int[N];
		
		for(int i=0;i<N;i++) {
			int num = in.nextInt();
			lenarr[i] = num;
		}
		in.close();
		
		for(int i=0;i<N;i++) {
			int rank = 0;
			for(int j = 0; j < N; j++) {
				if(i == j) continue;
				if (lenarr[i] > lenarr[j]) {
					rank++;
				}
			}
			sb.append(rank).append(" ");
		}
		System.out.println(sb.toString());
	}

}
