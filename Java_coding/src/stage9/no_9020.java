package stage9;

public class no_9020 {

	boolean[] prime = new boolean[10001];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		get_prime();
	}

	void get_prime() {
	    
		prime[0] = prime[1] = true;
 
		for (int i = 2; i <= Math.sqrt(prime.length); i++) {
			if (prime[i]) continue;
            
			for (int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}
}
