package rps;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Benvingut al RockPaperScissors!");
		System.out.println("(1)Jugador o (2)Jugadors?");
		int ans = sc.nextInt();
		while (ans != 1 && ans!= 2) {
			System.out.println("Resposta no valida....");
			System.out.println("(1)Jugador o (2)Jugadors?");
			ans = sc.nextInt();
		}
		System.out.println();
		System.out.println("A quants punts sera la partida?");
		int times = sc.nextInt();
		sc.nextLine();
		Player p1 = new Player();
		switch(ans) {
		case 1:
			askName(sc, p1);
			Player cpu = new Player();
			cpu.name = "CPU";
			cpu.pron = "la";
			cpu.points = 0;
			cpu.roundWin = false;
			cpu.tirada = ' ';
			while (p1.points < times && cpu.points < times) {
				play(sc, p1);
				playCPU(sc, cpu);
				match(p1, cpu);
			}
			System.out.print("El guanyador es ");
			if (p1.points == times) {
				System.out.println(p1.pron + " " + p1.name + "!");
			} else {
				System.out.println(cpu.pron + " " + cpu.name + "!");
			}
			break;
		case 2:
			Player p2 = new Player();
			System.out.println("Jugador1...");
			askName(sc, p1);
			System.out.println("Jugador2...");
			askName(sc, p2);
			while (p1.points < times && p2.points < times) {
				play(sc, p1);
				play(sc, p2);
				match(p1, p2);
			}
			System.out.print("El guanyador es ");
			if (p1.points == times) {
				System.out.println(p1.pron + " " + p1.name + "!");
			} else {
				System.out.println(p2.pron + " " + p2.name + "!");
			}
			break;
		}
		sc.close();
	}
	
	public static void askName(Scanner sc, Player p) {
		System.out.println();
		System.out.println("Digues el teu nom:");
		String nom = sc.nextLine();
		nom = nom.toUpperCase().charAt(0) + nom.substring(1);
		System.out.println("El teu nom es " + nom + "? S/N");
		char resp = sc.nextLine().toUpperCase().charAt(0);
		while (resp!='S') {
			System.out.println("Digues el teu nom:");
			nom = sc.nextLine();
			nom = nom.toUpperCase().charAt(0) + nom.substring(1);
			System.out.println("El teu nom es " + nom + "? S/N");
			resp = sc.nextLine().toUpperCase().charAt(0);
		}
		p.name = nom;
		System.out.println("Ets (H)ome o (D)ona?");
		char sex = sc.nextLine().toUpperCase().charAt(0);
		while (sex != 'H' && sex != 'D') {
			System.out.println("Resposta incorrecte...");
			System.out.println("Ets (H)ome o (D)ona?");
			sex = sc.nextLine().toUpperCase().charAt(0);
		}
		switch (sex) {
		case 'H':
			System.out.println("Estas segur? S/N");
			break;
		case 'D':
			System.out.println("Estas segura? S/N");
			break;
		default:
			break;
		}
		resp = sc.nextLine().toUpperCase().charAt(0);
		while (resp!='S') {
			System.out.println("Ets (H)ome o (D)ona?");
			sex = sc.nextLine().toUpperCase().charAt(0);
			while (sex != 'H' && sex != 'D') {
				System.out.println("Resposta incorrecte...");
				System.out.println("Ets (H)ome o (D)ona?");
				sex = sc.nextLine().toUpperCase().charAt(0);
			}
			switch (sex) {
			case 'H':
				System.out.println("Estas segur? S/N");
				break;
			case 'D':
				System.out.println("Estas segura? S/N");
				break;
			default:
				break;
			}
			resp = sc.nextLine().toUpperCase().charAt(0);
		}
		switch (sex) {
		case 'H':
			p.pron = "el";
			break;
		case 'D':
			p.pron = "la";
			break;
		default:
			break;
		}
		p.points = 0;
		p.roundWin = false;
		p.tirada = ' ';
		System.out.println("Gracies per registrarte " + p.name + "!");
		for (int i = 0; i < 25 + p.name.length(); i++) {
			System.out.print("_");
		}
		System.out.println();
		System.out.println();
		System.out.println();
	}

	public static void play(Scanner sc, Player p) {
		System.out.println(p.name + ", es el teu torn!");
		System.out.println("Tria: (R)ock, (P)aper, o (S)cissors:");
		char resp = sc.nextLine().toUpperCase().charAt(0);
		while (resp!='R' && resp!='P' && resp!='S') {
			System.out.println("Opcio no valida :(");
			System.out.println("Tria: (R)ock, (P)aper, o (S)cissors:");
			resp = sc.nextLine().toUpperCase().charAt(0);
		}
		p.tirada = resp;
		for (int i = 0; i < 20; i++) {
			System.out.print("_");
		}
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
	public static void playCPU(Scanner sc, Player p) {
		System.out.println(p.name + ", es el teu torn!");
		System.out.println("Tria: (R)ock, (P)aper, o (S)cissors:");
		Random r = new Random();
		int choose = r.nextInt(1, 4);
		switch (choose) {
		case 1:
			p.tirada = 'R';
			break;
		case 2:
			p.tirada = 'P';
			break;
		case 3:
			p.tirada = 'S';
			break;
		default:
			break;
		}
		System.out.println(p.tirada);
		for (int i = 0; i < 20; i++) {
			System.out.print("_");
		}
		System.out.println();
		System.out.println();
		System.out.println();
	}

	public static void match(Player p1, Player p2) {
		if (p1.tirada != p2.tirada) {
			if (p1.tirada == 'R') {
				if (p2.tirada == 'P') {
					p2.roundWin = true;
				} else {
					p1.roundWin = true;
				}
			} else if (p1.tirada == 'P') {
				if (p2.tirada == 'S') {
					p2.roundWin = true;
				} else {
					p1.roundWin = true;
				}
			} else {
				if (p2.tirada == 'R') {
					p2.roundWin = true;
				} else {
					p1.roundWin = true;
				}
			}
		}
		if (p1.roundWin) {
			System.out.println("Punt per " + p1.pron + " " + p1.name + "!");
			p1.points++;
		} else if (p2.roundWin) {
			System.out.println("Punt per " + p2.pron + " " + p2.name + "!");
			p2.points++;
		} else {
			System.out.println("Empat!");
		}
		p1.roundWin = false;
		p2.roundWin = false;
		System.out.println(p1.pron.toUpperCase().charAt(0) + p1.pron.substring(1) + " " + p1.name + " te " + p1.points + " punts");
		System.out.println(p2.pron.toUpperCase().charAt(0) + p2.pron.substring(1) + " " + p2.name + " te " + p2.points + " punts");
		for (int i = 0; i < 20; i++) {
			System.out.print("_");
		}
		for (int i = 0; i < 6; i++) {
			System.out.println();
		}
	}
}