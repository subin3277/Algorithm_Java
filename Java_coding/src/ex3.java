import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		int K = in.nextInt();
		
		char[] list = new char[str.length()];
		list = str.toCharArray();
		
		if(K==0)
			System.out.println("Á¾·áÇÔ");
		else if(K>0) {
			for(int i=K;i<=str.length();i+=K) {
				int count = 0;
				while(count<str.length()) {
					if(i==str.length())
						i=0;
					System.out.print(list[i]);
					count++;
					i++;
				}
				System.out.println();
			}
		}
		else {
			int i = str.length()+K;
			int cnt = str.length()/(K*(-1));
			for(int k=0;k<cnt;k++) {
				int count = 0;
				while(count<str.length()) {
					if(i==str.length())
						i=0;
					System.out.print(list[i]);
					count++;
					i++;
				}
				System.out.println();
				i+=K;
			}
		}
		
		
		
	}

}
