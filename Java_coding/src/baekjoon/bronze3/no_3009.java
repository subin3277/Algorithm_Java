package bronze3;

import java.util.Scanner;

public class no_3009 {

	public static void main(String[] args) {
		
		Scanner N = new Scanner(System.in);

		int A1 = N.nextInt();
		int B1 = N.nextInt();
		int A2 = N.nextInt();
		int B2 = N.nextInt();
		int A3 = N.nextInt();
		int B3 = N.nextInt();
		if(A1==A2) {
			System.out.print(A3+" ");
		} else if(A1==A3) {
			System.out.print(A2+" ");
		} else {
			System.out.print(A1+" ");
		}
		if(B1==B2) {
			System.out.print(B3);
		} else if(B1==B3) {
			System.out.print(B2);
		} else {
			System.out.print(B1);
		}
	}

}
