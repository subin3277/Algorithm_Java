package bronze5;

import java.util.Scanner;

public class no_2475 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int sum=0;
		for(int i=0;i<5;i++) {
			int num = in.nextInt();
			sum=sum+(num*num);
		}
		int res = sum%10;
		System.out.println(res);
		in.close();
	}

}
