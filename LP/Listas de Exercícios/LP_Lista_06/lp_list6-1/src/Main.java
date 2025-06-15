//Escreva uma função que receba um número inteiro positivo $N$ e retorne
//a soma de todosos números inteiros de $1$ até $N$. Obs.: $N$ deve ser maior que $0$.

public class Main {

    public static int somarAteN(int n) {
        if (n <= 0) {
            System.out.println("Erro: N deve ser maior que 0.");
            return 0;
        }

        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }

        return soma;
    }

    public static void main(String[] args) {
        int N = 10;
        int resultado = somarAteN(N);
        System.out.println("Soma de 1 até " + N + " = " + resultado);
    }
}
