package stage25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class no_24444 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); //정점의 수
		int M = in.nextInt(); //간선의 수
		int R = in.nextInt();// 시작 정점

		boolean[] visited = new boolean[N+1];
		int[] count = new int[N+1];
		ArrayList<Integer>[] list = new ArrayList[N+1];
		
		for(int i=1;i<N+1;i++) {
			list[i] = new ArrayList<Integer>();
			visited[i] = false;
			count[i] = 0;
		}
		
		for(int i=1;i<M+1;i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			list[a].add(b);
			list[b].add(a);
		}
		
		for(int i=1;i<N+1;i++) {
			Collections.sort(list[i]);
		} //오름차순 정렬
		
		in.close();
		
		LinkedList<Integer> queue = new LinkedList<>();
		visited[R] = true;
		queue.add(R);
		int cnt= 1;
		
		while(!queue.isEmpty()) {
			int cur_node = queue.poll();
			if(count[cur_node]==0) {
				count[cur_node]= cnt;
				cnt++;
			}
			for(int i : list[cur_node]) {
				if(visited[i] == false) {
					visited[i] = true;
					queue.add(i);
				}
			}
		}
		
		
		for(int i=1;i<N+1;i++) {
			System.out.println(count[i]);
		}
	}

}
