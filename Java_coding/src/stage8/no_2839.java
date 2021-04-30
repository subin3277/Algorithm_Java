package stage8;

import java.util.Scanner;

public class no_2839 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		int N = scanner.nextInt();
		scanner.close();
		int count=-1;
		for(int i=1;i<(N/3)+1;i++) {
			if(N%5==0) {
				count=N/5;
				break;
			} else {
				if((N-i*3)%5==0) {
					count=i+((N-i*3)/5);
					break;
				}
			}
		}
		System.out.println(count);

	}

}
