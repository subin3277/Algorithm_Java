package stage9;

import java.util.Scanner;

public class no_4153 {

	public static void main(String[] args) {
		Scanner N = new Scanner(System.in);
		
		while (true) {
			int A = N.nextInt();
			int B = N.nextInt();
			int C = N.nextInt();
			
			if((A!=0)||(B!=0)||(C!=0)) {
				if(A*A==B*B+C*C) {
					System.out.println("right");
				} else if(A*A+B*B==C*C) {
					System.out.println("right");
				} else if(B*B==C*C+A*A) {
					System.out.println("right");
				} else {
					System.out.println("wrong");
				}
			} else {
				break;
			}
		}
		

	}

}
