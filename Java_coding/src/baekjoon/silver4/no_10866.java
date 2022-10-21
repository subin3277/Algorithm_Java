package class2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class no_10866 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Deque<Integer> deque = new ArrayDeque<>();
		int N = in.nextInt();
		int num=0;
		
		for(int i=0;i<N;i++) {
			String str = in.next();
			switch(str) {
				case "push_front" : 
					num = in.nextInt();
					deque.addFirst(num);
					break;
				case "push_back" :
					num = in.nextInt();
					deque.addLast(num);
					break;
				case "pop_front" :
					if(deque.size()==0)
						sb.append("-1").append('\n');
					else 
						sb.append(deque.removeFirst()).append('\n');
					break;
				case "pop_back" :
					if(deque.size()==0)
						sb.append("-1").append('\n');
					else
						sb.append(deque.removeLast()).append('\n');
					break;
				case "size" :
					sb.append(deque.size()).append('\n');
					break;
				case "empty" :
					if(deque.size()==0)
						sb.append("1").append('\n');
					else
						sb.append("0").append('\n');
					break;
				case "front" :
					if(deque.size()==0)
						sb.append("-1").append('\n');
					else 
						sb.append(deque.getFirst()).append('\n');
					break;
				case "back" :
					if(deque.size()==0)
						sb.append("-1").append('\n');
					else 
						sb.append(deque.getLast()).append('\n');
					break;
			}
		}
		System.out.println(sb);
		in.close();
	}

}
