package stage2;

import java.util.Scanner;

public class no_9498 {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		
		int A = num.nextInt();
		
		if (A>=90) 
			System.out.println("A");
		else if(A>=80)
			System.out.println("B");
		else if(A>=70)
			System.out.println("C");
		else if (A>=60)
			System.out.println("D");
		else
			System.out.println("F");

	}

}
