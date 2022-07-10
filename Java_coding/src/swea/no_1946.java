package swea;

import java.util.Scanner;

public class no_1946 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=1;i<=T;i++) {
			int N = sc.nextInt();
			
			int count=0;
			System.out.println("#"+i);
			for(int j = 1;j<=N;j++) {
				String str = sc.next();
				int num = sc.nextInt();
				
				for(int k=0;k<num;k++) {
					if(count>=10) {
						System.out.println();
						count=0;
					}
					count++;
					System.out.print(str);
				}
				
			}
			System.out.println();
		}
	}

}
