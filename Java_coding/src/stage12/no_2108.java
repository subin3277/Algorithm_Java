package stage12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class no_2108 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int sum=0, median=0, mode=0, max=0, min=0;
		
		ArrayList list = new ArrayList();
		for (int i=0;i<N;i++) {
			int num = in.nextInt();
			list.add(num);
			sum+=num;
		}
		Collections.sort(list);
		
		median = (int) list.get((N-1)/2);
		max = (int)list.get(N-1);
		min = (int)list.get(0);
		
		
		System.out.println((int)Math.round((double)sum / N));	// »ê¼úÆò±Õ 
		System.out.println(median);	// Áß¾Ó°ª 
		System.out.println(mode);	// ÃÖºó°ª 
		System.out.println(max - min);	// ¹üÀ§ 
	}

}
