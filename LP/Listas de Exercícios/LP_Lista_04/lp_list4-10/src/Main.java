//10. Escreva um programa que gere a sequência de Fibonacci até o
// enésimo termo, onde $n$ é um número fornecido pelo usuário.
// >Na matemática, a sucessão de Fibonacci, é uma sequência
// de números inteiros, começando normalmente por 0 e 1, na qual cada termo subsequente corresponde à soma dos dois anteriores.
// > - Exemplo:
// ``0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 897, 1597...```


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de termos da sequência de Fibonacci: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, digite um número positivo maior que zero.");
        } else {
            long a = 0;
            long b = 1;

            System.out.print("Sequência de Fibonacci: ");

            for (int i = 1; i <= n; i++) {
                System.out.print(a);
                if (i != n) {
                    System.out.print(", ");
                }

                long proximo = a + b;
                a = b;
                b = proximo;
            }

            System.out.println();
        }

        scanner.close();
    }
}