package exercicis2;
import java.util.Scanner;

public class ges {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char txt1 = scan.next().charAt(0);
		char txt2 = scan.next().charAt(0);
		char txt3 = scan.next().charAt(0);
		char txt4 = scan.next().charAt(0);
		char txt5 = scan.next().charAt(0);
		int c = 0;
		
		if(txt1 == 'G') {
				c = c + 1;
		}
		if(txt2 == 'G') {
			c = c + 1;
		}
		if(txt3 == 'G') {
			c = c + 1;
		}
		if(txt4 == 'G') {
			c = c + 1;
		}
		if(txt5 == 'G') {
			c = c + 1;
		}
		
		if (c < 1 ) {
			System.out.println("NO");
		} else if (c == 1) {
			System.out.println("SI");
		} else {
			System.out.println("PUNTOS");
		}
	}

}
