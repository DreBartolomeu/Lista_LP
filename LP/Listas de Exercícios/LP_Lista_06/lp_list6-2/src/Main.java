import java.util.Scanner;

public class Main {

    public static long fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // caso base
        } else {
            return n * fatorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Erro: o número deve ser maior ou igual a 0.");
        } else {
            long resultado = fatorial(n);
            System.out.println("Fatorial de " + n + " é: " + resultado);
        }

        scanner.close();
    }
}