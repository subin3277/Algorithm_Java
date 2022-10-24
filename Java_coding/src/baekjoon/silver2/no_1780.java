package silver2;

import java.util.Scanner;

public class no_1780 {

	static int count_1;
	static int count0;
	static int count1;
	static int[][] list;
	
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); //N*N 행렬
		list = new int[N][N];
		for(int i = 0;i<N;i++) {
			for(int j=0;j<N;j++) {
				list[i][j]=in.nextInt();
			}
		}
		count_1 = count0 = count1 =0;
		paper(0,0,N);
		in.close();
		
		System.out.println(count_1);
		System.out.println(count0);
		System.out.println(count1);
	}
	
	static void paper(int x,int y,int N) {
		boolean check = true;
		int num= list[x][y];
		OuterLoop:
		for(int i = x;i<x+N;i++) {
			for(int j=y;j<y+N;j++) {
				if(list[i][j]!=num) {
					check = false;
					break OuterLoop;
				}
			}
		}
		if(check) {
			if(num==-1)
				count_1++;
			else if(num==0)
				count0++;
			else
				count1++;
		} else {
			for(int i=x;i<x+N;i=i+N/3) {
				for(int j=y;j<y+N;j=j+N/3) {
					paper(i,j,N/3);
				}
			}
		}
		
	}
}
