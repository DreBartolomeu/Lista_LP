import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite aqui o valor de a:");
        double a = input.nextDouble();

        System.out.println("Digite aqui o valor de b:");
        double b = input.nextDouble();

        if (a == 0) {
            System.out.println("Não é uma equação do primeiro grau (a não pode ser igual a 0).");
        } else {
            double x = -b / a;
            System.out.println("A solução da equação é: x = " + x);
        }

        input.close();
    }
}
