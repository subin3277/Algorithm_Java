package bronze2;

import java.util.Scanner;

public class no_2920 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		String num = in.next();
		for(int i=0;i<7;i++) {
			String num2=in.next();
			num+=num2;
		}
		String state=null;
		if(num.equals("12345678")) {
			state = "ascending";
		} else if(num.equals("87654321")) {
			state = "descending";
		} else {
			state = "mixed";
		}
		System.out.println(state);
		in.close();
		
	}

}
