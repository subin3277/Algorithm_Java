package stage6;

public class no_4673 {
	
	private static boolean[] check = new boolean[10000];
	public static void main(String[] args) {
		for(int i=0;i<10000;i++) {
			print(i);
		}
		for(int i=0;i<10000;i++) {
			if(!check[i]) {
				System.out.println(i);
			}
		}
	}
	
	private static int print(int n) {
		int sum=0;
		if(n<10) {
			sum=2*n;
			check[sum]=true;
		} else if(n>=10 & n<100) {
			int[] num =new int[2];
			num[0] = n/10;
			num[1] = n%10;
			sum = n+num[0]+num[1];
			check[sum]=true;
		} else if(n>=100 & n<1000) {
			int[] num =new int[3];
			num[0] = n/100;
			num[1] = (n%100)/10;
			num[2] = n%10;
			sum = n+num[0]+num[1]+num[2];
			check[sum]=true;
		} else if(n>=1000 & n<10000) {
			int[] num =new int[4];
			num[0] = n/1000;
			num[1] = (n%1000)/100;
			num[2] = (n%100)/10;
			num[3]= n%10;
			sum = n+num[0]+num[1]+num[2]+num[3];
			if(sum>=10000) {
				return 0;
			}
			check[sum]=true;
		} else {
			return 0;
		}
		return sum;
	}

}
