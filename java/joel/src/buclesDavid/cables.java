package buclesDavid;

import java.util.Scanner;

public class cables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		sc.nextLine();
		String type;
		String cut;
		int h = 0;
		int m = 0;
		int a;
		for (int i = 0; i < times; i++) {
			a = sc.nextInt();
			sc.nextLine();
			type = sc.nextLine();
			cut = type.replaceAll("\\s", "");
			for (int ii = 0; ii < cut.length(); ii++) {
				if (cut.charAt(ii) == 'H') {
					h += 1;
				} else if (cut.charAt(ii) == 'M') {
					m += 1;
				}
			}
			if (h == m) {
				System.out.println("POSIBLE" + a);
			} else {
				System.out.println("IMPOSIBLE");
			}
			h = 0;
			m = 0;
		}
		sc.close();
	}
}