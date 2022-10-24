package bronze2;

import java.util.Scanner;

public class no_2675 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		for(int i=0;i<num;i++) {
			int R = scanner. nextInt();
			String S = scanner.next();
			for (int j=0;j<S.length();j++) {
				for (int k=0;k<R;k++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println("");
		}
		scanner.close();
	}

}
