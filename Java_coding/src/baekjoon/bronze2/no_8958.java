package bronze2;

import java.util.Scanner;

public class no_8958 {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		
		int A=num.nextInt();
		
		for(int i=0;i<A;i++) {
			String result = num.next();
			char[] list = new char[result.length()];
			int sum=0;
			for(int j=0;j<result.length();j++) {
				char a=result.charAt(j);
				list[j]=a;				
			}
			int cnt=0;
			for(int j=0;j<result.length();j++) {
				if(list[j]=='O') {
					cnt++;
					sum+=cnt;
				}
				else {
					cnt=0;
				}
			}
			System.out.println(sum);
		}
	}
}
