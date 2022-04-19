package class2;

import java.util.Scanner;
import java.util.Stack;

public class no_4949 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		Stack<String> stack = new Stack<>();
		String text = in.nextLine();
		do {
			stack.clear();
			char[] arr = text.toCharArray();
			for(int i=0;i<arr.length;i++) {
				if(arr[i]=='('||arr[i]=='[') {
					stack.add(Character.toString(arr[i]));
				} else if(arr[i]==')') {
					if(stack.empty()) {
						stack.add(Character.toString(arr[i]));
						break;
					}
					else if(stack.peek().equals("(")) {
						stack.pop();
					} else
						break;
				} else if(arr[i] == ']') {
					if(stack.empty()) {
						stack.add(Character.toString(arr[i]));
						break;
					}
					else if(stack.peek().equals("[")) {
						stack.pop();
					} else
						break;
				}
				
			}
			if(stack.empty())
				sb.append("yes").append('\n');
			else
				sb.append("no").append('\n');
			text = in.nextLine();
		} while(!text.equals("."));
		System.out.println(sb);
		in.close();

	}

}
