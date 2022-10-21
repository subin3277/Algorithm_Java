package Lv1;

import java.util.Scanner;

public class 비밀지도 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] arr1 = {9,20,28,18,11};
		int[] arr2 = {30,1,21,17,28};
		int[] arr3 = {46,33,33,22,31,50};
		int[] arr4 = {27,56,19,14,14,10};
		String[] res = solution(N, arr3, arr4);
		in.close();

	}
	
	public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0;i<n;i++) {
        	int num = arr1[i] | arr2[i];
        	String tmp = "";
        	for(int j=0;j<n;j++) {
        		if(num%2==0) {
        			tmp = " "+tmp;
        		} else
        			tmp = "#"+tmp;
        		num /= 2;
        	}
        	answer[i] = tmp;
        }
        return answer;
    }

}

