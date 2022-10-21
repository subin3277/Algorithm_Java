package class3;

import java.util.Scanner;

public class no_1003 {

	static Integer[][] dp = new Integer[41][2];
	
	
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		dp[0][0] = 1;	// N=0 일 때의 0 호출 횟수
		dp[0][1] = 0;	// N=0 일 때의 1 호출 횟수
		dp[1][0] = 0;	// N=1 일 때의 0 호출 횟수
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
			// 각 N에 대한 0 호출 횟수와 1 호출 횟수를 재귀호출한다.
			dp[N][0] = fibonacci(N - 1)[0] + fibonacci(N - 2)[0];
			dp[N][1] = fibonacci(N - 1)[1] + fibonacci(N - 2)[1];
		}
		// N에 대한 0과 1, 즉 [N][0]과 [N][1] 을 담고있는 [N]을 반환한다.
		return dp[N];
	}

}
