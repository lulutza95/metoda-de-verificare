//metoda care verifica daca cifrele primite de la tastatura sunt pare sau impare

import java.util.Scanner;

public class Main{
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti un numar ");
        int a = in.nextInt();
        for (int i = 0; i <= a / 2; i++) {
            if (a % 2 == 0) {
                System.out.println("Numarul introdus de la tastatura este par");
            } else if (a % 2 == 1) {
                System.out.println("numarul introdus de la tastatura este impar");
            }
        }

    }
}

