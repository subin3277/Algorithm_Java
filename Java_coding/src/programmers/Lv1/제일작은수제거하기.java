package Lv1;

import java.util.Arrays;

public class ���������������ϱ� {

	public static void main(String[] args) {
		int[] arr = {1,3,2, 4};
		solution(arr);

	}

	public static int[] solution(int[] arr) {
		if (arr.length == 1) {
			int[] answer = {-1};
			return answer;
		} // ���̰� 1�� ��
		
		int[] answer = new int[arr.length-1];
		int[] tmp = Arrays.copyOf(arr, arr.length); //���� �迭 �����س���
		Arrays.sort(arr); // �������� �迭
		int min = arr[0]; // ���� ������ ã��
		int j = 0;
		for(int i=0;i<arr.length;i++) {
			if(tmp[i] != min) { // ���������� �ƴϸ� ����Ʈ�� �߰�
				answer[j] = tmp[i];
				j++;
			}
		}
        return answer;
    }
}
