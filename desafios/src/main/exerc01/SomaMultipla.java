package main.exerc01;

import java.util.Scanner;

public class SomaMultipla {
    public static void main(String[] args) {
        int valorEntrada, valorLimite;
        Scanner sc = new Scanner(System.in);
        valorEntrada = Integer.parseInt(sc.nextLine());
        valorLimite = Integer.parseInt(sc.nextLine());
        int resultado = 0;
        for (int i = 0; i <= valorLimite; i += valorEntrada) {
            resultado += i;
        }
        System.out.println(resultado);
        sc.close();
    }
}
