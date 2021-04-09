package stage1;

import java.util.Scanner;

public class no_2588 {

	public static void main(String[] args) {
		Scanner num1= new Scanner(System.in);
		
		int A = num1.nextInt();
		int B= num1.nextInt();
	
		int thr = A*(B%10);
		int four = A*(B%100/10);
		int five = A*(B/100);
		System.out.println(thr);
		System.out.println(four);
		System.out.println(five);
		System.out.println(A*B);

	}

}
