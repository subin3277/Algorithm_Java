package stage9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_4948 {

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
		while (true) {
			int A = Integer.parseInt(st.nextToken());
			int count=0;
			if(A==0)
				break;
			else {
				for(int i=A+1;i<(2*A)+1;i++) {
					if (getPrime(i))
						count++;
				}
				System.out.println(count);
			}
		}
		
	}
	
	public static boolean getPrime(int A) {
		int i=2;
		for(i=2;i<A+1;i++) {
			if(A%i==0)
				break;
		}
		if (i==A)
			return true;
		else
			return false;
	}
}
