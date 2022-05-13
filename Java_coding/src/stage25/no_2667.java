package stage25;

import java.util.Scanner;

public class no_2667 {

	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	static boolean[][] visited;
	static char[][] list;
	static int count=0;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); //지도크기
		
		list = new char[N][N];
		visited = new boolean[N][N];
		
		for(int i=0;i<N;i++) {
			String str = in.next();
			list[i] = str.toCharArray();
		}
		in.close();

		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(list[i][j] == 1 && !visited[i][j]) {
					count++;
					DFS(i,j);
				}
			}
		}
	}
	
	public static void DFS(int i, int j) {
		visited[x][y] = true;
		
	}

}
