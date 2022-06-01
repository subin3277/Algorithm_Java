package class2;

import java.util.Scanner;

public class no_7568 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[][] list = new int[N][2];
		int[] rank = new int[N];
		
		for(int i=0;i<N;i++) {
			int A = in.nextInt();
			int B = in.nextInt();
			list[i][0] = A;
			list[i][1] = B;
			rank[i] = N;
		}
		
		for(int i =0;i<N-1;i++) {
			for(int j=i+1;j<N;j++) {
				if(list[i][0]>list[j][0]&&list[i][1]>list[j][1]) {
					rank[i]--;
				} else if(list[i][0]<list[j][0]&&list[i][1]<list[j][1])
					rank[j]--;
				else {
					rank[i]--;
					rank[j]--;
				}
			}
		}
		
		for(int i=0;i<N;i++)
			System.out.print(rank[i]+" ");

	}

}
