package stage11;

import java.util.Scanner;

public class no_7568 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int N = in.nextInt();
 
		int[][] array = new int[N][2];
 
		for(int i = 0; i < N; i++) {
			array[i][0] = in.nextInt();	// [i][0] : ¸ö¹«°Ô 
			array[i][1] = in.nextInt();	// [i][1] : Å° 
		}
		
		
		for(int i = 0; i < N; i++) {
			int rank = 1;
			
			for(int j = 0; j < N; j++) {
				if(i == j) continue;
				if (array[i][0] < array[j][0] && array[i][1] < array[j][1]) {
					rank++;
				}
			}
 
			System.out.print(rank + " ");
		}

	}

}
