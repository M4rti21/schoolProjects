package personal;

import java.util.Scanner;

public class forsPablo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int petit = Integer.MIN_VALUE;
        int gran = Integer.MAX_VALUE;
        
        int num = sc.nextInt();
            
        while(num != 0) {
            if (num < petit) {
                petit = num;
            }
            if (num > gran) {
                gran = num;
            }
            num = sc.nextInt();
        }
        
        System.out.println(gran + " " + petit); 
        
        
        
        
        
        
        sc.close();
    }
}