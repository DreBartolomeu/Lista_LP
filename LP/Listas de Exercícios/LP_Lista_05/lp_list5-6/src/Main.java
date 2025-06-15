public class Main {
    public static void main(String[] args) {
        int[] vetor = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.print("Vetor original: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }

        int aux;
        int meio = vetor.length / 2;
        for (int i = 0; i < meio; i++) {
            aux = vetor[i];
            vetor[i] = vetor[vetor.length - 1 - i];
            vetor[vetor.length - 1 - i] = aux;
        }

        System.out.print("\nVetor invertido: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}