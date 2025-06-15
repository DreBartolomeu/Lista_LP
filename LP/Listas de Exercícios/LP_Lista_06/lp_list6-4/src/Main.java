//Escreva uma função em Java para verificar se uma *String*
//é um palíndromo. A *String* deve ser digitada pelo usuário.
//Um palíndromo é uma palavra, frase ou sequência que se lê da mesma
//forma de trás para frente.
//
//        Exemplos: “ovo”, “tenet”, “abasedotetodesaba”.

import java.util.Scanner;

public class Main {

    public static boolean ehPalindromo(String s, int inicio, int fim) {
        if (inicio >= fim) {
            return true;
        }
        if (s.charAt(inicio) != s.charAt(fim)) {
            return false;
        }
        return ehPalindromo(s, inicio + 1, fim - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase sem espaços: ");
        String entrada = scanner.nextLine().toLowerCase();

        entrada = entrada.replaceAll("[^a-zA-Z0-9]", "");

        boolean resultado = ehPalindromo(entrada, 0, entrada.length() - 1);

        if (resultado) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }

        scanner.close();
    }
}