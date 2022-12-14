package personal;

import java.util.Scanner;

public class calculatr {
	public static void main(String[] args) {
		
		int choice;
		int a;
		int b;
		
		Scanner sc;
		sc = new Scanner(System.in);
		
		System.out.println("calculadora :D");
		System.out.println("que vols fer? 1(sumar), 2(restar), 3(dividir), 4(multiplicar)");
		choice = sc.nextInt();
		
		if (choice == 1) {
			System.out.println("digues el primer numero");
			a = sc.nextInt();
			System.out.println("digues el segon numero");
			b = sc.nextInt();
			System.out.println("el resultat es: " + (a+b));
			
		} else if (choice == 2) {
			System.out.println("digues el primer numero");
			a = sc.nextInt();
			System.out.println("digues el segon numero");
			b = sc.nextInt();
			System.out.println("el resultat es: " + (a-b));
			
		} else if (choice == 3) {
			System.out.println("digues el primer numero");
			a = sc.nextInt();
			System.out.println("digues el segon numero");
			b = sc.nextInt();
			System.out.println("el resultat es: " + (a/b));
			
		} else if (choice == 4) {
			System.out.println("digues el primer numero");
			a = sc.nextInt();
			System.out.println("digues el segon numero");
			b = sc.nextInt();
			System.out.println("el resultat es: " + (a*b));
			
		} else {
			System.out.println("system error :/");
		}
		sc.close();
	}
}
