package Lv1;

import java.util.Scanner;
import java.util.Stack;

public class 숫자문자열과영단어 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		System.out.println(solution(s));
		in.close();
	}
	public static int solution(String s) {
		int answer = 0;
		char[] list = s.toCharArray();
		Stack<Integer> stack = new Stack<>();
		int i=0;
		while(i<list.length) {
			switch(list[i]) {
			case 'z':
				stack.push(0);
				i += 4;
				break;
			case 'o':
				stack.push(1);
				i += 3;
				break;
			case 'e':
				stack.push(8);
				i+=5;
				break;
			case 'n':
				stack.push(9);
				i+=4;
				break;
			case 't':
				if(list[i+1]=='w') {
					stack.push(2);
					i+=3;
				} else {
					stack.push(3);
					i+=5;
				}
				break;
			case 'f':
				if(list[i+1]=='o')
					stack.push(4);
				else 
					stack.push(5);
				i+=4;	
				break;
			case 's':
				if(list[i+1]=='i') {
					stack.push(6);
					i+=3;
				} else {
					stack.push(7);
					i+=5;
				}
				break;
			default :
				int num = list[i]-'0';
				stack.push(num);
				i++;
			}
		}
		int size = stack.size();
		for(int j =0;j<size;j++) {
			answer += stack.pop()*Math.pow(10, j);
		}
		return answer;
	}
}
