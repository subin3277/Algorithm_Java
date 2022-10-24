package silver3;

import java.util.LinkedList;
import java.util.Scanner;

public class no_1966 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int K = in.nextInt();
		
		while(K-- > 0) {
			int N = in.nextInt();
			int M = in.nextInt();
			
			LinkedList<int[]> queue = new LinkedList<>();
			for(int j = 0;j<N;j++) {
				queue.offer(new int[] {j,in.nextInt()});
			}
			
			int count = 0;
			
			while (!queue.isEmpty()) {
				int[] front = queue.poll();
				boolean isMax = true;
				
				for(int i=0;i<queue.size();i++) {
					if(front[1]<queue.get(i)[1]) {
						queue.offer(front);
						for(int j =0;j<i;j++) {
							queue.offer(queue.poll());
						}
						isMax = false;
						break;
					}
				}
				if(isMax == false)
					continue;
				count++;
				if(front[0]==M)
					break;
			}
			sb.append(count).append('\n');
		}
		in.close();
		System.out.println(sb);
	}

}
