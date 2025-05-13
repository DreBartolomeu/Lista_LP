import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite aqui o valor em milhas: ");
        double milhas = input.nextDouble();

        double quilometros = milhas / 0.621371;

        System.out.println(milhas + " equivalem à " + quilometros + " km.");

        input.close();

    }
}