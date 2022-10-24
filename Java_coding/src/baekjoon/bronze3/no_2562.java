package bronze3;

import java.util.Scanner;

public class no_2562 {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		
		int N = num.nextInt();
		int max=N;
		int idx=1;
		
		for (int i=0;i<8;i++) {
			int B=num.nextInt();
			if(max<B) {
				max=B;
				idx=i+2;
			}
		}
		System.out.println(max);
		System.out.println(idx);
	}

}
