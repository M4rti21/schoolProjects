package buclesDavid;

import java.util.Scanner;

public class numGranPetit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean sw = true;
		int a;
		int p = 1000000;
		int g = -1000000;
		
		while (sw == true) {
			a = sc.nextInt();
			if (a == 0) {
				sw = false;
			} else {
				if (a < p) {
					p = a;
				}
				if (a > g) {
					g = a;
				}
			}
		}
		System.out.println(g + " " + p);
		sc.close();
	}
}
