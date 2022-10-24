package silver2;

import java.util.Scanner;

public class no_2805 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); 
		int M = in.nextInt(); 
		int[] list = new int[N];
		long max = 0;
		long min = 0;
		for(int i=0;i<N;i++) {
			int num = in.nextInt();
			list[i] = num;
			if(max<list[i])
				max = list[i];
			else if(min>list[i])
				min = list[i];
		}
		in.close();
		long sol = solve(max+1,min,M,list);
		System.out.println(sol);
	}
	
	static long solve(long max, long min, int N, int[] list) {
		long mid = 0;
		while(min < max) {
			mid = (max+min)/2;
			long met=0;
			for(int i=0;i<list.length;i++) {
				if(mid<list[i]) {
					met += list[i]-mid;
				}
			}
			if(met<N)
				max = mid;
			else
				min = mid+1;
		}
		
		return min-1;
	}

}
