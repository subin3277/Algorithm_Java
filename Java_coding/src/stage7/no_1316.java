package stage7;

import java.util.Scanner;

public class no_1316 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		int num = scanner.nextInt();
		int count=0;
		for (int i=0;i<num;i++) {
			String str = scanner.next();
			if ((str.length()==1)||(str.length()==2))
				count+=1;
			else {
				for(int j=0;j<str.length();j++) {
					
				}
			
			}
			scanner.close();
			System.out.println(count);	
		}
		
	}

}
