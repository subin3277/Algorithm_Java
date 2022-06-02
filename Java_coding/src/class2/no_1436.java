package class2;

import java.util.Scanner;

public class no_1436 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.close();
		
		int count = 0;
		int num=666;
		while(true) {
			
			if(Integer.toString(num).contains("666")) {
				count++;
				if(count==N) {
					System.out.println(num);
					break;
				}
			}
			num++;
			
		}

	}

}
