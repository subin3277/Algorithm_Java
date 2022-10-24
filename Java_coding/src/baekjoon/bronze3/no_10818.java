package bronze3;

import java.util.Scanner;

public class no_10818 {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		
		int A = num.nextInt();
		int max=0, min=0;
		
		for(int i=0;i<A;i++) {
			int B=num.nextInt();
			if(i==0) {
				min=B;
				max=B;
			}
			else if(max<B) {
				max=B;
			}
			else if(min>B) {
				min=B;
			}
		}
		System.out.println(min+" "+max);

	}

}
