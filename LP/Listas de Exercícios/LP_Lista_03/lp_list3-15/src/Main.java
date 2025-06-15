//Elabore um programa que simule o funcionamento de uma máquina de café, o usuário entra com o valor em reais, a máquina então apresenta um menu com as opções disponíveis e seus respectivos preços. Ao selecionar uma das opções a máquina informa a bebida selecionada e o troco calculado.
//
//        Exemplo:
//
//        ```plaintext
//Insira o dinheiro: 5,00
//        ------------------------------
//Menu:
//        1. Café Expresso R$ 0,50
//        2. Café Longo R$ 1,00
//        3. Capuccino R$ 2,50
//        4. Chocolate R$ 2,00
//        ------------------------------
//Escolha uma opção: 3
//        ------------------------------
//Bebida selecionada: Capuccino
//Seu Troco: R$ 2,50
//        ```


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o dinheiro: R$ ");
        double dinheiro = scanner.nextDouble();

        System.out.println("------------------------------");
        System.out.println("Menu:");
        System.out.println("    1. Café Expresso R$ 0,50");
        System.out.println("    2. Café Longo R$ 1,00");
        System.out.println("    3. Capuccino R$ 2,50");
        System.out.println("    4. Chocolate R$ 2,00");
        System.out.println("------------------------------");

        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        String bebida = "";
        double preco = 0;

        switch (opcao) {
            case 1:
                bebida = "Café Expresso";
                preco = 0.50;
                break;
            case 2:
                bebida = "Café Longo";
                preco = 1.00;
                break;
            case 3:
                bebida = "Capuccino";
                preco = 2.50;
                break;
            case 4:
                bebida = "Chocolate";
                preco = 2.00;
                break;
            default:
                System.out.println("Opção inválida!");
                scanner.close();
                return;
        }

        System.out.println("------------------------------");

        if (dinheiro < preco) {
            System.out.println("Dinheiro insuficiente para comprar " + bebida + ".");
        } else {
            double troco = dinheiro - preco;
            System.out.println("Bebida selecionada: " + bebida);
            System.out.printf("Seu Troco: R$ %.2f\n", troco);
        }

        scanner.close();
    }
}