package stage4;

import java.util.Scanner;

public class no_1110 {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		
		int N = num.nextInt();
		int A=0;
		int B=N;
		int i=0;
		
		if(N==0) {
			i=1;
		}
		while (N!=A) {
			int n=(B/10)+(B%10);
			A=(B%10)*10+(n%10);
			B=A;
			i++;
		}
		System.out.println(i);

	}

}
