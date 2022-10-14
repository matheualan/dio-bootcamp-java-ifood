package main.exerc01;

import java.util.Scanner;

public class ChamadaRecursiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());
        System.out.println(somatorio(num));
        sc.close();
    }

    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}
