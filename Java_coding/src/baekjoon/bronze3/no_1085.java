package stage9;

import java.util.Scanner;

public class no_1085 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        
		int x = in.nextInt();
		int y = in.nextInt();
		int w = in.nextInt();
		int h = in.nextInt();
        
		int x_min = Math.min(x, w-x);	// x�� �ּҰŸ�
		int y_min = Math.min(y, h-y);	// y�� �ּҰŸ�
        
		// x�� y�� �ּҰŸ� �� ���� ���� ��
		System.out.println(Math.min(x_min, y_min));
	}

}
