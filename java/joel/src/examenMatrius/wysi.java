package examenMatrius;

import java.util.Random;

public class wysi {
    public static void main(String[] args) {
        Random r = new Random();
        int size = 727;
        int search = 727;
        int rnd = -1;
        int attempts = 0;
        while (rnd!=search) {
            attempts++;
            rnd = r.nextInt(0, size+1);
        }
        System.out.println(rnd);
        System.out.println(attempts);
    }
}
