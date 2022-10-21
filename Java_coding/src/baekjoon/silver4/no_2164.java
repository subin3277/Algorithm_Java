package class2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class no_2164 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		Queue<Integer> queue = new LinkedList<>();
		for(int i=1;i<N+1;i++)
			queue.add(i);
		while(queue.size()!=1) {
			queue.remove();
			queue.add(queue.poll());
		}
		System.out.println(queue.peek());
		in.close();
	}

}
