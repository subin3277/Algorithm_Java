package swea;

import java.util.Scanner;

public class no_1936 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        /*
           여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
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
