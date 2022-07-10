package swea;

import java.util.Arrays;
import java.util.Scanner;

public class no_2063 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		int[] list = new int[T];
		for(int test_case = 0; test_case < T; test_case++)
		{
			int a = sc.nextInt();
			list[test_case] = a;
		}
		
		Arrays.sort(list);
		System.out.println(list[(T-1)/2]);

	}

}
