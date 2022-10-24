package silver4;

import java.util.Arrays;
import java.util.Scanner;

public class no_10816 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int[] list = new int[N];
		for(int i = 0;i<N;i++) {
			list[i] = in.nextInt();
		}
		Arrays.sort(list);
		
		int M = in.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int j=0;j<M;j++) {
			int num =in.nextInt();
			sb.append(find(num,list)).append(' ');
		}
		in.close();
		System.out.println(sb);
	}

	static int find(int num, int[] list) {
		int min = 0;
		int max = list.length;
		//lower
		while (min<max) {
			int mid = (min+max)/2;
			if(num<=list[mid]) {
				max = mid;
			}
			else
				min = mid+1;
		}
		int lo = min;
		
		min = 0;
		max = list.length;
		//upper
		while(min<max) {
			int mid = (min+max)/2;
			if(num>=list[mid])
				min = mid+1;
			else
				max = mid;
		}
		int hi = min;
		
		return (hi-lo);
	}

}
