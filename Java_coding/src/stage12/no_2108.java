package stage12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class no_2108 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		ArrayList<Integer> arr = new ArrayList<>();
		int account = 0;
		int sum=0;
		
		while(in.hasNext()) {
			int num = in.nextInt();
			arr.add(num);
			account++;
			sum+=num;
		}
		in.close();
		Collections.sort(arr);
		
		System.out.println(Math.round(sum/account));
		System.out.println(arr.get((account-1)/2));
		
		System.out.println(arr.get(account-1)-arr.get(0));
	}

}
