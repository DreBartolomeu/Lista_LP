import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2 = scanner.nextDouble();

        double media = (n1 + n2) / 2;

        System.out.println("Média: " + media);

        if (media < 50) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Aprovado");
        }

        scanner.close();
    }
}
