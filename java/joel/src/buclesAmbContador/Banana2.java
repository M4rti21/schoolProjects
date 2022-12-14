package buclesAmbContador;

import java.util.Scanner;

public class Banana2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		
		int b = 0;
		int p = 0;
		while (! a.equals("0")) {
		    if (a.equals("P")) p++;
		    if (a.equals("B")) b++;
		    a = sc.nextLine();
		}
		if (p>b) System.out.println("M'agraden els platans");
		else if (b>p) System.out.println("M'agraden les bananes");
		else System.out.println("No puc distingir entre un platan i una banana");
		sc.close();
	}
}
