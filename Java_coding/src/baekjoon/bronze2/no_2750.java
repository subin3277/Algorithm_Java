package stage12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class no_2750 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i=0;i<N;i++) {
			int num = in.nextInt();
			arr.add(num);
		}
		Collections.sort(arr);
		for(int i=0;i<N;i++) {
			System.out.println(arr.get(i));
		}
	}

}
