package main.exerc02;

import java.util.Scanner;

public class Palimdromo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        String novaPalavra = "";
        String[] letras = palavra.split("");
        for (int i = letras.length-1; i >= 0; i--) {
            novaPalavra = novaPalavra + letras[i];
        }
        String resultado = novaPalavra.equals(palavra)?"TRUE":"FALSE";
        System.out.println(resultado);

    }
}
