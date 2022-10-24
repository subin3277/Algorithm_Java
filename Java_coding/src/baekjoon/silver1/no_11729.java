package silver1;

import java.util.Scanner;

public class no_11729 {
	
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		in.close();
		
		System.out.println((int)Math.pow(2, N)-1);
		move(N,1,2,3);
		System.out.println(sb);

	}

	public static void move(int N,int start, int mid, int to) {
		if(N==1) {
			sb.append(start+" "+to+"\n");
			return;
		} 
		move(N-1,start,to,mid);
		sb.append(start+" "+to+"\n");
		move(N-1,mid,start,to);
	}
}
