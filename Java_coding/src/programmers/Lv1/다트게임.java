package Lv1;

import java.util.Scanner;

public class 다트게임{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		int res = solution(str);
		System.out.println(res);
		in.close();
	}
	
	public static int solution(String dartResult) {
        int answer = 0;
        int[] list = new int[3];
        char[] charlist = dartResult.toCharArray();
        
        int count = 0;
        for(int i =0;i<charlist.length;i++) {
        	if(Character.isDigit(charlist[i])) {
        		if(Character.isDigit(charlist[i+1])) {
        			list[count] = 10;
        			i++;
        		}
        		else
        			list[count] = (int)charlist[i]-48;
        	}
        	i++;
        	
        	if(charlist[i]=='S') {
        		list[count] = list[count];
        	}else if(charlist[i]=='D') {
        		list[count] *= list[count]; 
        	}else if(charlist[i]=='T') {
        		list[count] = list[count]*list[count]*list[count];
        	}
        	
        	if(++i >=charlist.length) {
        		break;
        	}
        	
        	if(charlist[i]=='*') {
        		if(count==0)
        			list[count] *=2;
        		else {
        			list[count-1] *=2;
        			list[count] *=2;
        		}
        	} else if(charlist[i]=='#') {
        		list[count] *=-1;
        	} else
        		i--;
        	count++;
        }
        
        answer = list[0]+list[1]+list[2];
        
        return answer;
    }
	
}
