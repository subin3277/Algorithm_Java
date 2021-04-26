package stage7;

import java.util.Scanner;

public class no_1316 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		int num = scanner.nextInt();
		int count=0;
		for (int i=0;i<num;i++) {
			String str = scanner.next();
			if ((str.length()==1)||(str.length()==2))
				count+=1;
			else {
				for (int j=0;j<str.length();j++) {
					char letter = str.charAt(j);
					if (letter==str.charAt(j+1)) {
						for(int k=j+1;k<str.length();k++) {
							if(letter!=str.charAt(k)) {
								for (int l=k+1;l<str.length();l++) {
									if(letter==str.charAt(l)) {
										break;
									} 
								}
								count++;
								break;
							}
						}
					} else {
						for (int k=j+1;k<str.length();k++) {
							if(letter==str.charAt(k)) {
								break;
								} 
							}
						count++;
						break;
					}
				}
			
			}
			System.out.println(count);	
		}
		
	}

}
