package class3;

import java.util.Scanner;

public class no_1107 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N =in.nextInt();
		int M = in.nextInt();
		
		boolean[] numlist = new boolean[10];
		for(int i=0;i<M;i++) {
			int a = in.nextInt();
			numlist[a] = true;
		}
		in.close();
		
		int num = Math.abs(N-100);
		for(int i=0;i<1000000;i++) {
			int len = check(i,numlist);
			if(len !=0) {
				int cnt = Math.abs(i-N);
				if(num>len+cnt)
					num = len + cnt;
			}
		}
		
		System.out.println(num);
	}
	
	public static int check(int N, boolean[] list) {
		if(N==0) {
			if(list[0])
				return 0;
			else
				return 1;
		}
		
		int len = 0;
		while(N>0) {
			if(list[N%10])
				return 0;
			len++;
			N/=10;
		}
		
		return len;
	}

}
