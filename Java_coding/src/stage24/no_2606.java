package stage24;

import java.util.LinkedList;
import java.util.Scanner;

public class no_2606 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int M = in.nextInt();
		
		int[][] node = new int[N+1][N+1]; // 그래프 배열
		int[] check = new int[N+1]; //방문 배열
		
		for(int i=0;i<M;i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			node[a][b] = 1;
			node[b][a] = 1;
		}
		
		LinkedList<Integer> queue = new LinkedList<>();
		check[1] = 1;
		queue.offer(1);
		int count = 0;
		
		while(!queue.isEmpty()) {
			int x = queue.poll();
			for(int i=0;i<node.length;i++) {
				if(node[x][i]==1 && check[i]!=1) {
					queue.offer(i);
					check[i] = 1;
					count++;
				}
			}
		}
		
		System.out.println(count);
	}

}
