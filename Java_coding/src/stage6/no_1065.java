package stage6;

import java.util.Scanner;

public class no_1065 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int count = 0;
		
		for (int i=1;i<num+1;i++) {
			if(count(i)==true)
				count++;
		}
		System.out.println(count);
	}
	
	private static boolean count(int A) {
		if (A<100) {
			return true;
		} else if(A>=100 & A<1000) {
			int a = A/100;
			int b = (A/10)%10;
			int c = A%10;
			if (a>=c) {
				if ((a-b)==(b-c))
					return true;
				else
					return false;
			} else {
				if((c-b)==(b-a))
					return true;
				else
					return false;
			}
		}
		return false;
	}

}
