package exercicis2;
import java.util.Scanner;

public class tisores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p1 = sc.nextInt();
		int p2 = sc.nextInt();
		
		if (p1 < p2 && p1 != (p2-2)) {
			System.out.println("Jugador2");	
		} else if (p2 < p1 && p2 != (p1-2)) {
			System.out.println("Jugador1");
		} else if (p1 == 1 && p2 == 3) {
				System.out.println("Jugador1");
		} else if (p2 == 1 && p1 == 3) {
			System.out.println("Jugador2");
		} else if (p1 == p2 && p1 != 0){
			System.out.println("EMPAT");
		} else {
			System.out.println("ERROR");
		}
	}
}
