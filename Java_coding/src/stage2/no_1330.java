package stage2;

import java.util.Scanner;

public class no_1330 {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		
		int A = num.nextInt();
		int B= num.nextInt();
		
		if(A>B) {
			System.out.println(">");
		}
		else if(A<B) {
			System.out.println("<");
		}
		else if(A==B) {
			System.out.println("==");
		}

	}

}
