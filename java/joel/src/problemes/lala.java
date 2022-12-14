package problemes;

import java.util.Scanner;

public class lala {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		sc.nextLine();
		String la;
		int las = 0;
		for (int i = 0; i < times; i++) {
			la = sc.nextLine();
			la = la.toLowerCase();
			for (int j = 1; j < la.length(); j++) {
				if (la.charAt(j) == 'a' && la.charAt(j-1) == 'l') las++;
			}
			System.out.println(las);
			las = 0;
		}
		sc.close();
	}
}