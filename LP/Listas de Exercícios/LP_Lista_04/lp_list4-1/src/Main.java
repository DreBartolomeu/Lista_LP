//Criar um programa que receba um
//valor do usuário e exiba a sua tabuada multiplicando o número
//digitado pela sequência de 0 a 10.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        System.out.println("Tabuada de " + num + ":");

        for (int i = 0; i <= 10; i++) {
            int resultado = num * i;
            System.out.printf("%d x %d = %d\n", num, i, resultado);
        }

        scanner.close();
    }
}
