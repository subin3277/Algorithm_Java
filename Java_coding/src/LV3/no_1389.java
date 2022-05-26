package LV3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class no_1389 {

	static int[][] list;
	static boolean[] visited;
	static int res;
	static int[] marked;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); //蜡历荐
		int M = in.nextInt(); //模备包拌荐
		list = new int[N+1][N+1];
		visited = new boolean[N+1];
		marked = new int[N+1];
		for(int i=0;i<M;i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			list[a][b] = list[b][a]=1;
		}
		in.close();
		
		for(int i =1;i<N+1;i++) {
			visited = new boolean[N+1];
			BFS(i);
		}
		
		System.out.println(res);
	}

	public static void BFS(int start) {
		Queue<Integer> queue = new LinkedList<>();
		int count = 0;
		
		visited[start] = true;
		queue.offer(start);
		
		while(!queue.isEmpty()) {
			int tmp = queue.poll();
			for(int i : list[tmp]) {
				if(marked[i] == 0 & !visited[i]) {
					queue.offer(i);
					visited[i] = true;
					
					marked[i] = marked[tmp]+1;
				}
			}
		}
	}
}
