package exercicis2;
import java.util.Scanner;

import java.util.Scanner;

public class diames {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int gener = 31;
		//System.out.println(gener);
		int febrer = gener + 28;
		//System.out.println(febrer);
		int marc = febrer + 31;
		//System.out.println(marc);
		int abril = marc + 30;
		//System.out.println(abril);
		int maig = abril + 31;
		//System.out.println(maig);
		int juny = maig + 30;
		//System.out.println(juny);
		int juliol = juny + 31;
		//System.out.println(juliol);
		int agost = juliol + 31;
		//System.out.println(agost);
		int septembre = agost + 30;
		//System.out.println(septembre);
		int octubre = septembre + 31;
		//System.out.println(octubre);
		int novembre = octubre + 30;
		//System.out.println(novembre);
		int desembre = novembre + 31;
		//System.out.println(desembre);
		
		if (num < gener) {
			System.out.println("1");
		} else if (num <= febrer) {
			System.out.println("2");
		} else if (num <= marc) {
			System.out.println("3");
		} else if (num <= abril) {
			System.out.println("4");
		} else if (num <= maig) {
			System.out.println("5");
		} else if (num <= juny) {
			System.out.println("6");
		} else if (num <= juliol) {
			System.out.println("7");
		} else if (num <= agost) {
			System.out.println("8");
		} else if (num <= septembre) {
			System.out.println("9");
		} else if (num <= octubre) {
			System.out.println("10");
		} else if (num <= novembre) {
			System.out.println("11");
		} else if (num <= desembre) {
			System.out.println("12");
		}
	}

}