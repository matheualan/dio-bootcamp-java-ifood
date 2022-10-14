package main.exerc01;

import java.util.Scanner;

public class BuscaSequencial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};

        int findNumber = Integer.parseInt(sc.nextLine());

        int count = 0;
        int naoEncontrado = 0;
        for (int numero : numeros) {
            if (numero == findNumber) {
                System.out.println("Achei " + findNumber + " na posicao " + count);
                naoEncontrado = 1;
            }
            count++;
        }

        if (naoEncontrado == 0) {
            System.out.println("Numero " + findNumber + " nao encontrado!");
        }

        sc.close();
    }
}
