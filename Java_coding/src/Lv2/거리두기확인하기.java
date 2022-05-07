package Lv2;

public class 거리두기확인하기 {

	public static void main(String[] args) {
		String[][] places = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},{"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}
		,{"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},{"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}
		,{"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
		System.out.println(solution(places));
	}
	
	public static int[] solution(String[][] places) {
		int[] answer = {};
		for(int i=0;i<places.length;i++) {
			
			char[][] place = new char[5][5];
			for(int j=0;j<places[i].length;i++) {
				char[] charlist = places[i][j].toCharArray();
				place[j] = charlist;
			}
			//문자열 모두 분리
			
			for(int j=0;j<place.length;j++) {
				for(int k=0;k<place[j].length;k++) {
					if(place[j][k]=='P') {
						//상하좌우에 하나라도 P가 있으면
						if((j>0&&place[j-1][k]=='P')||(j<4&&place[j+1][k]=='P')||(k>0&&place[j][k-1]=='P')||(k<4&&place[j][k+1]=='P')) {
							answer[i] = 0;
						}
					}
					if(place[j][k]=='O') {
						int count = 0;
						//상하좌우에 P가 1개 이하면
						if(j>0&&place[j-1][k]=='P') {
							count++;
						}
						if(j<4&&place[j+1][k]=='P') {
							count++;
						}
						if(k>0&&place[j][k-1]=='P') {
							count++;;
						}
						if(k<4&&place[j][k+1]=='P') {
							count++;
						}
						if(count>1)
							answer[i]=0;
						else
							answer[i]=1;
					}
				}
			}
		}
		return answer;
	}

}
