//Faça um programa que apresente na tela a tabela de conversão
//de Graus Celsius para Fahrenheit, de -80ºC até 80ºC com um incremento de 10ºC.
//
//    - $F = 9/5*C+32$

public class Main {
    public static void main(String[] args) {
        System.out.println("Celsius\tFahrenheit");

        for (int c = -80; c <= 80; c += 10) {
            double f = (9.0 / 5) * c + 32;
            System.out.printf("%d\t%.1f\n", c, f);
        }
    }
}
