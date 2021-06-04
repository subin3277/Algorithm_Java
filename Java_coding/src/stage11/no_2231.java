package stage11;

import java.util.Scanner;

public class no_2231 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		in.close();
		
		int sum=0;
		
		if(N<=18) {
			if(N%2==0) {
					sum=N/2;
					System.out.println(N/2);
				}
		} else if(N<118) {
			int n = N-18;
			for(int i=n;i<N;i++) {
				sum = i+(i/10)+(i%10);
				if(sum == N) {
					System.out.println(i);
					break;
				}
			}
		} else if(N<1027) {
			int n = N-27;
			for(int i=n;i<N;i++) {
				sum = i+(i/100)+((i/10)%10)+(i%10);
				if(sum == N) {
					System.out.println(i);
					break;
				}
			}
		} else if(N<10036) {
			int n = N-36;
			for(int i=n;i<N;i++) {
				sum = i+(i/1000)+((i/100)%10)+((i/10)%10)+(i%10);
				if(sum == N) {
					System.out.println(i);
					break;
				}
			}
		} else if(N<100045) {
			int n = N-45;
			for(int i=n;i<N;i++) {
				sum = i+(i/10000)+((i/1000)%10)+((i/100)%10)+((i/10)%10)+(i%10);
				if(sum == N) {
					System.out.println(i);
					break;
				}
			}
		} else if(N<1000054) {
			int n = N-54;
			for(int i=n;i<N;i++) {
				sum = i+(i/100000)+((i/10000)%10)+((i/1000)%10)+((i/100)%10)+((i/10)%10)+(i%10);
				if(sum == N) {
					System.out.println(i);
					break;
				}
			}
		}
		if(sum==0)
			System.out.println("0");
	}
}
