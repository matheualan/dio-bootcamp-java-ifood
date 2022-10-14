package main.exerc01;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numEntrada = Integer.parseInt(sc.nextLine());

        if (numEntrada % 3 == 0 && numEntrada % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (numEntrada % 3 == 0) {
            System.out.println("Fizz");
        } else if (numEntrada % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(numEntrada);
        }

        sc.close();
    }
}
