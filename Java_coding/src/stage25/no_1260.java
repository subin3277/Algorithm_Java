package stage25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class no_1260 {

	static ArrayList<Integer>[] list;
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); //정점 개수
		int M = in.nextInt(); //간선 개수
		int V = in.nextInt(); //정점 번호

		list = new ArrayList[N+1];
		
		for(int i=1;i<N+1;i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		for(int i=1;i<M+1;i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			list[a].add(b);
			list[b].add(a);
		}
		
		for(int i=1;i<N+1;i++) {
			Collections.sort(list[i],Collections.reverseOrder());
		} //오름차순 정렬
		
		in.close();
		
		DFS(N,M,V);
		System.out.println();
		for(int i=1;i<N+1;i++) {
			Collections.sort(list[i]);
		} //내림차순 정렬
		BFS(N,M,V);
	}
	
	//깊이 우선
	public static void DFS(int N, int M, int V) {
		
		boolean[] visited = new boolean[N+1];
		
		for(int i=1;i<N+1;i++) 
			visited[i] = false;
		
		Stack<Integer> stack = new Stack<>();
		stack.add(V);
		
		while(!stack.isEmpty()) {
			int cur_node= stack.pop(); //노드 꺼내고 삭제
			if(!visited[cur_node])
				System.out.print(cur_node+" ");
			visited[cur_node] = true;
			
			for(int i :list[cur_node]) {
				if(!visited[i])
					stack.add(i);
			}
			
			
		}	
	}
	
	//너비 우선
	public static void BFS(int N, int M, int V) {
		
		boolean[] visited = new boolean[N+1];
		
		for(int i=1;i<N+1;i++) 
			visited[i] = false;
		
		LinkedList<Integer> queue = new LinkedList<>();
		visited[V] = true;
		queue.add(V);
		
		while(!queue.isEmpty()) {
			int cur_node = queue.poll();
			System.out.print(cur_node+" ");
			for(int i : list[cur_node]) {
				if(visited[i] == false) {
					visited[i] = true;
					queue.add(i);
				}
			}
		}
		
	}

}
