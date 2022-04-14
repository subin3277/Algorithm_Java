package class2;

import java.util.Arrays;
import java.util.Scanner;

public class no_2751 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		StringBuilder sb = new StringBuilder();
		int[] list = new int[N];
		for(int i = 0;i<N;i++) {
			list[i] = in.nextInt();
		}
		in.close();
		
		Arrays.sort(list);
		
		for(int i=0;i<N;i++)
			sb.append(list[i]).append('\n');
		System.out.println(sb);
	}

}
