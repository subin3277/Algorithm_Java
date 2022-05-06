package Lv1;

import java.util.Scanner;

public class 키패드만들기 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] stages1 = {1,3,4,5,8,2,1,4,5,9,5};
		int[] stages2 = {7,0,8,2,8,3,1,5,7,6,2};
		int[] stages3 = {1,2,3,4,5,6,7,8,9,0};
		String hand = in.next();
		System.out.println( solution(stages3,hand));
		in.close();

	}

	
	public static String solution(int[] numbers, String hand) {
		String answer = "";
		int left = 11;
		int right = 11;
		int countle = 1;
		int countri = 1;
		for(int i=0;i<numbers.length;i++) {
			int num = numbers[i];
			if(num == 1 || num == 4 ||num == 7) {
				answer += 'L';
				left = num+1;
				countle = 1;
			} else if(num == 3 || num == 6 || num == 9) {
				answer += 'R';
				right = num-1;
				countri = 1;
			} else {
				if (num==0)
					num = 11;
				int disle = Math.abs(left-num)/3 + countle;
				int disri = Math.abs(right-num)/3 + countri;
				if(disle>disri) {
					answer+= 'R';
					right = num;
					countri = 0;
				} else if(disle<disri) {
					answer += 'L';
					left = num;
					countle = 0;
				} else {
					if(hand.equals("right")) {
						answer += 'R';
						right = num;
						countri = 0;
					}
					else {
						answer += 'L';
						left = num;
						countle = 0;
					}
				}
			}
		}
        return answer;
	}
}
