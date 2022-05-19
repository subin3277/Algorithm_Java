package stage25;

import java.util.Scanner;

public class no_1012 {

	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int i=0;i<T;i++) {
			int M = in.nextInt();
			int N = in.nextInt();
			int K = in.nextInt();
			int[][] list = new int[M][N];
			boolean[][] visited = new boolean[M][N];
			int count = 0;
			for(int j=0;j<K;j++) {
				int a = in.nextInt();
				int b = in.nextInt();
				list[a][b] = 1;
			}
			for(int j=0;j<M;j++) {
				for(int k=0;k<N;k++) {
					if(list[j][k]==1 && !visited[j][k]) {
						count++;
						DFS(list,visited,j,k,M,N);
					}
				}
			}
			System.out.println(count);
		}
		in.close();
	}
	
	public static void DFS(int[][] list, boolean[][] visited, int x, int y, int n,int m) {
		visited[x][y] = true;
		
		for(int i=0;i<4;i++) {
			int nx= x+dx[i];
			int ny= y+dy[i];
			if(nx>=0&&ny>=0&&nx<n&&ny<m) {
				if(list[nx][ny]==1 && !visited[nx][ny])
					DFS(list,visited,nx,ny,n,m);
			}
		}
	}
}
