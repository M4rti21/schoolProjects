package exercicis2;
import java.util.Scanner;

public class secToHour {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sec = sc.nextInt();
		
		int hh = 0;
		int mm = 0;
		int ss = 0;
		
		
		int min = sec / 60;
		
		hh = min / 60;
		mm = (sec / 60) - (hh*60);
		ss = sec - ((hh*60*60) + (mm*60));
		
		System.out.println(hh + ":" + mm + ":" + ss);
	}
}
