package stage7;

import java.util.ArrayList;
import java.util.Scanner;

public class no_1316 {
	static Scanner in= new Scanner(System.in);
	public static void main(String[] args) {
		
		
		int count = 0;
		int N = in.nextInt();
 
		for (int i = 0; i < N; i++) {
			if (check() == true) {
				count++;
			}
		}
		in.close();
		System.out.println(count);
	}

	public static boolean check() {
		boolean[] check = new boolean[26];
		int prev = 0;
		String str = in.next();
		
		for(int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);	// i ��° ���� ���� (���� ����)
			
			
			// �ռ� ���ڿ� i ��° ���ڰ� ���� �ʴٸ�?
			if (prev != now) {		
				
				// �ش� ���ڰ� ó�� ������ ��� (false �� ���)
				if ( check[now - 'a'] == false ) {
					check[now - 'a'] = true;		// true �� �ٲ��ش�
					prev = now;					// ���� ���� ���� prev �� �ٲ��ش� 
				}
	 
				// �ش� ���ڰ� �̹� ���� ���� �ִ� ��� (�׷�ܾ �ƴϰ� ��) 
				else {
					return false;	//�Լ� ����
				}
			}
	        
	        
			// �ռ� ���ڿ� i ��° ���ڰ� ���ٸ�? (���ӵ� ����)
			// else ���� ��� ��
			else {
				continue;
			}
		}    
		return true;
	}

}
