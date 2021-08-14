package class2;

import java.util.Scanner;

public class no_9012 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();

		for(int i=0;i<T;i++) {
			String str = in.next();
			if(str.length()%2!=0) {
				System.out.println("NO");
			}
			else {
				int lcount=1;
				int rcount=0;
				if((str.charAt(0)==')')||(str.charAt(str.length()-1)=='('))
					System.out.println("No");
				else {
					for(int j=1;j<str.length();j++) {
						if(str.charAt(j)=='('){
							lcount++;
						} else
							rcount++;
						if(lcount<rcount) {
							break;
						}
					}
					if(lcount==rcount)
						System.out.println("YES");
					else
						System.out.println("NO");
				}
				
			}
			
		}
		in.close();
	}
}
