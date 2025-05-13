import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor do raio do círculo: ");
        double raio = input.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("A área do círculo é de: " + area);

        input.close();
    }
}