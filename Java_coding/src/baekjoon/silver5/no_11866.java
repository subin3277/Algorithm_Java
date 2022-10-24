package silver5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class no_11866 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = in.nextInt();
		int K = in.nextInt();
		
		Queue<Integer> queue = new LinkedList<>();
		for(int i=1;i<N+1;i++)
			queue.add(i);
		
		sb.append("<");
		while(queue.size()!=1) {
			for(int j=0;j<K-1;j++) {
				queue.add(queue.poll());
			}
			sb.append(queue.poll()).append(", ");
		}
		sb.append(queue.poll()).append(">");
		System.out.println(sb);
		in.close();
	}

}
