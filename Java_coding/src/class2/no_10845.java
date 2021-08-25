package class2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class no_10845 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		Queue<Integer> que = new LinkedList<>();
		int num=0;
		for(int i=0;i<N;i++) {
			String str = in.next();
			switch(str) {
			case "push":
				int x = in.nextInt();
				num=x;
				que.add(x);
				break;
			case "pop":
				if(que.isEmpty()) System.out.println(-1);
				else System.out.println(que.poll());	
				break;
			case "size":
				 System.out.println(que.size());
				break;
			case "empty":
				if(que.isEmpty()) System.out.println(1);
				else  System.out.println(0);
				break;
			case "front":
				if(que.isEmpty()) System.out.println(-1);
				else System.out.println(que.peek()); //맨 앞 값 확인
				break;
			case "back":
				if(que.isEmpty()) System.out.println(-1);
				else  System.out.println(num);
				break;
			}
		}
		in.close(); //시간초과
	}
}
