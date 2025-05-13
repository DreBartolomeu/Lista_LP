import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número real: ");
        double num = input.nextDouble();

        double quintaParte = num / 5;

        System.out.println("Aquinta parte de " + num + " é " + quintaParte + ".");

        input.close();
    }
}