package silver5;

import java.util.Scanner;

public class no_2941 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		int count=0;
		String str = scanner.next();
		for (int i = 0; i < str.length(); i++) {
			 
			char ch = str.charAt(i);
		 
			if(ch == 'c') {			// ���� ch �� c ���?
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == '=')	//���� ch ���� ���ڰ� '=' �̶��?
						// i+1 ������ �ϳ��� �����̹Ƿ� ���� ���ڸ� �ǳ� �ٱ� ���� 1 ����
						i++;		
					else if(str.charAt(i + 1) == '-') 
						i++;
				}
			}
			else if(ch == 'd') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == 'z') {
						if(i < str.length() - 2) {
							if(str.charAt(i + 2) == '=') 	// dz= �� ���
								i += 2;
						}
					}
					else if(str.charAt(i + 1) == '-')	// d- �� ���
						i++;
				}
			}
		    
			else if(ch == 'l') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == 'j') 	// lj �� ���
						i++;
				}
			}
			else if(ch == 'n') {
				if(i < str.length() - 1) 
					if(str.charAt(i + 1) == 'j') {	// nj �� ���
						i++;
				}
			}
			else if(ch == 's') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == '=') 	// s= �� ���
						i++;
				}
		    }
			else if(ch == 'z') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == '=') 	// z= �� ���
						i++;
				}
			}
			count++;
		}
		System.out.println(count);
		scanner.close();
	}
}
