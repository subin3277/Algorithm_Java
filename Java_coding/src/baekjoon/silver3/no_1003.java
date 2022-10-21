package class3;

import java.util.Scanner;

public class no_1003 {

	static Integer[][] dp = new Integer[41][2];
	
	
	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		dp[0][0] = 1;	// N=0 �� ���� 0 ȣ�� Ƚ��
		dp[0][1] = 0;	// N=0 �� ���� 1 ȣ�� Ƚ��
		dp[1][0] = 0;	// N=1 �� ���� 0 ȣ�� Ƚ��
		dp[1][1] = 1;
		
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int i=T;i>0;i--) {
			int a = in.nextInt();
			fibonacci(a);
			System.out.println(dp[a][0] + " " + dp[a][1]);
		}
		in.close();
		
	}
	
	static Integer[] fibonacci(int N) {
		if(dp[N][0] == null || dp[N][1] == null) {
			// �� N�� ���� 0 ȣ�� Ƚ���� 1 ȣ�� Ƚ���� ���ȣ���Ѵ�.
			dp[N][0] = fibonacci(N - 1)[0] + fibonacci(N - 2)[0];
			dp[N][1] = fibonacci(N - 1)[1] + fibonacci(N - 2)[1];
		}
		// N�� ���� 0�� 1, �� [N][0]�� [N][1] �� ����ִ� [N]�� ��ȯ�Ѵ�.
		return dp[N];
	}

}