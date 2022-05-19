package stage25;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class no_2178 {

	static int N;
	static int M;
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		M = in.nextInt();
		int[][] list= new int[N][M];
		for(int i=0;i<N;i++) {
			String str = in.next();
			for(int j=0;j<M;j++) {
				list[i][j] = str.charAt(j)-'0'; 
			}
		}
		
		boolean[][] visited = new boolean[N][M];
		visited[0][0] = true;
		BFS(0,0,list,visited);
		System.out.println(list[N-1][M-1]);
	}
	
	public static void BFS(int x, int y,int[][] list, boolean[][] visited) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {x,y});
		
		while(!queue.isEmpty()) {
			int now[] = queue.poll();
			int nowX = now[0];
			int nowY = now[1];
			
			for(int i=0;i<4;i++) {
				int nextX = nowX+dx[i];
				int nextY = nowY+dy[i];
				
				if(nextX<0||nextY<0||nextX>=N||nextY>=M)
					continue;
				if(visited[nextX][nextY]||list[nextX][nextY]==0)
					continue;
				
				queue.add(new int[] {nextX, nextY});
				list[nextX][nextY] = list[nowX][nowY] +1;
				visited[nextX][nextY] = true;
			}
		}
	}
}
