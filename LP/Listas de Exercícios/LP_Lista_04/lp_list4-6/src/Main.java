import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        int inicio = Math.min(num1, num2);
        int fim = Math.max(num1, num2);

        System.out.println("Números naturais entre " + inicio + " e " + fim + ":");

        boolean encontrou = false;
        for (int i = inicio + 1; i < fim; i++) {
            if (i > 0) {
                System.out.println(i);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Não existem números naturais entre os números digitados.");
        }

        scanner.close();
    }
}
