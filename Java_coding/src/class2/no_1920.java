package class2;

import java.util.Arrays;
import java.util.Scanner;

public class no_1920 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int[] list = new int[N];
		for(int i = 0;i<N;i++) {
			list[i] = in.nextInt();
		}
		Arrays.sort(list);
		
		int M = in.nextInt();
		for(int j=0;j<M;j++) {
			int num =in.nextInt();
			if(find(num, list))
				System.out.println("1");
			else
				System.out.println("0");
		}
		in.close();		
	}
	
	static boolean find(int num, int[] list) {
		int min = 0;
		int max = list.length-1;
		boolean state = false;
		while (min<=max) {
			int mid = (min+max)/2;
			if(num==list[mid]) {
				state = true;
				break;
			}
			else if (num<list[mid])
				max = mid-1;
			else
				min = mid+1;
		}
		return state;
	}

}
