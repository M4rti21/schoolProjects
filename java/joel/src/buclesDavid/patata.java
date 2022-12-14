package buclesDavid;

import java.util.Scanner;

public class patata {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int timesNum = sc.nextInt();
		String str = null;
		for (int timesLoop = 0; timesLoop < timesNum+1; timesLoop++) {
			 str = sc.nextLine();
			 System.out.println(str);
		}
		sc.close();
	}
}