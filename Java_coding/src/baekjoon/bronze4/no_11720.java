package bronze4;

import java.util.Scanner;

public class no_11720 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		int sum=0;
		String str = scanner.next();
		for(int i=0;i<num;i++) {
			int a = Character.getNumericValue(str.charAt(i));
			sum+=a;
		}
		System.out.println(sum);
		scanner.close();
	}

}
