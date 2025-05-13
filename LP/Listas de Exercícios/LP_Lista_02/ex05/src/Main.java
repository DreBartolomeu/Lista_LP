import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a velocidade em km/h: ");
        double kmh = input.nextDouble();

        double ms = kmh / 3.6;

        System.out.println(kmh + "Km/h equivalem a " + ms + " m/s.");
        input.close();
    }
}