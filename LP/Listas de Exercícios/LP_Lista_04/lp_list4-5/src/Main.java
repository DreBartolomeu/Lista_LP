//Calcule o fatorial de um número determinado pelo usuário usando for.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro não negativo: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Número inválido! Fatorial não definido para negativos.");
        } else {
            long fatorial = 1;
            for (int i = 2; i <= num; i++) {
                fatorial *= i;
            }
            System.out.println("Fatorial de " + num + " = " + fatorial);
        }

        scanner.close();
    }
}
