package bronze1;

import java.util.Scanner;

public class no_1259 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		while(N!=0) {
			int num1=N;
			int len = (int)(Math.log10(N)+1);
			int num2=0;
			for(int i=0;i<len;i++) {

				num2+=(num1%10)*(Math.pow(10,len-i-1));
				num1=num1/10;
			}
			if(N==num2) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
			N=in.nextInt();
		}
		in.close();
	}
}
