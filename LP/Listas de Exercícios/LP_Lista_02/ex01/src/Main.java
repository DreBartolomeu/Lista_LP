import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = input.nextInt();

        int dobro = numero * 2;

        System.out.println("O dobro de " + numero + " é " + dobro + ".");

        input.close();
    }
}