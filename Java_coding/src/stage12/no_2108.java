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
		
		int maxcount=-1;
		int count=0;
		ArrayList<Integer> countarr = new ArrayList<>();
		for(int i=0;i<account-1;i++) {
			if(arr.get(i)==arr.get(i+1))
				count++;
			else
				if(count>=maxcount) {
					if(count==maxcount) {
						countarr.add(arr.get(i));
					} else {
						countarr = new ArrayList<>();
						countarr.add(arr.get(i));
					}
					maxcount=count;
				}
				count=0;
		}
		
		System.out.println(Math.round(sum/account));
		System.out.println(arr.get((account-1)/2));
		if(countarr.size()!=1) {
			Collections.sort(countarr);
			System.out.println(countarr.get(1));
		} else {
			System.out.println(countarr.get(0));
		}
		
		System.out.println(arr.get(account-1)-arr.get(0));
	}

}
