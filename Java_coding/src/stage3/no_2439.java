package stage3;

import java.util.Scanner;

public class no_2439 {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		
		int A = num.nextInt();
		for (int i=1;i<A+1;i++) {
			for (int k=0;k<A-i;k++) {
				System.out.print(" ");
			}
			for (int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}
