//Elaborar uma minicalculadora, o programa recebe 2 números e exibe um menu para que o usuário escolha a operação e em seguida exibe o resultado. Exemplo:
//
//        ```plaintext
//Digite o primeiro numero: 2
//Digite o segundo numero: 3
//        ------------------------------
//Menu:
//        1. Soma
//        2. Subtracao
//        3. Multiplicacao
//        4. Divisao
//    ------------------------------
//Escolha uma opcao: 3
//        ------------------------------
//Resultado: 2.0 x 3.0 = 6.0
//        ```


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double num2 = scanner.nextDouble();

        System.out.println("------------------------------");
        System.out.println("Menu:");
        System.out.println("    1. Soma");
        System.out.println("    2. Subtracao");
        System.out.println("    3. Multiplicacao");
        System.out.println("    4. Divisao");
        System.out.println("------------------------------");

        System.out.print("Escolha uma opcao: ");
        int opcao = scanner.nextInt();

        System.out.println("------------------------------");
        double resultado;

        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                System.out.printf("Resultado: %.1f + %.1f = %.1f\n", num1, num2, resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.printf("Resultado: %.1f - %.1f = %.1f\n", num1, num2, resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.printf("Resultado: %.1f x %.1f = %.1f\n", num1, num2, resultado);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Erro: Divisao por zero nao e permitida.");
                } else {
                    resultado = num1 / num2;
                    System.out.printf("Resultado: %.1f / %.1f = %.1f\n", num1, num2, resultado);
                }
                break;
            default:
                System.out.println("Opcao invalida!");
        }

        scanner.close();
    }
}
