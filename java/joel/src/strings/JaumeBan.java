package strings;

import java.util.Scanner;

public class JaumeBan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        sc.nextLine();
        String chat;
        for (int i = 0; i < times; i++) {
            chat = sc.nextLine();
            if (chat.toLowerCase().contains("uwu") || 
                chat.toLowerCase().contains("owo") || 
                chat.toLowerCase().contains("sacapuntas") || 
                chat.toLowerCase().contains("adolfito") || 
                chat.toLowerCase().contains("35")) {
                System.out.println("Jaime ha recibido un Ban");
            } else {
                System.out.println("No Ban a Jaime");
            }
        }
        sc.close();
    }
}