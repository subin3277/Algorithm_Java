package bronze2;

import java.util.Scanner;

public class no_2577 {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		
		int A=num.nextInt();
		int B=num.nextInt();
		int C=num.nextInt();
		int result = A*B*C;
		String str=Integer.toString(result);
		for(int i=0;i<10;i++) {
			int count=0;
			for (int j=0;j<str.length();j++) {
				if((str.charAt(j)-'0')==i) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
