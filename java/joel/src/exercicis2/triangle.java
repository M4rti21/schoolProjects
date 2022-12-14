package exercicis2;
import java.util.Scanner;

public class triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double h = sc.nextInt();
		double b = sc.nextInt();
		
		double area = (0.5 * b * h);
		System.out.println(area);
	}
}
