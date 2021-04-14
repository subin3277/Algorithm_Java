package stage4;

import java.util.Scanner;

public class no_10952 {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		
		int A = num.nextInt();
		int B = num.nextInt();
		
		while ((A!=0)&&(B!=0)) {
			System.out.println(A+B);
			A = num.nextInt();
			B = num.nextInt();	
		}
	}
}
