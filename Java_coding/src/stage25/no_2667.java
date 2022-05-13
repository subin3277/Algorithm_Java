package stage25;

import java.util.Arrays;
import java.util.Scanner;

public class no_2667 {

	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	static boolean[][] visited;
	static char[][] list;
	static int count=0;
	static int[] aparts;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); //지도크기
		
		list = new char[N][N];
		visited = new boolean[N][N];
		aparts = new int[N*N];
		
		for(int i=0;i<N;i++) {
			String str = in.next();
			list[i] = str.toCharArray();
		}
		in.close();

		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(list[i][j] == '1' && !visited[i][j]) {
					count++;
					DFS(i,j,N);
				}
			}
		}
		
		Arrays.sort(aparts);
		System.out.println(count);
		
		for(int i=0;i<aparts.length;i++) {
			if(aparts[i]!=0)
				System.out.println(aparts[i]);
		}
	}
	
	public static void DFS(int x, int y, int n) {
		visited[x][y] = true;
		aparts[count]++;
		
		for(int i=0;i<4;i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(nx>=0&&ny>=0&&nx<n&&ny<n) {
				if(list[nx][ny] == '1' && !visited[nx][ny])
					DFS(nx,ny,n);
			}
		}
	}

}
