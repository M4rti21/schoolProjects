package buclesDavid;

import java.util.Scanner;

public class vocals {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		String notes;
		int lgh;
		
		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;
		
		notes = sc.nextLine();
		
		for (int ii = 0; ii < times; ii++) {
			notes = sc.nextLine();
			lgh = notes.length();
			for (int iii = 0; iii < lgh; iii++) {
				if (notes.charAt(iii) == 'A' || notes.charAt(iii) == 'a') {
					a += 1;
				} else if (notes.charAt(iii) == 'E' || notes.charAt(iii) == 'e') {
					e += 1;
				} else if (notes.charAt(iii) == 'I' || notes.charAt(iii) == 'i') {
					i += 1;
				} else if (notes.charAt(iii) == 'O' || notes.charAt(iii) == 'o') {
					o += 1;
				} else if (notes.charAt(iii) == 'U' || notes.charAt(iii) == 'u') {
					u += 1;
				}
			}
			System.out.println("A: " + a + " E: " + e + " I: " + i + " O: " + o + " U: " + u);
			a = 0;
			e = 0;
			i = 0;
			o = 0;
			u = 0;
		}
		sc.close();
	}
}
