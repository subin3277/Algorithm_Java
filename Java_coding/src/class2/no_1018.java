package class2;

import java.util.Scanner;

public class no_1018 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner in = new Scanner(System.in);
		int M = in.nextInt(); //10
		int N = in.nextInt(); //13
		int min=64;
		int count=0;
		char[][] list = new char[M][N];
		for (int i=0;i<M;i++) {
			char[] tmp=in.next().toCharArray();
			list[i]=tmp;
		}
		in.close();
		
		for(int i=0;i<M-7;i++) {
			for(int j=0;j<N-7;j++) {
				
				char first = list[i][j];
				count = 0;
				
				for(int k=i;k<i+8;k++) {
					for(int h=j;h<j+8;h++) {
						if(list[k][h]!=first) {
							count++;
						}
						
						if(first == 'W')
							first = 'B';
						else
							first = 'W';
						
					}
					
					if(first == 'W')
						first = 'B';
					else
						first = 'W';
				}
				count = Math.min(count, 64-count);
				min = Math.min(count, min);
			}
		}
			
		System.out.println(min);
	}

}
