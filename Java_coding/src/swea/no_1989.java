package swea;

import java.util.Scanner;

public class no_1989 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 1;i<=T;i++) {
			String str = sc.next();
			int len = str.length();
			char[] list = new char[len];
			list = str.toCharArray();
			
			boolean state = true;
			for(int j=0;j<(len-1)/2;j++) {
				if(list[j]!=list[len-j-1]) {
					state = false;
					break;
				}
			}
			if(state)
				System.out.println("#"+i+" 1");
			else
				System.out.println("#"+i+" 0");
		}

	}

}
