package class2;

import java.util.ArrayList;
import java.util.Scanner;

public class no_10866 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();

		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0;i<N;i++) {
			String str = in.next();
			int size = list.size();
			switch(str) {
				case "push_front" : 
					int num = in.nextInt();
					list.add(0,num);
					break;
				case "push_back" :
					int num2 = in.nextInt();
					list.add(num2);
					break;
				case "pop_front" :
					if(size==0)
						System.out.println(-1);
					else {
						System.out.println(list.get(0));
						list.remove(0);
					}
					break;
				case "pop_back" :
					if(size==0)
						System.out.println(-1);
					else {
						System.out.println(list.get(size-1));
						list.remove(size-1);
					}
					break;
				case "size" :
					System.out.println(size);
					break;
				case "empty" :
					if(size==0)
						System.out.println(1);
					else
						System.out.println(0);
					break;
				case "front" :
					if(size==0)
						System.out.println(-1);
					else 
						System.out.println(list.get(0));
					break;
				case "back" :
					if(size==0)
						System.out.println(-1);
					else 
						System.out.println(list.get(size-1));
					break;
			}
		}
		in.close();
	}

}
