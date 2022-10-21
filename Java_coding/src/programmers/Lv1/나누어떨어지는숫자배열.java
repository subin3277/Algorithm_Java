
import java.util.Arrays;

public class 나누어떨어지는숫자배열 {

	public static void main(String[] args) {
		int[] arr = {5, 6, 7, 10};
		int divisor = 5;
		System.out.println(Solution.solution(arr, divisor));
	}

}

class Solution {
    public static int[] solution(int[] arr, int divisor) {
    	int[] tmp = new int[arr.length+1];
    	int cnt = 1;
    	for(int i=1; i < arr.length+1; i++) {
    		if (arr[i] % divisor == 0) {
    			tmp[cnt] = arr[i-1];
    			cnt++;
    		}
    	}
    	int[] answer = new int[cnt-1];
    	if (cnt == 1) {
    		answer[0] = -1;
    	}
    	else {
    		for (int i=0;i<cnt;i++) {
        	answer[i] = tmp[i+1];
    		}
    		Arrays.sort(answer);
    	}
        return answer;
    }
}