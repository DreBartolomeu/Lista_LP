//eclare e inicialize uma matriz 3x3 e calcule a sua determinante.

public class Main {
    public static void main(String[] args) {
        // Matriz 3x3
        int[][] matriz = {
                {2, 4, 3},
                {1, 5, 7},
                {6, 8, 9}
        };

        // Atribuindo variáveis para facilitar o cálculo com regra de Sarrus
        int a = matriz[0][0];
        int b = matriz[0][1];
        int c = matriz[0][2];
        int d = matriz[1][0];
        int e = matriz[1][1];
        int f = matriz[1][2];
        int g = matriz[2][0];
        int h = matriz[2][1];
        int i = matriz[2][2];

        // Regra de Sarrus
        int determinante = a * e * i + b * f * g + c * d * h
                - c * e * g - b * d * i - a * f * h;

        System.out.println("Determinante da matriz 3x3: " + determinante);
    }
}