import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do raio do cilindro:");
        double raio = input.nextDouble();

        System.out.println("Digite o valor da altura do cilindro:");
        double altura = input.nextDouble();
        double volume = Math.PI * Math.pow(raio, 2) * altura;

        System.out.println("O volume do cilindro é: " + volume);

        input.close();
    }
}