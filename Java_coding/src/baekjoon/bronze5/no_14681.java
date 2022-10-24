package bronze5;

import java.util.Scanner;

public class no_14681 {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		
		int A = num.nextInt();
		int B = num.nextInt();
		
		if ((A>0)&&(B>0))
			System.out.println("1");
		else if ((A<0)&&(B>0))
			System.out.println("2");
		else if ((A<0)&&(B<0))
			System.out.println("3");
		else if ((A>0)&&(B<0))
			System.out.println("4");

	}

}
