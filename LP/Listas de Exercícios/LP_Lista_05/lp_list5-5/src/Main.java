//Crie um programa que possua um vetor de 10 posições com os seguintes
//valores inteiros armazenados:
//
//        ```java
//int [] v1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//    ```
//
//Quando executado o programa deve criar uma cópia “invertida”
//em um segundo vetor e em seguida exibir ambos os vetores


public class Main {
    public static void main(String[] args) {
        int[] v1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] v2 = new int[v1.length];

        for (int i = 0; i < v1.length; i++) {
            v2[i] = v1[v1.length - 1 - i];
        }

        System.out.print("Vetor v1: ");
        for (int num : v1) {
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.print("Vetor v2 (invertido): ");
        for (int num : v2) {
            System.out.print(num + " ");
        }
    }
}