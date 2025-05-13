import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do raio do cone: ");
        double raio = input.nextDouble();

        System.out.println("Digite o valor da altura do cone: ");
        double altura = input.nextDouble();

        double volume = (1.0/3) * Math.PI * Math.pow(raio, 2) * altura;
        System.out.println("O volume do cone é de: " + volume);

        input.close();
    }
}