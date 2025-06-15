//Declare e inicialize duas matrizes uma 3x2 e outra 2x2, em
//seguida gere a matriz produto entre as duas matrizes.
//Exemplo de como calcular a matriz produto:
//
//$
//    \begin{bmatrix}
//a_{11} & a_{12} \\
//a_{21} & a_{22} \\
//a_{31} & a_{32} \\
//        \end{bmatrix}.
//        \begin{bmatrix}
//b_{11} & b_{12} \\
//b_{21} & b_{22} \\
//        \end{bmatrix}=
//        \begin{bmatrix}
//a_{11}.b_{11}+a_{12}.b_{21} & a_{11}.b_{12}+a_{12}.b_{22} \\
//a_{21}.b_{11}+a_{22}.b_{21} & a_{21}.b_{12}+a_{22}.b_{22} \\
//a_{31}.b_{11}+a_{32}.b_{21} & a_{31}.b_{12}+a_{32}.b_{22} \\
//        \end{bmatrix}
//$


public class Main {
    public static void main(String[] args) {
        // Matriz A (3x2)
        int[][] A = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        // Matriz B (2x2)
        int[][] B = {
                {7, 8},
                {9, 10}
        };

        // Matriz C (resultado 3x2)
        int[][] C = new int[3][2];

        // Multiplicação de matrizes
        for (int i = 0; i < 3; i++) {          // linha da matriz A
            for (int j = 0; j < 2; j++) {      // coluna da matriz B
                for (int k = 0; k < 2; k++) {  // coluna da matriz A / linha da matriz B
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Exibição da matriz produto
        System.out.println("Matriz Produto (C = A x B):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
    }
}