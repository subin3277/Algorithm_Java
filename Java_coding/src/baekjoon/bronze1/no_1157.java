package bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
        String S = br.readLine().trim();
 
        br.close();
 
        int arr[] = new int[26];
 
        int max = 0;
        char word = '?';
 
        for (int i = 0, size = S.length(); i < size; i++) {
            if (S.charAt(i) >= 97) {
                arr[S.charAt(i) - 97]++;
 
                if (max < arr[S.charAt(i) - 97]) {
                    word = (char) (S.charAt(i) - 32);            // 소문자일 때 계산
                    max = arr[S.charAt(i) - 97];
                } else if (max == arr[S.charAt(i) - 97]) {
                    word = '?';
                }
            } else {
                arr[S.charAt(i) - 65]++;
 
                if (max < arr[S.charAt(i) - 65]) {                // 대문자일 때 계산
                    word = S.charAt(i);
                    max = arr[S.charAt(i) - 65];
                } else if (max == arr[S.charAt(i) - 65]) {
                    word = '?';
                }
 
            }
        }
 
        System.out.println(word);
	}
}
