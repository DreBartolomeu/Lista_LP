import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor da base do triângulo: ");
        double base = input.nextDouble();

        System.out.println("Digite o valor da altura do triângulo: ");
        double altura = input.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("A área do triângulo é de: " + area);

        input.close();
    }
}