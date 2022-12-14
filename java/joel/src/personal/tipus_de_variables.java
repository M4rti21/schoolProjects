package personal;

public class tipus_de_variables {
    public static void main(String[] args) {

        // Numerics
        int num_enter = 69; // numero enter
        float num_float = 69.1234567f; // numero amb decimals (maxim 7)
        double dum_doble = 69.1234567890123456d; // numero amb decimals doble (maxim 16)

        // Text
        char lletra = 'a'; // nomes un caracter IMPORTANT AMB ' '
        String frase = "When You See It"; // cadena de caracters IMPORTANT AMB " "

        int num1 = 3;
        int num2 = 6;
        String fakeNum = "6";

        System.out.println(num1 + num2); // podem sumar 2 numeros
        System.out.println(num1 + fakeNum); // el segon numero en realitat es text aixi que...
                                            // ...nomes els ajunta
    }

    public static void printMatrix(int[][] mat) {

    }

    public static void fillMatrix(int[][] mat) {

    }

}
