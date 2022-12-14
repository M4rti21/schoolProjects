package examen;
import java.util.Scanner;

public class reclamacionsDespistats {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		switch(input) {
		case "DAMvi":
			System.out.println("Marc");
			break;
		case "DAM":
			System.out.println("Julian");
			break;
		case "ASIX":
			System.out.println("Lino");
			break;
		case "SMX":
			System.out.println("Noelia");
			break;
		case "PFI":
			System.out.println("Sonia");
			break;
		default:
			System.out.println("Si us plau, torna a la ESO");
			break;
		}
		
		sc.close();
	}
}
