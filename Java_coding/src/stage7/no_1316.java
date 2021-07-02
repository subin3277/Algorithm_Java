package stage7;

import java.util.ArrayList;
import java.util.Scanner;

public class no_1316 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		int num = scanner.nextInt();
		int count=0;
		for (int i=0;i<num;i++) {
			String str = scanner.next();
			if ((str.length()==1)||(str.length()==2))
				count++;
			else {
				ArrayList<String> strlist = new ArrayList<>();
				for(int j=0;j<str.length()-1;j++) {
					if(str.charAt(j)!=str.charAt(j+1)) {
						if(j==str.length()-2) {
							if(!strlist.contains(Character.toString(str.charAt(j+1)))) {
								count++;
							}
						} else {
							if(!strlist.contains(Character.toString(str.charAt(j)))) {
								strlist.add(Character.toString(str.charAt(j)));
							} else {
								break;
							}
						}
						
					} 
				}
			}	
		}
		scanner.close();
		System.out.println(count);
	}

}
