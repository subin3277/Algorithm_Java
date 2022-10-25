package Lv1;

import java.util.Arrays;

public class 제일작은수제거하기 {

	public static void main(String[] args) {
		int[] arr = {1,3,2, 4};
		solution(arr);

	}

	public static int[] solution(int[] arr) {
		if (arr.length == 1) {
			int[] answer = {-1};
			return answer;
		} // 길이가 1일 때
		
		int[] answer = new int[arr.length-1];
		int[] tmp = Arrays.copyOf(arr, arr.length); //원래 배열 저장해놓기
		Arrays.sort(arr); // 오름차순 배열
		int min = arr[0]; // 가장 작은수 찾기
		int j = 0;
		for(int i=0;i<arr.length;i++) {
			if(tmp[i] != min) { // 가장작은수 아니면 리스트에 추가
				answer[j] = tmp[i];
				j++;
			}
		}
        return answer;
    }
}
