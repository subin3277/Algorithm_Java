package class2;

import java.util.Scanner;
import java.util.Stack;

public class no_10773 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int K = in.nextInt();
		int sum = 0;
		
		Stack<Integer> stack = new Stack<>();
		for (int i=0;i<K;i++) {
			int num = in.nextInt();
			if(num != 0) {
				stack.add(num);
				sum += num;
			} else {
				sum -= stack.pop();
			}
		}
		System.out.println(sum);
		in.close();
	}

}
