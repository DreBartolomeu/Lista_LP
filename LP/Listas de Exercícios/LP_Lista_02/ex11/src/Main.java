//11. Entrar com o valor de temperatura em graus Celsius e exibir a temperatura correspondente em graus Fahrenheit.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite aqui o valor da temperatura em graus Celsius: ");
        int celsius = input.nextInt();

        double  fahrenheit = (celsius * 1.8) + 32;

        System.out.println(celsius + " ºC equivalem à " + fahrenheit + " ºF");

        input.close();

    }
}