package stage7;

import java.util.Scanner;

public class no_2908 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		int a1=A/100; int a2=(A/10)%10; int a3=A%10;
		int b1=B/100; int b2=(B/10)%10; int b3=B%10;
		int a=a3*100+a2*10+a1;
		int b=b3*100+b2*10+b1;
		if (a>b) {
			System.out.println(a);
		} else if(a<b) {
			System.out.println(b);
		}
		scanner.close();
	}

}
