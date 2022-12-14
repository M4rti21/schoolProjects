package buclesDavid;

import java.util.Scanner;

public class la {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		String la = "";
		int count = 0;
		
		for (int i = 0; i < times; i++) {
			la = sc.nextLine();
			for (int ii = 0; ii < la.length(); i++) {
				if (la.charAt(ii) == 'L' || la.charAt(ii) == 'l') {
					if (la.charAt(ii + 1) == 'a' || la.charAt(ii + 1) == 'A') {
						count += 1;
					}
				}
			}
			System.out.println(count);
			count = 0;
		}
		
		sc.close();
	}
}
