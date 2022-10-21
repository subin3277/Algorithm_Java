package stage12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class no_10814 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int N = in.nextInt();
		int[][] lenarr = new int[N][2];
		ArrayList<String> arr = new ArrayList<>();
		
		for(int i=0;i<N;i++) {
			int age = in.nextInt();
			String str = in.next();
			arr.add(str);
			lenarr[i][0] = age;
			lenarr[i][1] = i;
			
		}
		in.close();

		Arrays.sort(lenarr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0]-o2[0];
			}
		});

		for(int i=0;i<N;i++) {
			System.out.println(lenarr[i][0]+" "+arr.get(lenarr[i][1]));
		}
	}

}
