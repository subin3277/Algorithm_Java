package silver3;

import java.util.Scanner;

public class no_1002 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		for(int i=0;i<T;i++) {
			int x1 = in.nextInt();
			int y1 = in.nextInt();
			int r1 = in.nextInt();
			int x2 = in.nextInt();
			int y2 = in.nextInt();
			int r2 = in.nextInt();
			double d = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
			if(d==0) {
				if(r1==r2)
					System.out.println("-1");
				else
					System.out.println("0");
			} else if((r1+r2<d)||(Math.abs(r1-r2))>d) {
				System.out.println("0");
			} else if((r1+r2==d)||(Math.abs(r1-r2)==d)) {
				System.out.println("1");
			} else {
				System.out.println("2");
			}
		}

	}

}
