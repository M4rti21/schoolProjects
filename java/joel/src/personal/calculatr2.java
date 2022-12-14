package personal;

import java.util.Locale;
import java.util.Scanner;

public class calculatr2 {
	public static void main(String[] args) {
		int choice;
		double a, b, result;		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		System.out.println("calculadora");
		System.out.println("que vols fer? 1(sumar), 2(restar), 3(dividir), 4(multiplicar)");
		choice = sc.nextInt();
		System.out.println("digues el primer numero:");
		a = sc.nextDouble();
		System.out.println("digues el segon numero:");
		b = sc.nextDouble();

		switch(choice) {
			case 1:
				result = a+b;
				break;
			case 2:
				result = a-b;
				break;
			case 3:
				result = a/b;
				break;
			case 4:
				result = a*b;
				break;
			default:
				System.out.println("system error :/");
				result = 0;
				System.exit(0);
		}
		System.out.println("el resultat es... " + result);
		sc.close();
	}
}