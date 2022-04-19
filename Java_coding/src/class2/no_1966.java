package class2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class no_1966 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int K = in.nextInt();
		
		Queue<int[]> queue = new LinkedList<>();
		for (int i=0;i<K;i++) {
			int N = in.nextInt();
			int M = in.nextInt();
			int index = 0;
			int[] first;
			int count = 0;
			
			for(int j=0;j<N;j++) {
				int tmp = in.nextInt();
				int[] tmplist = new int[2];
				tmplist[0] = j;
				tmplist[1] = tmp;
				queue.add(tmplist);
			}
			
			
		}
		in.close();
	}

}
