package personal;

import java.util.Random;
import java.util.Scanner;

public class mastermind {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digues el numero d'intents:");
        int intents = sc.nextInt();
        int[] rnd = new int[4];
        String[] how = new String[4];
        int[] usr = new int[4];
        Random rn = new Random();
        boolean done = true;
        for (int i = 0; i < rnd.length; i++) {
            rnd[i] = rn.nextInt(0, 10);
        }
        //for (int i = 0; i < rnd.length; i++) {
        //    System.out.print(rnd[i] + " ");
        //}
        //System.out.println();
        for (int i = 0; i < intents; i++) {
            done = true;
            for (int j = 0; j < rnd.length; j++) {
                usr[j] = sc.nextInt();
                if (usr[j] == rnd[j]) {
                    how[j] = "Esta en la posicio correcta";
                } else if (usr[j] == rnd[0] || usr[j] == rnd[1] || usr[j] == rnd[2] || usr[j] == rnd[3]) {
                    how[j] = "No esta en la seva posicio";
                    done = false;
                } else {
                    how[j] = "No es correcte";
                    done = false;
                }
            }
            if (done) {
                System.out.println("HAS GUANYAT!!!");
                i = intents;
            } else {
                for (int j = 0; j < rnd.length; j++) {
                    System.out.println(usr[j]+" "+how[j]);
                }
                System.out.println("et queden " + (intents-i-1) + " intents");
            }
            
        }
        if (! done) {
            System.out.println("HAS PERDUT :(");
        }
        sc.close();
    }
}