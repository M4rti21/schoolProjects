package exercicis2;
import java.util.Scanner;

public class horaCorrecete {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hh = sc.nextInt();
		int mm = sc.nextInt();
		int ss = sc.nextInt();
		int check = 0;
		
		if (hh <= 23 && hh >= 0 ) {
			check = check + 1;
		}
		if (mm <= 59 && mm >= 0 ) {
			check = check + 1;
		}
		if (ss <= 59 && ss >= 0 ) {
			check = check + 1;
		}
		//System.out.println(check);
		if (check == 3) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}
	}
}
