package stage9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class no_4948 {
	
	public static boolean[] prime = new boolean[246913];

	public static void main(String[] args){
	
		Scanner in = new Scanner(System.in);
        
		get_prime();	// �Ҽ��� ��� �޼ҵ� ����
		
		while(true) {
			int n = in.nextInt();
			if(n == 0) break;	// n �� 0 �ϰ�� ����
            
			int count = 0;	// �Ҽ� ������ �� ����
            
			for(int i = n + 1; i <= 2 * n; i++) {
				if(!prime[i]) count++;
			}
			System.out.println(count);
		}	
		
	}

	public static void get_prime() {
		// 0 �� 1 �� �Ҽ��� �ƴϹǷ� ture
		prime[0] = prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}
}
