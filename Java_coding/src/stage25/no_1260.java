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
		int N = in.nextInt(); //���� ����
		int M = in.nextInt(); //���� ����
		int V = in.nextInt(); //���� ��ȣ

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
		} //�������� ����
		
		in.close();
		
		DFS(N,M,V);
		System.out.println();
		for(int i=1;i<N+1;i++) {
			Collections.sort(list[i]);
		} //�������� ����
		BFS(N,M,V);
	}
	
	//���� �켱
	public static void DFS(int N, int M, int V) {
		
		boolean[] visited = new boolean[N+1];
		
		for(int i=1;i<N+1;i++) 
			visited[i] = false;
		
		Stack<Integer> stack = new Stack<>();
		stack.add(V);
		
		while(!stack.isEmpty()) {
			int cur_node= stack.pop(); //��� ������ ����
			if(!visited[cur_node])
				System.out.print(cur_node+" ");
			visited[cur_node] = true;
			
			for(int i :list[cur_node]) {
				if(!visited[i])
					stack.add(i);
			}
			
			
		}	
	}
	
	//�ʺ� �켱
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
