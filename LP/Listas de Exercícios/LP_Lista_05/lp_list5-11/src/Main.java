//Aperfeiçoe o exercício anterior solicitando para que o usuário
//informe o tamanho das matrizes a serem multiplicadas.
//
//Valide se é possível calcular a matriz produto.
//
//        > A multiplicação de matrizes só é possível quando o número
//de colunas da primeira matrizé igual ao número de linhas da segunda matriz.
//
//Se a multiplicação existir, a matriz produto terá a quantidade de linhas da primeira
//matriz e a quantidade de colunas da segundamatriz.
//
//Após a validação peça para o usuário inserir os valores de cada matriz e então gere
//amatriz produto

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tamanho da primeira matriz
        System.out.print("Digite o número de linhas da matriz A: ");
        int linhasA = scanner.nextInt();
        System.out.print("Digite o número de colunas da matriz A: ");
        int colunasA = scanner.nextInt();

        // Tamanho da segunda matriz
        System.out.print("Digite o número de linhas da matriz B: ");
        int linhasB = scanner.nextInt();
        System.out.print("Digite o número de colunas da matriz B: ");
        int colunasB = scanner.nextInt();

        // Validação da multiplicação
        if (colunasA != linhasB) {
            System.out.println("\nNão é possível multiplicar as matrizes!");
            System.out.println("As colunas da matriz A devem ser iguais às linhas da matriz B.");
            return;
        }

        // Declarando as matrizes
        int[][] A = new int[linhasA][colunasA];
        int[][] B = new int[linhasB][colunasB];
        int[][] produto = new int[linhasA][colunasB];

        // Preenchendo a matriz A
        System.out.println("\nDigite os elementos da matriz A:");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasA; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = scanner.nextInt();
            }
        }

        // Preenchendo a matriz B
        System.out.println("\nDigite os elementos da matriz B:");
        for (int i = 0; i < linhasB; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                B[i][j] = scanner.nextInt();
            }
        }

        // Calculando a matriz produto
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                for (int k = 0; k < colunasA; k++) {
                    produto[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Exibindo a matriz produto
        System.out.println("\nMatriz Produto:");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.print(produto[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}