package stage7;

import java.util.Scanner;

public class no_10809 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		int[] numlist = new int[26];
		for(int i=0;i<26;i++)
			numlist[i]=-1;
		for (int i=0;i<str.length();i++) {
			int num = str.charAt(i);
			int list = (int)num-97;
			if(numlist[list]==-1)
				numlist[list]=i;
		}
		for (int i=0;i<26;i++)
			System.out.print(numlist[i]+" ");
	}

}
