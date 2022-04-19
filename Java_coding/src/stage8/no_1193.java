package stage8;

import java.util.Scanner;

public class no_1193 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		int X = scanner.nextInt();
		scanner.close();
		int A=1;
		int i=1;
		for(i=1;A<=X;i++) {
			A+=i;
		}
		int a=i-1,b=1;
		for(int j=1;j<A-X;j++) {
			a-=1;
			b+=1;
		}
		if (i%2==0) {
			System.out.print(b+"/"+a);
		} else {
			System.out.print(a+"/"+b);
		}		
	}
}
