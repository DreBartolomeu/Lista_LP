import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite aqui uma medida em polegadas: ");
        double polegadas = input.nextDouble();

        double milimetros = polegadas * 25.4;

        System.out.println(polegadas + " equivalem à: " + milimetros + " milímetros.");

        input.close();

    }
}