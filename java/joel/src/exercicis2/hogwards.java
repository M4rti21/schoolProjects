package exercicis2;
import java.util.Scanner;

import java.util.Scanner;

public class hogwards {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();

		switch(text) {
		case "Coratge":
			System.out.println("Gryffindor");
			break;
		case "Coneixement":
			System.out.println("Ravenclaw");
			break;
		case "Ambicio":
			System.out.println("Slytherin");
			break;
		default:
			System.out.println("Hufflepuff");
			break;
		}
		
	}
}
