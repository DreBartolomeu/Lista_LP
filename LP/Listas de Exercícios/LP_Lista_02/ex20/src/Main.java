import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor da primeira raiz (x1): ");
        double x1 = input.nextDouble();

        System.out.println("Digite o valor da segunda raiz (x2): ");
        double x2 = input.nextDouble();

        double soma = x1 + x2;
        double produto = x1 * x2;

        System.out.println("A equação do segundo grau é de:");
        System.out.println("x^2 - " + soma + "x + " + produto + " = 0");

        input.close();
    }
}
