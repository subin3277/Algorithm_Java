package class2;

import java.util.Scanner;
import java.util.Stack;

public class no_10828 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = in.nextInt();
		int num = 0;
		
		Stack<Integer> stack = new Stack<>();
		for(int i=0;i<N;i++) {
			String str = in.next();
			switch(str) {
				case "push" :
					num = in.nextInt();
					stack.push(num);
					break;
				case "pop":
					if(stack.empty())
						sb.append("-1").append('\n');
					else
						sb.append(stack.pop()).append('\n');
					break;
				case "size":
					sb.append(stack.size()).append('\n');
					break;
				case "empty":
					if(stack.empty())
						sb.append("1").append('\n');
					else
						sb.append("0").append('\n');
					break;
				case "top" :
					if(stack.empty())
						sb.append("-1").append('\n');
					else
						sb.append(stack.peek()).append('\n');
					break;
			}
			
		}
		System.out.println(sb);
		in.close();
	}
}
