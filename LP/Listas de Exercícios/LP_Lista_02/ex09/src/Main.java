import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite aqui a velocidade em quilometros: ");
        int quilometros = input.nextInt();

        double milhas = quilometros * 0.621371;

        System.out.println(quilometros + " km equivalem à " + milhas + " milhas.");

        input.close();
    }
}