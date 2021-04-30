package stage8;

import java.util.Scanner;

public class no_2775 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		int T = scanner.nextInt();
		for (int i=0;i<T;i++) {
			int k = scanner.nextInt();
			int n = scanner.nextInt();
			
			int sum=0;
			int addsum=1;
			for(int j=1;j<k+1;j++) {
				sum+=addsum;
				addsum+=j;
				System.out.println(sum);
			}
			sum+=k+1;
			System.out.println(sum);
		}
		scanner.close();

	}

}
