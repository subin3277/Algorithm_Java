package silver4;

import java.util.Scanner;

public class no_1018 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int M = in.nextInt();
		int N = in.nextInt();
		
		char[][] lst = new char[M][N];
		// �Է¹ޱ�
		for (int i=0;i<M;i++) {
			char[] tmp=in.next().toCharArray();
			lst[i]=tmp;
		}
		
		in.close();
		int count = 0;
		int res = 32; // �ִ�� ���� �� �ִ� �� = 32
		for(int i=0;i<=M-8;i++) {
			for (int j = 0;j<=N-8;j++) {
				
				// ���� ���ڿ� ���ϱ�
				char first = lst[i][j];
				count = 0;
				
				for (int x = 0; x<8;x++) {
					for(int y=0;y<8;y++) {
						// ���ذ� �ٸ��� �ٲ���ϴ� ���� �߰�
						if (first != lst[i+x][j+y])
							count++;
						
						// �ݴ�� �ٲٱ�
						if (first == 'W')
							first = 'B';
						else
							first = 'W';
					}
					// ������ �Ѿ�� �״�ο����ϱ� ������ �ٽ� �ѹ��� �ٲٱ�
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
