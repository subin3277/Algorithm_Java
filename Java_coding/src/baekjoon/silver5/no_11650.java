package silver5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class no_11650 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int N = in.nextInt();
 
		int[][] array = new int[N][2];
 
		for(int i = 0; i < N; i++) {
			array[i][0] = in.nextInt();	// [i][0] : x ÁÂÇ¥ 
			array[i][1] = in.nextInt();	// [i][1] : y ÁÂÇ¥
		}
		
		Arrays.sort(array, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0]==o2[0]) {
					return o1[1]-o2[1];
				} else {
					return o1[0]-o2[0];
				}
				
			}
		});
		
		for(int i=0;i<N;i++) {
			System.out.print(array[i][0]+" ");
			System.out.println(array[i][1]);
		}

	}

}
