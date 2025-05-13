import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a velocidade em m/s: ");
        double ms = input.nextDouble();

        double kmh = ms * 3.6;

        System.out.println(ms + "M/s equivalem a " + kmh + " km/h.");
        input.close();
    }
}