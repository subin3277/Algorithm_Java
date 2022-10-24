package silver2;

import java.util.Scanner;

public class no_9020 {

	static boolean[] prime = new boolean[10001];
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		getPrime();
		
		for(int i=0;i<N;i++) {
			int A = in.nextInt();
			getNum(A);			
		}
	}

	public static void getPrime() {
	    
		prime[0] = prime[1] = true;
 
		for (int i = 2; i <= Math.sqrt(prime.length); i++) {
			if (prime[i]) continue;
            
			for (int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}
	public static void getNum(int A) {
		for(int i=A/2;i>1;i--) {
			if(!prime[i]&&!prime[A-i]) {
				System.out.println(i+" "+(A-i));
				break;
			}
		}
	}
}
