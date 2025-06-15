//Criar um programa que receba 5 números inteiros digitados pelo usuário e ao final exiba o maior e
//o menor números digitados
// (Obs.: Apenas o maior e o menor número devem ser armazenados).

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = Integer.MIN_VALUE; // menor valor possível para iniciar
        int menor = Integer.MAX_VALUE; // maior valor possível para iniciar

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o número " + i + ": ");
            int num = scanner.nextInt();

            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
        }

        System.out.println("Maior número digitado: " + maior);
        System.out.println("Menor número digitado: " + menor);

        scanner.close();
    }
}
