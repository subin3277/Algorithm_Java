package bronze5;

import java.util.Scanner;

public class no_11021 {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		
		int A = num.nextInt();
		for(int i=0;i<A;i++) {
			int a = num.nextInt();
			int b = num.nextInt();
			
			System.out.println("Case #"+(i+1)+": "+(a+b));
		}
	}

}
