//Jogo da tabuada: o aplicativo irá exibir as tabuadas do 1 ao 10 uma operação por vez.
//Entre uma operação e outra o usuário deve inserir o resultado da conta, se o resultado
//digitado estiver correto o programa exibe a próxima operação caso contrário o jogo é encerrado
//mostrando a mensagem de que o jogador perdeu (deve exibir a opção jogarnovamente). Caso o jogador
//complete toda a tabuada sem erros o programa deve exibir uma mensagem parabenizando o jogador
//        (e perguntar se deseja jogar novamente).

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jogarNovamente = true;

        while (jogarNovamente) {
            boolean perdeu = false;

            for (int num = 1; num <= 10 && !perdeu; num++) {
                for (int i = 1; i <= 10 && !perdeu; i++) {
                    System.out.printf("Quanto é %d x %d? ", num, i);
                    int resposta = scanner.nextInt();

                    int resultado = num * i;
                    if (resposta != resultado) {
                        System.out.println("Resposta errada! Você perdeu!");
                        perdeu = true;
                    }
                }
            }

            if (!perdeu) {
                System.out.println("Parabéns! Você completou todas as tabuadas sem erros!");
            }

            System.out.print("Deseja jogar novamente? (1 - Sim / 2 - Não): ");
            int opcao = scanner.nextInt();

            jogarNovamente = (opcao == 1);
            System.out.println();
        }

        System.out.println("Obrigado por jogar!");
        scanner.close();
    }
}