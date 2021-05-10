package stage9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_1929 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		for(int i=M;i<N;i++) {
			int count=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count=1;
					break;
				}
			}
			if(count==0)
				System.out.println(i);
		}
	}

}
