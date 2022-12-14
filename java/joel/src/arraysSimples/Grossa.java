package arraysSimples;

import java.util.ArrayList;
import java.util.Scanner;

public class Grossa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		int money;
		int people = 0;
		int a = -1;
		for (int i = 0; i < times; i++) {
		    ArrayList<Integer> arrl = new ArrayList<Integer>();
			money = sc.nextInt();
			a = sc.nextInt();
			while (a != 0) {
			    arrl.add(a);
			    a = sc.nextInt();
			}
			arrl.sort(null);
			for (int j = 0; j < arrl.size(); j++) {
			    if (money - arrl.get(j) >= 0) {
			        money -= arrl.get(j);
			        people++;
			    }
			}
			System.out.println(people);
			people = 0;
		}
		sc.close();
	}
}
