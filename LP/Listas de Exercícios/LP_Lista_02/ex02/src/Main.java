import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int num = input.nextInt();

        int quadrado = num * num;

        System.out.println("O quadrado de " + num + " é " + quadrado + ".");
        input.close();
    }
}
