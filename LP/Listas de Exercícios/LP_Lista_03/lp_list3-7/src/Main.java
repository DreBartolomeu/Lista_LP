import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Não é uma equação do segundo grau.");
        } else {
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("Não existem raízes reais.");
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);

                if (delta == 0) {
                    System.out.println("Raiz única: x = " + x1);
                } else {
                    System.out.println("As raízes são:");
                    System.out.println("x1 = " + x1);
                    System.out.println("x2 = " + x2);
                }
            }
        }

        scanner.close();
    }
}
