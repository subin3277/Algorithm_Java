package stage5;

import java.util.Scanner;

public class no_4344 {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		
		int A=num.nextInt();
		for(int i=0;i<A;i++) {
			int student = num.nextInt();
			int[] sclist = new int[student];
			int sum=0;
			for(int j=0;j<student;j++) {
				int score = num.nextInt();
				sclist[j]=score;
				sum+=score;
			}
			double aver = sum/student;
			int count=0;
			for(int j=0;j<student;j++) {
				if(aver<sclist[j]) {
					count++;
				}
			}
			double result = count*100.0/student;
			System.out.println(String.format("%.3f", result)+"%");
		}

	}

}
