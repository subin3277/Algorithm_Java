package bronze2;

import java.util.Scanner;

public class no_15829 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int L = in.nextInt();
		int r = 31;
		int M = 1234567891;  //r�� M�� ���μҷ� ���ϴ°� �Ϲ���.
		long H=0;
		long pow = 1;
		
		String str = in.next();
		char[] arr = str.toCharArray();
		in.close();
		
		for(int i = 0;i<L;i++) {
			H += (arr[i]-'a'+1)*pow % M;
			pow = pow*r % M;
		}
		H = H % M;
		System.out.println(H);

	}

}
