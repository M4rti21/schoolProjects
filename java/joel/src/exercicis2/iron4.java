package exercicis2;
import java.util.Locale;
import java.util.Scanner;

public class iron4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String key = sc.nextLine();
		char kch = 0;
		
		if (key.length() == 1) {
			kch = key.charAt(0);
		} else {
			System.out.println("Error");
			System.exit(0);
		}
		
		switch(kch) {
		case 'Q':
			System.out.println("Skill 1");
			break;
		case 'W':
			System.out.println("Skill 2");
			break;
		case 'E':
			System.out.println("Skill 3");
			break;
		case 'R':
			System.out.println("Ultimate");
			break;
		case 'B':
			System.out.println("Recall");
			break;
		case 'D':
			System.out.println("Bronzes never use summoners");
			break;
		case 'F':
			System.out.println("Bronzes never use summoners");
			break;
		default:
			System.out.println("Error");
		}
	}
}
