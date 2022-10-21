package stage3;

import java.util.Scanner;

public class no_8393 {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		
		int A = num.nextInt();
		int sum =0;
		for(int i=0;i<A+1;i++) {
			sum = sum+i;
		}
		System.out.println(sum);
	}

}
