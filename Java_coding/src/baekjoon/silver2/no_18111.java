package silver2;

import java.io.*;
import java.util.*;

public class no_18111 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		int max = -1;
		int min = 257;
		
		int[][] list = new int[N][M];
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				int a = Integer.parseInt(st.nextToken());
				list[i][j] = a;
				max = Math.max(a, max);
				min = Math.min(a, min);
			}
		}
		
		
		int minsec = Integer.MAX_VALUE;
		int dis = min;
		
		for (int k=min;k<max+1;k++) {
			int sec = 0;
			int block = B;
			for(int i=0;i<N;i++) {
				for(int j=0;j<M;j++) {
					int tmp = list[i][j] - k; 
					if(tmp > 0) {
						sec+=2*tmp;
						block += tmp;
					} else {
						sec-=tmp;
						block+=tmp;
					}
				}
			}
			if(minsec>=sec&&block>=0) {
				if(sec == minsec)
					dis = dis>k ? dis:k;
				else {
					minsec = sec;
					dis = k;	
				}
			
				
			}
		}
		
		System.out.println(minsec +" "+dis);
	}

}
