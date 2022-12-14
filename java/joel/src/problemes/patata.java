package problemes;

import java.util.Scanner;

public class patata {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		sc.nextLine();
		String text;
		for (int i = 0; i < times; i++) {
			text = sc.next();
			text = text.toLowerCase();
			if (text.equals("patata")) System.out.println("Es Patata");
			else System.out.println("No es Patata");
		}
		sc.close();
	}
}