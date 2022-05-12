package stage25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class no_24479 {

	static boolean[] visited;
	static ArrayList<Integer>[] list;
	static int[] count;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); //정점의 수
		int M = in.nextInt(); //간선의 수
		int R = in.nextInt();// 시작 정점

		visited = new boolean[N+1];
		list = new ArrayList[N+1];
		count = new int[N+1];
		
		for(int i=1;i<N+1;i++) {
			list[i] = new ArrayList<Integer>();
			visited[i] = false;
			count[i] = 0;
		}
		
		for(int i=1;i<M+1;i++) {
			int a =in.nextInt();
			int b = in.nextInt();
			list[a].add(b);
			list[b].add(a);
		}
		
		for(int i=1;i<N+1;i++) {
			Collections.sort(list[i],Collections.reverseOrder());
		}
		
		in.close();
	
		DFS(R);
		
		for(int i=1;i<N+1;i++) {
			System.out.println(count[i]);
		}
	}
	
	public static void DFS(int R) {
		
		Stack<Integer> stack = new Stack<>();
		stack.add(R);
		int cnt = 1;
		
		while(!stack.isEmpty()) {
			int cur_node= stack.pop(); //노드 꺼내고 삭제
			visited[cur_node] = true;
			if(count[cur_node]==0) {
				count[cur_node]= cnt;
				cnt++;
			}
			for(int i :list[cur_node]) {
				if(!visited[i])
					stack.add(i);
			}
			
		}		
	}
}
