package stage12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class no_1427 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.close();
		
		int len = (int)(Math.log10(N)+1);
		ArrayList<Integer> arr = new ArrayList<>();
		int num = N;
		
		for(int i=0;i<len;i++) {
			arr.add(N%10);
			N=N/10;
		}
		Collections.sort(arr);
		for(int i=len-1;i>=0;i--) {
			System.out.print(arr.get(i));
		}
	}

}
