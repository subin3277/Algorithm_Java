package class2;

import java.util.Scanner;

public class no_1018 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner in = new Scanner(System.in);
		int M = in.nextInt(); //10
		int N = in.nextInt(); //13
		int min=32;
		int count=0;
		char[][] list = new char[N+1][M+1];
		for (int i=0;i<M;i++) {
			char[] tmp=in.next().toCharArray();
			list[i]=tmp;
		}
		in.close();
		
		for(int i=0;i<M-7;i++) { 
			for(int j=0;j<N-7;j++) {
				for(int k=i;k<i+7;k=k+2) {
					for(int l=j;l<j+7;l=l+2) {
						if(list[k][l]!='W')
							count++;
						if(list[k][l+1]!='B') 
							count++;
						if(list[k+1][l]!='B')
							count++;
						if(list[k+1][l+1]!='W')
							count++;
					}
				}
				if(count<min)
					min=count;
				else if((64-count<min)&&(count>32))
					min = 64-count;
				count=0;
			}
		}
		System.out.println(min);
	}

}
