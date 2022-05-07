package example;

import java.util.LinkedList;
import java.util.Queue;

public class no2 {

	public static void main(String[] args) {
		int[] queue1 = {3,2,7,2};
		int[] queue2 = {4,6,5,1};
		System.out.println(solution(queue1, queue2));
	}
	
	public static int solution(int[] queue1, int[] queue2) {
		int answer = 0;
		int sum1 = 0;
		int sum2 = 0;
		int count = 0;
		LinkedList<Integer> qu1 = new LinkedList<>();
		LinkedList<Integer> qu2 = new LinkedList<>();
		for(int i=0;i<queue1.length;i++) {
			sum1 += queue1[i];
			sum2 += queue2[i];
			qu1.add(queue1[i]);
			qu2.add(queue2[i]);
		}
		int sum = (sum1+sum2)/2;
		//모든 원소의 합 구하기, 큐에 원소 집어넣기
		
		while(sum2<=sum||!qu1.isEmpty()) {
			int num = qu1.poll();
			sum1 -= num;
			sum2 += num;
			qu2.add(num);
			answer++;
		}
		
		return answer;
	}

}
