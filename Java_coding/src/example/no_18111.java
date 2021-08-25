package example;

import java.util.Scanner;

public class no_18111 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int B = scanner.nextInt();
		int[][] land = new int[N][M];
		for (int i=0;i<M;i++) {
			//int[] width = new int[M];
			for(int j=0;j<N;j++) {
				int a = scanner.nextInt();
				land[i][j]=a;
			}
		}
		scanner.close();
		
		
		

	}

}
