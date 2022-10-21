package stage8;

import java.util.Scanner;

public class no_1712 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		int A=scanner.nextInt();
		int B=scanner.nextInt();
		int C=scanner.nextInt();
		int bep=1;
		
		if(B>=C) {
			bep = -1;
		}
		else {
			bep = (A/(C-B))+1;
		}
		System.out.println(bep);
		scanner.close();
	}

}
