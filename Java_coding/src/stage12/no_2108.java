package stage12;

import java.util.Arrays;
import java.util.Scanner;

public class no_2108 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int sum=0, median=0, mode=0, max=0, min=0;
		
		int[] list = new int[N];
		for (int i=0;i<N;i++) {
			int num = in.nextInt();
			list[i] = num;
			sum+=num;
		}
		Arrays.sort(list);
		in.close();
		
		median = list[(N-1)/2];
		max = list[N-1];
		min = list[0];
		
		boolean flag = false;
		int mode_max = 0;
		mode = 10000;
		
		for(int i = 0; i < N; i++) {
			int jump = 0;	// 동일한 수가 나온만큼 i 값 jump 시킬 변수 
			int count = 1;
			int i_value = list[i];
			
			for(int j = i + 1; j < N; j++){
				if(i_value != list[j]) {
					break;
				}
				count++;
				jump++;
			}
			
			if(count > mode_max) {
				mode_max = count;
				mode = i_value;
				flag = true;
			}
			else if(count == mode_max && flag == true) {
				mode = i_value;
				flag = false;
			}
			
			i += jump;
		}
		
		System.out.println((int)Math.round((double)sum / N));	// 산술평균 
		System.out.println(median);	// 중앙값 
		System.out.println(mode);	// 최빈값 
		System.out.println(max - min);	// 범위 
	}

}
