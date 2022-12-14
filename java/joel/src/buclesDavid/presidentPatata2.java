package buclesDavid;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class presidentPatata2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < a; i++) {
			list.add(sc.nextInt());
		}
		for (int c = 0; c < list.size(); c++) {
			for (int t = 1; t <= list.get(c); t++) {
				System.out.println("antonio alcala hijo de puta");
			}
			if (c != list.size()) {
				System.out.println("");
			}
		}
		sc.close();
	}
}