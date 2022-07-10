package etc;

public class sk_1 {

	public static void main(String[] args) {
		int[] p = {2,5,3,1,4};
		int[] p2 = {2,3,4,5,6,1};
		int[] p3 = {1,2,3,4,5,6,7,8,9};
		
		p=solution(p2);
		for(int i=0;i<p2.length;i++) {
			System.out.println(p[i]);
		}
		

	}
	
	public static int[] solution(int[] p) {

		int[] answer = new int[p.length];
        for(int i=0;i<p.length;i++)
        	answer[i] = 0;
        
        int i=0;
        
        while(i<p.length) {
        	int min=1000;
        	int j=0;
        	for(int k=i;k<p.length;k++) {
            	if(min>p[k]) {
            		min = p[k];
            		j=k;
            	}
            		
            } //2¹ø
        	
        	if(i!=j) {
        		int tmp = p[i];
        		p[i] = p[j];
        		p[j] = tmp;
        		answer[i] ++;
        		answer[j] ++;
        	} //3¹ø
        	
        	i++;
        }
        

        return answer;
    }

}
