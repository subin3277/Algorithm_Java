

public class no5 {

	public static void main(String[] args) {
		int[][] rc = {{1,2,3},{4,5,6},{7,8,9}};
		String[] operations = {"Rotate","ShiftRow"};
		rc =solution (rc, operations);
		for(int i=0;i<rc.length;i++) {
			for(int j=0;j<rc[0].length;j++) {
				System.out.print(rc[i][j]);
			}
			System.out.println();
		}

	}
	public static int[][] solution(int[][] rc, String[] operations){
		int[][] answer = {};
		for(int i=0;i<operations.length;i++) {
			if(operations[i].equals("Rotate")) 
				answer = Rotate(rc);				
			else if(operations[i].equals("ShiftRow"))
				answer = ShiftRow(rc);
		}
		return answer;
	}
	
	public static int[][] Rotate(int[][] rc) {
		int[][] copy = rc;
		int tmp = copy[0][0];
		for(int i=0;i<rc.length-1;i++) {
			copy[i][0]=copy[i+1][0];
		}
		for(int i=0;i<rc[0].length-1;i++) {
			copy[rc.length-1][i]=copy[rc.length-1][i+1];
		}
		for(int i=rc.length-1;i>0;i--) {
			copy[i][rc[0].length-1]=copy[i-1][rc[0].length-1];
		}
		for(int i=rc[0].length-1;i>1;i--) {
			copy[0][i] = copy[0][i-1];
		}
		copy[0][1] = tmp;
		return copy;
	}
	public static int[][] ShiftRow(int[][] rc) {
		int[][] copy = rc;
		int[] tmp = copy[rc.length-1];
		for(int i=rc.length-1;i>0;i--) {
			copy[i] = copy[i-1];
		}
		copy[0] = tmp;
		return copy;
	}
}
