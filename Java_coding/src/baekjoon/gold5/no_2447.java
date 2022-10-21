package stage10;

import java.util.Scanner;

public class no_2447 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		in.close();
		
		String[][] arr = new String[N][N];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j] = " ";
			}
		}
		
		star(arr,0,0,N);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		System.out.print(sb);
	}
	
	public static void star(String[][] arr,int x, int y, int N) {
		if (N==1) {
			arr[x][y]="*";
			return;
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(!(i==1&&j==1)) {
					star(arr,x+i*(N/3),y+j*(N/3),N/3);
				}
			}
		}
	}
	
}
