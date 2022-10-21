package stage8;

import java.util.Scanner;

public class no_10250 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		int T=scanner.nextInt();
		for (int i=0; i<T;i++) {
			int H=scanner.nextInt();
			int W=scanner.nextInt();
			int N=scanner.nextInt();
			int room=0;
			
			if(N%H==0) {
				room = H*100+(N/H);
			} else {
				room = (N%H)*100+(N/H)+1;
			}
			System.out.println(room);
		}
		scanner.close();
	}

}
