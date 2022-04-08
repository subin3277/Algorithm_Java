package class2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class no_10845 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = in.nextInt();
		int num = 0;
		
		Queue<Integer> queue = new LinkedList<>();
		for(int i=0;i<N;i++) {
			String str = in.next();
			switch(str) {
				case "push" :
					num = in.nextInt();
					queue.add(num);
					break;
				case "pop":
					if(queue.poll()==null)
						sb.append("-1").append('\n');
					else {
						sb.append(queue.poll()).append('\n');
						queue.remove();
					}
					break;
					
					//여기까지 완료
				case "size":
					sb.append(stack.size()).append('\n');
					break;
				case "empty":
					if(stack.empty())
						sb.append("1").append('\n');
					else
						sb.append("0").append('\n');
					break;
				case "front" :
					if(stack.empty())
						sb.append("-1").append('\n');
					else
						sb.append(stack.peek()).append('\n');
					break;
				case "back" :
					break;
			}
			
		}
		System.out.println(sb);
		in.close();

	}

}
