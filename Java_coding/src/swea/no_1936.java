package swea;

import java.util.Scanner;

public class no_1936 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        /*
           ���� ���� �׽�Ʈ ���̽��� �־����Ƿ�, ������ ó���մϴ�.
        */
 
        int A = sc.nextInt();
        int B = sc.nextInt();
            switch(A){
                case 1:
                    if(B==2)
                        System.out.println("B");
                    else if(B==3)
                        System.out.println("A");
                case 2:
                    if(B==1)
                        System.out.println("A");
                    else if(B==3)
                        System.out.println("B");
                case 3:
                    if(B==1)
                        System.out.println("B");
                    else if(B==2)
                        System.out.println("A");
            }

	}

}
