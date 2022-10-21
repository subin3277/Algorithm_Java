package class2;

import java.util.Scanner;
import java.util.Stack;

public class no_1874 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = in.nextInt();
		int num = 0;
		int i=1;
		
		Stack<Integer> stack = new Stack<>();
		for(int j = 0; j<N;j++) {
			num = in.nextInt();
			while(stack.empty()||(num>stack.peek())) {
				stack.add(i);
				sb.append("+").append('\n');
				i++;
			}
			if(num == stack.peek()) {
				stack.pop();
				sb.append("-").append('\n');
			} else {
				if(num<stack.peek()) {
					sb = new StringBuilder();
					sb.append("NO");
					break;
				}
			}
		}
				
		System.out.println(sb);
		in.close();
	}

}
