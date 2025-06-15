//Crie um programa que contenha um vetor de inteiros de 10 posições
//(inicializar o vetor junto com sua declaração). O programa deve solicitar
//ao usuário um número inteiro(armazenar em uma variável comum inteira)
//e então realizar uma busca dentro do vetor.Caso a variável digitada exista dentro do vetor,
//exibir sua posição no vetor caso contrário exibir a mensagem “Valor não encontrado”.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] vetor = {5, 8, 12, 3, 7, 9, 10, 1, 4, 6};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para buscar no vetor: ");
        int numero = scanner.nextInt();

        int posicao = -1;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                posicao = i;
                break;
            }
        }

        if (posicao != -1) {
            System.out.println("Valor encontrado na posição: " + posicao);
        } else {
            System.out.println("Valor não encontrado");
        }

        scanner.close();
    }
}