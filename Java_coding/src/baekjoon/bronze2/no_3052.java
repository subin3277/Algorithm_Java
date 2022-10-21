package stage5;

import java.util.Scanner;

public class no_3052 {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		
		int[] mod=new int[10];
		int count=0;
		for(int i=0;i<10;i++) {
			mod[i]=num.nextInt()%42;
		}
		for(int i=0;i<10;i++) {
			int cnt=0;
			for(int j=i+1;j<10;j++) {
				if(mod[i]==mod[j])
					cnt++;
			}
			if(cnt==0)
				count++;
		}
		
		System.out.println(count);
		num.close();
	}

}
