public class no1 {

	public static void main(String[] args) {
		String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
		int[] choices = {5,3,2,7,5};
		String[] survey1 = {"TR","RT","TR"};
		int[] choices1 = {7,1,3};
		System.out.println(solution(survey1, choices1));
		
	}

	private static String solution(String[] survey, int[] choices) {
		String answer = "";
		int[][] score = new int[4][2];
		for(int i=0; i<survey.length;i++) {
			int tmp = Math.abs(choices[i]-4);
			int x=0;
			if(survey[i].equals("RT")||survey[i].equals("TR")) {
				if(survey[i].equals("RT"))
					x=1;
				if(choices[i]>4) {
					score[0][x] += tmp;
				} else if(choices[i]<4)
					score[0][1-x] += tmp;
			} else if(survey[i].equals("CF")||survey[i].equals("FC")) {
				if(survey[i].equals("CF"))
					x=1;
				if(choices[i]>4) {
					score[1][x] += tmp;
				} else if(choices[i]<4)
					score[1][1-x] += tmp;
			} else if(survey[i].equals("JM")||survey[i].equals("MJ")) {
				if(survey[i].equals("JM"))
					x=1;
				if(choices[i]>4) {
					score[2][x] += tmp;
				} else if(choices[i]<4)
					score[2][1-x] += tmp;
			} else if(survey[i].equals("AN")||survey[i].equals("NA")) {
				if(survey[i].equals("AN"))
					x=1;
				if(choices[i]>4) {
					score[3][x] += tmp;
				} else if(choices[i]<4)
					score[3][1-x] += tmp;
			}
		}
		
		if(score[0][0]>=score[0][1]) {
			answer += 'R';
		} else
			answer += 'T';
		if(score[1][0]>=score[1][1]) {
			answer += 'C';
		} else
			answer += 'F';
		if(score[2][0]>=score[2][1]) {
			answer += 'J';
		} else
			answer += 'M';
		if(score[3][0]>=score[3][1]) {
			answer += 'A';
		} else
			answer += 'N';
		return answer;
	}

}
