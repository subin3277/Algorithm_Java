package class3;

import java.util.Scanner;

public class no_1107 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N =in.nextInt();
		int M = in.nextInt();
		
		int count1 = 0;
		int count2 = 0;
		boolean[] numlist = new boolean[10];
		for(int i=0;i<M;i++) {
			int a = in.nextInt();
			numlist[a] = false;
		}
		
		int num = N;
		boolean state = check(num,numlist);
		while(!state) {
			count1++;
			state = check(++num,numlist);
		}
		count1 +=(int)Math.log10(num) +1;
		System.out.println("1");
		
		num = N;
		state = check(num,numlist);
		while(!state) {
			count2++;
			state = check(--num,numlist);
		}
		
		count2 += (int) Math.log10(num)+1;
		
		int min = Math.min(count1, count2);
		System.out.println(min);
	}
	
	public static int check(int N, boolean[] list) {
		if(N==0) {
			if(!list[0])
				return 0;
			else
				return 1;
		}
		
		int len = 0;
		while(N>0) {
			if(list[N%10])
				return 0;
		}
		
		return state;
	}

}
