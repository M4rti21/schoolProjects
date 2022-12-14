package exercicis2;
import java.util.Scanner;

public class anyTraspass {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int trs = year % 4;
		int trs1 = year % 100;
		int trs4 = year % 400;
		
		//System.out.println(year);
		//System.out.println(trs);
		//System.out.println(trs1);
		//System.out.println(trs4);
		
		if (trs == 0 && trs == trs1 && trs == trs4) {
			System.out.println("SI");
		} else if (trs == 0 && trs1 != 0) {
			System.out.println("SI");
		} else if (trs == 0 && trs != 0) {
			System.out.println("SI");
		} else if (trs == 0 && trs == 0){
			System.out.println("NO");
		} else {
			System.out.println("NO");
		}
		sc.close();
	}
}
