package bronze5;

import java.util.Scanner;

public class no_2739 {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		
		int A = num.nextInt();
		
		for(int i=1;i<10;i++) {
			System.out.println(A+" * "+i+" = "+i*A);
		}

	}

}
