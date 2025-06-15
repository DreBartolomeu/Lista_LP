import java.util.Scanner;

public class Main {

    public static int potencia(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * potencia(x, y - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base (x): ");
        int x = scanner.nextInt();

        System.out.print("Digite o expoente (y >= 0): ");
        int y = scanner.nextInt();

        if (y < 0) {
            System.out.println("Erro: o expoente deve ser maior ou igual a 0.");
        } else {
            int resultado = potencia(x, y);
            System.out.println(x + " elevado a " + y + " é: " + resultado);
        }

        scanner.close();
    }
}