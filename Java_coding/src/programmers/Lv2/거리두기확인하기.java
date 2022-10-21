package Lv2;

public class �Ÿ��α�Ȯ���ϱ� {

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
			//���ڿ� ��� �и�
			
			for(int j=0;j<place.length;j++) {
				for(int k=0;k<place[j].length;k++) {
					if(place[j][k]=='P') {
						//�����¿쿡 �ϳ��� P�� ������
						if((j>0&&place[j-1][k]=='P')||(j<4&&place[j+1][k]=='P')||(k>0&&place[j][k-1]=='P')||(k<4&&place[j][k+1]=='P')) {
							answer[i] = 0;
						}
					}
					if(place[j][k]=='O') {
						int count = 0;
						//�����¿쿡 P�� 1�� ���ϸ�
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
