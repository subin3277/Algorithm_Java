package bronze2;

import java.util.Scanner;

public class no_5622 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);

		//9+7+9+3+5+3=16+12+8=36
		String str = scanner.next();
		int count=0;
		for (int i=0;i<str.length();i++) {
			int letter = (int) str.charAt(i);
			int aski = (letter-59)/3;
			if ((letter==83)||(letter==86)||(letter>88)) 
				aski-=1;
			count+=aski+1;
		}
		System.out.println(count);
	}
}
