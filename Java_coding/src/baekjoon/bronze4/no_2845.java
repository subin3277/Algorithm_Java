package bronze4;

import java.util.Scanner;

public class no_2845 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int L = in.nextInt();
		int P = in.nextInt();
		int a,b,c,d,e;
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();
		e = in.nextInt();
		in.close();
		
		System.out.print(a-L*P+" ");
		System.out.print(b-L*P+" ");
		System.out.print(c-L*P+" ");
		System.out.print(d-L*P+" ");
		System.out.print(e-L*P+" ");
	}

}
