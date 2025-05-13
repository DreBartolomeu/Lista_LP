//12. Ler duas notas N1 e N2 e exibir a média.
//
//      >Obs.: N1 tem peso 1 e N2 tem peso 2 e resultado deve estar entre 0 e 10.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite aqui a primeira nota: ");
        int n1 = input.nextInt();

        System.out.println("Digite aqui a segunda nota: ");
        int n2 = input.nextInt();

        double media = (n1 + (2 * n2)) / 3.0;

        System.out.println("o valor da média das notas é de: " + media + ".");

        input.close();
    }
}