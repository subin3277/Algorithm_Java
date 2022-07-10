package etc;

public class sk_3 {

	public static void main(String[] args) {
		int n = 5;
		String[] plans = {"100 1 3","500 4","2000 5"};
		String[] cli = {"300 3 5", "1500 1","100 1 3","50 1 2"};
		
		
		
		int[] sol = solution(n,plans,cli);
		for(int i=0;i<sol.length;i++)
			System.out.println(sol[i]);
	}
	
	public static int[] solution(int n, String[] plans, String[] clients) {
        int[] answer = new int[clients.length];
        
        int[] data = new int[plans.length]; //제공데이터
        String[] service = new String[plans.length]; //제공 부가서비스
        for(int i=0;i<service.length;i++)
        	service[i] = "";
        
        for(int i=0;i<plans.length;i++) {
        	String[] tmp = plans[i].split(" ");
        	data[i] = Integer.parseInt(tmp[0]);
        	for(int j=1;j<tmp.length;j++) {
        		for(int k=i;k<plans.length;k++)
        			service[k] += tmp[j];
        	}
        }

        for(int i=0;i<clients.length;i++) {
        	
        	String[] tmp = clients[i].split(" ");

        	for(int j=0;j<plans.length;j++) {
        		boolean state = true;
        		for(int k=1;k<tmp.length;k++) {
            		if(!service[j].contains(tmp[k])){
            			state = false;
            			break;
            		}
        		}
        		if(state&&data[j]>=Integer.parseInt(tmp[0])) {
        			answer[i] = j+1;
        			break;
        		}
        	}
        	
        }
        
        return answer;
    }
}
