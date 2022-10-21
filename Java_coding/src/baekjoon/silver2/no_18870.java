package stage12;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class no_18870 {
	
	private static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int[] list = new int[N];
		int[] sortedlist = new int[N];

		for(int i=0;i<N;i++) {
			list[i] = in.nextInt();
			sortedlist[i] = list[i];
		}
		in.close();
		
		Arrays.sort(sortedlist);
		
		HashMap<Integer,Integer> map = new HashMap<>();
		int rank = 0;
		for(int i=0;i<list.length;i++) {
			if(!map.containsKey(sortedlist[i])) {
				map.put(sortedlist[i], rank);
				rank++;
			}
		}
		
		for(int i=0;i<N;i++) {
			sb.append(map.get(list[i])).append(" ");
		}
		
		System.out.println(sb);
		
	}

}
