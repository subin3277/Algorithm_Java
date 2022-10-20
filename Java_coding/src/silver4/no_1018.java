package silver4;

import java.util.Scanner;

public class no_1018 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int M = in.nextInt();
		int N = in.nextInt();
		
		char[][] lst = new char[M][N];
		// 입력받기
		for (int i=0;i<M;i++) {
			char[] tmp=in.next().toCharArray();
			lst[i]=tmp;
		}
		
		in.close();
		int count = 0;
		int res = 32; // 최대로 나올 수 있는 값 = 32
		for(int i=0;i<=M-8;i++) {
			for (int j = 0;j<=N-8;j++) {
				
				// 기준 문자열 정하기
				char first = lst[i][j];
				count = 0;
				
				for (int x = 0; x<8;x++) {
					for(int y=0;y<8;y++) {
						// 기준과 다르면 바꿔야하는 갯수 추가
						if (first != lst[i+x][j+y])
							count++;
						
						// 반대로 바꾸기
						if (first == 'W')
							first = 'B';
						else
							first = 'W';
					}
					// 다음줄 넘어갈때 그대로여야하기 때문에 다시 한번더 바꾸기
					if (first == 'W')
						first = 'B';
					else
						first = 'W';
				}
				count = Math.min(count, 64-count);
				res = Math.min(res, count);
			}
		}
		System.out.print(res);
		

	}

}
