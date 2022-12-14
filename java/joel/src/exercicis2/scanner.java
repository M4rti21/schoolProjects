package exercicis2;

import java.util.Scanner;

public class scanner {
	public static void main(String[] args) {
		
		int a;
		int b;
		
		System.out.println("multiplicacions :D");
		
		Scanner sc;
		sc = new Scanner(System.in);
		
		System.out.println("digues el primer numero");
		
		a = sc.nextInt();
		
		System.out.println("digues el segon numero");
		
		b = sc.nextInt();
		
		System.out.println("el resultat es: " + a*b);
	}
}