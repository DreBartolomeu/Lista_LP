import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a medida em milímetros: ");
        double milimetros = input.nextDouble();

        double polegadas = milimetros / 25.4;

        System.out.println(milimetros + " mm equivalem a " + polegadas + " polegadas.");

        input.close();
    }
}