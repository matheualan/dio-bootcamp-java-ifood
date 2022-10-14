package main.exerc01;

import java.util.Scanner;

public class NumerosIguais {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("Informe o segundo número: ");
        int num2 = Integer.parseInt(sc.nextLine());

        if (num1 == num2) {
            System.out.println("Sao iguais!");
        } else {
            System.out.println("Nao sao iguais!");
        }

        sc.close();

    }
}
