package main.exerc02;

import java.util.Scanner;

public class ValidacaoParenteses {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean resultado = validator(sc.nextLine());
        System.out.println(resultado);
    }

    public static boolean validator(String s) {
        String[] letras = s.split("");
        String[] tags = {"(",")","{","}","[","]"};
        boolean b = false;
        for(int i = 0; i < tags.length; i++) {
            if (letras[0].equals(tags[i]) && letras[letras.length-1].equals(tags[i + 1])) {
                b = true ;
            }
        }
        return b;
    }

}
