package buclesDavid;

import java.util.Scanner;

public class nota10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int scan;
		int notes = 0;
		float mitjana = 0;
		int e = 0;
		int n = 0;
		int b = 0;
		int s = 0;
		int i = 0;
		int md = 0;
		
		boolean sw = true;
		
		while (sw == true) {
			scan = sc.nextInt();
			if (scan == -1){
				sw = false;
			} else if (scan == 10 || scan == 9) {
				e += 1;
				mitjana += scan;
				notes += 1;
			} else if (scan == 7 || scan == 8) {
				n += 1;
				mitjana += scan;
				notes += 1;
			} else if (scan == 6) {
				b += 1;
				mitjana += scan;
				notes += 1;
			} else if (scan == 5) {
				s += 1;
				mitjana += scan;
				notes += 1;
			} else if (scan == 4) {
				i += 1;
				mitjana += scan;
				notes += 1;
			} else if (scan == 0 || scan == 1 || scan == 2 || scan == 3) {
				md += 1;
				mitjana += scan;
				notes += 1;
			}
		}
		
		System.out.println("NOTES: " + notes + " MITJANA: " + mitjana/notes + " E: " + e + " N: " + n + " B: " + b + " S: " + s + " I: " + i + " MD: " + md);
		sc.close();
	}
}
