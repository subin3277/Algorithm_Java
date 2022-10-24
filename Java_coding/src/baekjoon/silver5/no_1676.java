package silver5;

import java.util.Scanner;

public class no_1676 {

	static int num=1;
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.close();
		int count=0;
		factorial(N);
		while(num%10==0) {
			count++;
			num=num/10;
		}
		System.out.print(count);
	}
	
	static int factorial(int n) {
		if(n==1) {
			return num;
		}
		else {
			num = num*n;
			return factorial(n-1);
		}
	}

}
