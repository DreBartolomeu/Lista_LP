//Crie um sistema de vendas onde o usuário insere o valor da compra e escolhe a formade pagamento que pode ser: débito, crédito ou pix. Após escolher a forma de pagamentoo sistema deve mostrar o total a pagar que deve seguir as seguintes regras:
//
//        - **Débito:** Conceder desconto de 5%.
//        - **Pix:** Conceder desconto de 10%.
//        - **Crédito:** taxa de 2% do valor total em parcelamento até 4 vezes ou taxa de 5% do valor total em parcelamentos superiores a 4 vezes (limite 10x).
//
//Exemplo:
//
//        ```plaintext
//Insira o valor da compra: 1000,00
//        ----------------------------------
//Menu:
//        1. Débito
//        2. Pix
//        3. Crédito
//    ----------------------------------
//Escolha a forma de pagamento: 3
//        ----------------------------------
//Crédito Selecionado
//    ----------------------------------
//Escolha o número de parcelas: 6
//Valor final da compra: R$ 1050,00
//        ```


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        System.out.println("----------------------------------");
        System.out.println("Menu:");
        System.out.println("    1. Débito");
        System.out.println("    2. Pix");
        System.out.println("    3. Crédito");
        System.out.println("----------------------------------");

        System.out.print("Escolha a forma de pagamento: ");
        int formaPagamento = scanner.nextInt();

        double valorFinal = valorCompra;

        System.out.println("----------------------------------");

        switch (formaPagamento) {
            case 1: // Débito - desconto 5%
                System.out.println("Débito Selecionado");
                valorFinal = valorCompra * 0.95;
                break;

            case 2: // Pix - desconto 10%
                System.out.println("Pix Selecionado");
                valorFinal = valorCompra * 0.90;
                break;

            case 3: // Crédito
                System.out.println("Crédito Selecionado");
                System.out.println("----------------------------------");
                System.out.print("Escolha o número de parcelas: ");
                int parcelas = scanner.nextInt();

                if (parcelas < 1 || parcelas > 10) {
                    System.out.println("Número de parcelas inválido! Deve ser entre 1 e 10.");
                    scanner.close();
                    return;
                }

                if (parcelas <= 4) {
                    valorFinal = valorCompra * 1.02; // taxa 2%
                } else {
                    valorFinal = valorCompra * 1.05; // taxa 5%
                }
                break;

            default:
                System.out.println("Forma de pagamento inválida!");
                scanner.close();
                return;
        }

        System.out.printf("Valor final da compra: R$ %.2f\n", valorFinal);

        scanner.close();
    }
}
