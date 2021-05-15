package stage9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_4948 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
		int N = Integer.parseInt(st.nextToken());
		while (N!=0) {
			int count=1;
			for (int i=N;i<2*N;i++) {
				int subcount=0;		
				for(int j=2;j<i;j++) {
					if(i%j==0) {
						subcount+=1;
					}
				}
				if(subcount==2) {
					count++;
				}
			}
			System.out.println(count);
			N = Integer.parseInt(st.nextToken());
		}
		
		
	}

}
