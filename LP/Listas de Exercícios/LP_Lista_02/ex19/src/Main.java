import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de a:");
        double a = input.nextDouble();

        System.out.println("Digite o valor de b:");
        double b = input.nextDouble();

        System.out.println("Digite o valor de c:");
        double c = input.nextDouble();

        if (a == 0) {
            System.out.println("Não é uma equação do segundo grau (a não pode ser igual a 0).");
        } else {
            double delta = (b * b) - (4 * a * c);

            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Duas raízes reais: x1 = " + x1 + ", x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Uma raiz real: x = " + x);
            } else {
                System.out.println("Não existem raízes reais.");
            }
        }

        input.close();
    }
}
