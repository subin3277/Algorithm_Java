package stage7;

import java.util.Scanner;

public class no_1152 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		String str = scanner.nextLine().trim();
		if (str.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(str.split(" ").length);
        }
		scanner.close();
	}
}
