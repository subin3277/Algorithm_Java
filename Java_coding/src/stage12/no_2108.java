package stage12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class no_2108 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		ArrayList<Integer> arr = new ArrayList<>();
		int account = 0;
		double sum=0;
		
		int N = in.nextInt();
		for(int i=0;i<N;i++) {
			int num = in.nextInt();
			arr.add(num);
			account++;
			sum+=num;
		}
		in.close();
		Collections.sort(arr);
		int maxcount=0;
		int count=1;
		ArrayList<Integer> maxarr = new ArrayList<>();
		if(arr.size()==1) {
			maxarr.add(arr.get(0));
		} else {
			for(int i=0;i<N;i++) {
				if(i==N-1) {
					if(count>=maxcount) {
						if(count!=maxcount) {
							maxarr.clear();
						} 
						maxarr.add(arr.get(i));
						maxcount=count;
					} 
				} else {
					if(arr.get(i)==arr.get(i+1)) {
						count++;
					} else {
						if(count>=maxcount) {
							if(count!=maxcount) {
								maxarr.clear();
							} 
							maxarr.add(arr.get(i));
							maxcount=count;
						} 
						count=1;
					}
				}
				
			}
		}
		System.out.println((int)Math.round(sum/account));
		System.out.println(arr.get((account-1)/2));
		if(maxarr.size()==1) {
			System.out.println(maxarr.get(0));
		} else {
			System.out.println(maxarr.get(1));
		}
		System.out.println(arr.get(account-1)-arr.get(0));
	}

}
