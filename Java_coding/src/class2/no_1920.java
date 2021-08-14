package class2;

import java.util.ArrayList;
import java.util.Scanner;

public class no_1920 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		ArrayList<Integer> orilist = new ArrayList<>();
		for(int i=0;i<N;i++) {
			int num = in.nextInt();
			orilist.add(num);
		}
		
		int M = in.nextInt();
		for(int j=0;j<M;j++) {
			int num =in.nextInt();
			if(orilist.contains(num))
				System.out.println("1");
			else
				System.out.println("0");
		}
		in.close();		
	}

}
