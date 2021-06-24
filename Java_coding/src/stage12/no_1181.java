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
			if(arr.contains(str)) {
				arr.add(str);
				lenarr[i][0] = 0;
				lenarr[i][1] = i;
			} else {
				arr.add(str);
				lenarr[i][0] = str.length();
				lenarr[i][1] = i;
			}
		}
		in.close();

		Arrays.sort(lenarr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0]-o2[0];
			}
		});
		
		for(int i=0;i<N;i++) {
			System.out.println(lenarr[i][0]+" "+lenarr[i][1]);
		}
		
		ArrayList<String> word = new ArrayList<>();
		for(int i=0;i<N;i++) {
			if(i==N-1) {
				Collections.sort(word);
				for(int j=0;j<word.size();j++) {
					System.out.println(word.get(j));
				}
			} else {
				if(lenarr[i][0]!=0) {
					word.add(arr.get(lenarr[i][1]));
					if(lenarr[i][0]!=lenarr[i+1][0]) {
						Collections.sort(word);
						for(int j=0;j<word.size();j++) {
							System.out.println(word.get(j));
						}
						word.clear();
					} 
				}
			}
			
		}
	}
}
