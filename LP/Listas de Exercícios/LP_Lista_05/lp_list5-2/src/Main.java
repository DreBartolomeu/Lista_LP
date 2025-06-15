//Declare e inicialize um vetor de 10 posições, em seguida
//percorra este vetor alterando seus valores conforme a seguinte regra:
//some 2 a todos os valores situados em posições com índice par e para as
//posições de índice ímpar multiplique seu valores por 2.

public class Main {
    public static void main(String[] args) {
        int[] vetor = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Vetor original:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        // Aplica a regra nos valores
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) { // índice par
                vetor[i] += 2;
            } else { // índice ímpar
                vetor[i] *= 2;
            }
        }

        System.out.println("\nVetor alterado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
