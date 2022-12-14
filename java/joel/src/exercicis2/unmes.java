package exercicis2;
import java.util.Scanner;

public class unmes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hh = sc.nextInt();
		int mm = sc.nextInt();
		int ss = sc.nextInt();
		
		ss = ss + 1;
		
		switch(ss) {
		case 60:
			mm = mm + 1;
			ss = 0;
			break;
			
		}
		switch(mm) {
		case 60:
			hh = hh + 1;
			mm = 0;
			break;
		}
		switch(hh) {
		case 24:
			hh = 0;
			break;
		}
		System.out.println(hh + " " + mm + " " + ss);
	}

}