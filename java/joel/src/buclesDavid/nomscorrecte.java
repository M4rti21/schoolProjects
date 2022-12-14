package buclesDavid;

import java.util.Scanner;

public class nomscorrecte {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		boolean tr = false;
		
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) != s.charAt(0)) {
				tr = true;
			}
		}
		if (tr == true) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}
		sc.close();
	}
}
