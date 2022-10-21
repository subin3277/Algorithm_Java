package class2;

import java.util.Scanner;

public class no_1654 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		Scanner in = new Scanner(System.in);
		int K = in.nextInt(); //������ ���� ����
		int N = in.nextInt(); //�ʿ��� ���� ����
		int[] list = new int[K];
		long max = 0;
		for(int i=0;i<K;i++) {
			int num = in.nextInt();
			list[i] = num;
			if(max<list[i])
				max = list[i];
		}
		in.close();
		long sol = solve(max+1,N,list);
		System.out.println(sol);
	}
	
	static long solve(long max, int N, int[] list) {
		long min=0; long mid = 0;
		while(min < max) {
			mid = (max+min)/2;
			long count=0;
			for(int i=0;i<list.length;i++) {
				count += list[i]/mid;
			}
			if(count<N)
				max = mid;
			else
				min = mid+1;
		}
		
		return min-1;
	}

}
