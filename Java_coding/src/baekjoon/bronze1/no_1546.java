package bronze1;

import java.util.Scanner;

public class no_1546 {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		
		int A=num.nextInt();
		double[] score = new double[A];
		double sum=0;
		int max=0;
		for (int i=0;i<A;i++) {
			int B=num.nextInt();
			score[i]=B;
			if(max<B)
				max=B;
		}
		for(int i=0;i<A;i++) {
			double newsc = score[i]/max*100;
			score[i]= newsc;
			sum+=newsc;
		}
		System.out.println(sum/A);
	}

}