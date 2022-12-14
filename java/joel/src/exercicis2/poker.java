package exercicis2;
import java.util.Scanner;

public class poker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//CREEM SCANNER

		int a = sc.nextInt();
		int b = sc.nextInt();					//TRANSFORMEM ELS CHAR
		int c = sc.nextInt();					//EN INT
		
		if (a == 0) a = b;
		if (b == 0) b = c;
		if (c == 0) c = a;
		
		if (a == b && a == c) {
			System.out.println("TRIO");
		} else if (a == b && a == c) {
			System.out.println("TRIO");
		} else if (b == c) {
			System.out.println("PARELLA");
		} else if (a == c) {
			System.out.println("PARELLA");
		} else if (a == b) {
			System.out.println("PARELLA");
		} else {
			System.out.println("RES");
		}

	}
}
