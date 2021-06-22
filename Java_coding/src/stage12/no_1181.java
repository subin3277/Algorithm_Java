package stage12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class no_1181 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int N = in.nextInt();
		int[][] lenarr = new int[N][2];
		ArrayList<String> arr = new ArrayList<>();
		
		for(int i=0;i<N;i++) {
			String str = in.next();
			arr.add(str);
			if(arr.contains(str)) {
				lenarr[i][0] = 0;
				lenarr[i][1] = i;
			} else {
				lenarr[i][0] = str.length();
				lenarr[i][1] = i;
			}
		}

		Arrays.sort(lenarr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0]-o2[0];
			}
		});
		
		System.out.println(arr);
		ArrayList<String> word = new ArrayList<>();
		for(int i=0;i<N-1;i++) {
			if(lenarr[i][0]!=0) {
				if(lenarr[i][0]!=lenarr[i+1][0]) {
					word.add(arr.get(lenarr[i][1]));
					Collections.sort(word);
					for(int j=0;j<word.size();j++) {
						System.out.println(word.get(j));
					}
					word.clear();
				} else {
					word.add(arr.get(lenarr[i][1]));
				}
			}
			System.out.println(word);
		}
	}
}
