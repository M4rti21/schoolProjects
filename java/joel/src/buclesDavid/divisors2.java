package buclesDavid;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class divisors2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vegades = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		String numstr = "";

		for (int i = 0; i < vegades; i++) {
			list.add(sc.nextInt());
		}
		for (int ii = 0; ii < list.size(); ii++) {
			for (int t = 1; t <= list.get(ii); t++) {
				if (list.get(ii) % t == 0) {
					numstr = numstr + t + " ";
				}
			}
			System.out.println(numstr);
			numstr = "";
		}
		sc.close();
	}
}