package silver1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class no_1389 {

	static ArrayList<Integer>[] list;
	static boolean[] visited;
	static int[] marked;
	static int N;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		N = in.nextInt(); //蜡历荐
		int M = in.nextInt(); //模备包拌荐
		list = new ArrayList[N+1];
		visited = new boolean[N+1];
		marked = new int[N+1];
		
		for(int i=1;i<N+1;i++)
			list[i] = new ArrayList<Integer>();
		for(int i=0;i<M;i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			
			list[a].add(b);
			list[b].add(a);
		}
		in.close();
		
		int answer = 100000;
		int answeridx = 0;
		for(int i=1;i<N+1;i++) {
			int a = BFS(i);
			if(a<answer) {
				answer = a;
				answeridx = i;
			}
		}
		System.out.println(answeridx);
	}

	public static int BFS(int start) {
		Queue<Integer> queue = new LinkedList<>();
		marked = new int[N+1];
		visited = new boolean[N+1];
		
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
		
		int sum=0;
		for(int i:marked)
			sum += i;
		
		return sum;
	}
}
