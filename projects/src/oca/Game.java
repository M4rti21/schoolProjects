package oca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

public class Game {

	static Scanner sc = new Scanner(System.in);
	static String[] taulell = new String[63];
	static Player j1 = new Player();
	static Player j2 = new Player();
	static Map<Integer, String> specials = new TreeMap<Integer, String>();

	static final char spacer = '/';
	static final String oca = "OCA";
	static final String dau = "DAU";
	static final String laberint = "LAB";
	static final String kill = "DIE";
	static final String fin = "FINAL";

	public static void main(String[] args) {
		ArrayList<Integer> oques = new ArrayList<Integer>(
				Arrays.asList(5, 9, 14, 18, 23, 27, 32, 36, 41, 45, 50, 54, 59, 63));
		ArrayList<Integer> daus = new ArrayList<Integer>(Arrays.asList(26, 53));
		int lab = 42;
		int mort = 58;
		for (int i = 0; i < taulell.length - 1; i++) {
			if (oques.contains(i + 1)) {
				specials.put(i, oca);
			} else if (daus.contains(i + 1)) {
				specials.put(i, dau);
			} else if (lab == i + 1) {
				specials.put(i, laberint);
			} else if (mort == i + 1) {
				specials.put(i, kill);
			} else if (i == taulell.length -2) {
				specials.put(i+1, fin);
			} else {
				specials.put(i, (i + 1) + "");
			}
		}
		boolean playing = true;
		boolean readyToPlay = false;
		while (playing) {
			switch (showMenu()) {
			case 1:
				readyToPlay = start();
				break;
			case 2:
				if (readyToPlay) {
					showTable();
				} else {
					System.out.println("El taulell no ha sigut creat encara");
				}
				break;
			case 3:
				if (readyToPlay) {
					play();
				} else {
					System.out.println("El taulell no ha sigut creat encara");
				}
				break;
			case 0:
				System.out.println("Sortint...");
				playing = false;
				break;
			default:
				break;
			}
		}
	}

	public static int showMenu() {
		System.out.println("1-Inicialitzar nou joc");
		System.out.println("2-Visualitzar tauler");
		System.out.println("3-Jugar");
		System.out.println("0-Sortir");
		int resposta = sc.nextInt();
		while (resposta < 0 || resposta > 3) {
			System.out.println("Resposta incorrecte");
			resposta = sc.nextInt();
		}
		sc.nextLine();
		return resposta;
	}

	public static boolean start() {
		ArrayList<String> playerNames = new ArrayList<String>();
		System.out.println("j1...");
		createPlayer(j1, playerNames);
		System.out.println("j2...");
		createPlayer(j2, playerNames);
		createTable();
		return true;
	}

	public static void createTable() {
		for (int i = 0; i < taulell.length; i++) {
			taulell[i] = (i + 1) + "";
		}
		for (Map.Entry<Integer, String> entry : specials.entrySet()) {
			taulell[entry.getKey()] = entry.getValue();
		}
		movePlayer(j1);
		movePlayer(j2);
	}

	public static void createPlayer(Player j0, ArrayList<String> playerNames) {
		System.out.println("Digues el teu nom: (3 lletres OBLIGATORI)");
		j0.name = sc.nextLine();
		while (j0.name.length() != 3 || j0.name.equals(oca) || playerNames.contains(j0.name)) {
			System.out.println("Nom no valid...");
			j0.name = sc.nextLine();
		}
		playerNames.add(j0.name);
		j0.currentCell = 0;
		j0.nextCell = 0;
	}

	public static void showTable() {
		int line = 0;
		for (String cela : taulell) {
			if (line % 6 == 0) {
				System.out.println();
				System.out.println();
			}
			System.out.print(cela);
			for (int i = 0; i < 13 - (cela + "").length(); i++) {
				System.out.print(" ");
			}
			line++;
		}
		System.out.println();
		System.out.println();
	}

	public static void play() {
		System.out.println(j1.name + " tira un:");
		j1.nextCell = j1.currentCell + throwDice();
		if (movePlayer(j1)) {
			System.out.println(j2.name + " tira un:");
			j2.nextCell = j2.currentCell + throwDice();
			movePlayer(j2);
		}
	}

	public static boolean movePlayer(Player j0) {
		boolean found;
		boolean found2;
		if (j0.nextCell > taulell.length - 2) {
			System.out.println(j0.name + " ha guanyat!");
			showTable();
			j1.currentCell = 1;
			j1.nextCell = 1;
			j2.currentCell = 1;
			j2.nextCell = 1;
			createTable();
			return false;
		} else {
			switch (specials.get(j0.nextCell)) {
			case oca:
				found = false;
				found2 = true;
				for (Map.Entry<Integer, String> entry : specials.entrySet()) {
					if (found && found2 && entry.getValue().equals(oca)) {
						j0.nextCell = entry.getKey();
						found2 = false;
					} else if (entry.getKey() == j0.nextCell + 1) {
						found = true;
					}
				}
				break;
			case dau:
				found = false;
				for (Map.Entry<Integer, String> entry : specials.entrySet()) {
					if (entry.getKey() != (j0.nextCell + 1) && entry.getValue().equals(dau)) {
						System.out.println(j0.nextCell);
						j0.nextCell = entry.getKey();
						System.out.println(j0.nextCell);
					}
				}
				break;
			case laberint:
				j0.nextCell = 30 + 1;
				break;
			case kill:
				j0.nextCell = 0;
				break;
			default:
				break;
			}
			taulell[j0.currentCell] = taulell[j0.currentCell].replace(spacer + j0.name, "");
			taulell[j0.nextCell] += spacer + j0.name;
			j0.currentCell = j0.nextCell;
			return true;
		}
	}

	public static int throwDice() {
//		Random r = new Random();
//		int dice = r.nextInt(1, 7);
//		System.out.println(dice);
		int dice = sc.nextInt();
		return dice;
	}
}