package etc;

public class sk_2 {

	public static void main(String[] args) {
		int[] per = {20,23,24};
		int[][] pay = {{100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000},
				{100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000},
				{350000,50000,50000,50000,50000,50000,50000,50000,50000,50000,50000,50000}};
		int[] est = {100000,100000,100000};
		
		int[] per2 = {24,59,59,60};
		int[][] pay2 = {{50000,50000,50000,50000,50000,50000,50000,50000,50000,50000,50000,50000},
				{50000,50000,50000,50000,50000,50000,50000,50000,50000,50000,50000,50000},
				{350000,50000,50000,50000,50000,50000,50000,50000,50000,50000,50000,50000},
				{50000,50000,50000,50000,50000,50000,50000,50000,50000,50000,50000,50000}};
		int[] est2 = {350000,50000,40000,50000};
		
		int[] res = solution(per2,pay2,est2);
		for(int i=0;i<res.length;i++)
			System.out.println(res[i]);
	}

	public static int[] solution(int[] periods, int[][] payments, int[] estimates) {
        int[] answer = {0,0};
        
        for(int i=0;i<periods.length;i++) {
        	
        	int sum=0;
        	for(int k=0;k<12;k++) {
        		sum += payments[i][k];
        	}
        	int nextsum = sum - payments[i][0] + estimates[i];
        	
        	boolean thisvip = false;
        	boolean nextvip = false;
        	
        
        	if(sum>=900000&&periods[i]>=24)
        		thisvip = true;
        	else if(sum>=600000&&periods[i]>=60)
        		thisvip = true;
        	
        	if(nextsum>=900000&&periods[i]>=23)
        		nextvip = true;
        	else if(nextsum>=600000&&periods[i]>=59)
        		nextvip = true;
               	
        	if(thisvip&&!nextvip)
        		answer[1]++;
        	else if(!thisvip&&nextvip)
        		answer[0]++;
    			
        }

        return answer;
    }
}
