package Lv1;

import java.util.Arrays;
import java.util.Scanner;

public class ½ÇÆÐÀ² {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] stages1 = {2,1,2,6,2,4,3,3};
		int[] stages2 = {4,4,4,4,4};
		solution(N,stages1);
		in.close();
	}

	public static int[] solution(int N, int[] stages) {
        int[] answer = {};
        int[] list = new int[N+1];
        float[] rate = new float[N+1];
        for(int i = 0;i<stages.length;i++) {
        	list[stages[i]-1]++;
        }
        int sum = stages.length;
        for(int i=0;i<list.length;i++) {
        	rate[i] = list[i] / sum ;
        	sum -= list[i];
        }
        
        return answer;
    }
	
}
