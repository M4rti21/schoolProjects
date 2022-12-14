package exercicis2;
import java.util.Scanner;

public class zelda {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sec = sc.nextInt();
		
		String temps = null;
		double day = sec/60/60/24;
		//System.out.println("day= " +day);
		day = Math.ceil(day);
		int iday = (int) day;
		//System.out.println("iday= " + iday);
		int hlf = (sec/60/60/12) % 2;
		//System.out.println("mig= " + hlf);
		
		switch(hlf) {
		case 0:
			temps = "mati";
			break;
		case 1:
			temps = "nit";
			break;
		}
		//System.out.println("temps= " + temps);
		System.out.println(temps + " del dia " + (iday+1));
	}
}
