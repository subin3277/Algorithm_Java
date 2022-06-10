package stage12;

import java.util.Scanner;

public class no_18870 {
	
	private static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int[] list = new int[N];
		int[] rank = new int[N];
		for(int i=0;i<N;i++) {
			list[i] = in.nextInt();
			rank[i] = 0;
		}
		
		for(int i=0;i<N-1;i++) {
			for(int j=i+1;j<N;j++) {
				if(list[i]>list[j]) {
					rank[i]++;
				}
				else if(list[i]<list[j])
					rank[j]++;
			}
		}
		
		for(int i=0;i<N;i++) {
			sb.append(rank[i]).append(" ");
		}
		System.out.println(sb);
		
	}

}
