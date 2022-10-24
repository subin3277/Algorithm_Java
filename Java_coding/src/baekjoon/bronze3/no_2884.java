package bronze3;

import java.util.Scanner;

public class no_2884 {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		
		int A = num.nextInt();
		int B = num.nextInt();
		
		if(B>=45) {
			System.out.print(A+" ");
			System.out.print(B-45);
		}
		else if(B<45) {
			if(A==0) {
				System.out.print("23"+" ");
				System.out.print(B+15);
			}
			else {
				System.out.print(A-1+" ");
			System.out.print(B+15);
			}
			
		}

	}

}
