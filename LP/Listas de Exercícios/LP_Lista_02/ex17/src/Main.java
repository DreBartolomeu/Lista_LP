import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a velocidade inicial (em m/s):");
        double velocidadeInicial = input.nextDouble();

        System.out.println("Digite a aceleração (em m/s²):");
        double aceleracao = input.nextDouble();

        System.out.println("Digite o tempo de percurso (em segundos):");
        double tempo = input.nextDouble();

        double velocidadeFinal = velocidadeInicial + (aceleracao * tempo);

        System.out.println("A velocidade final do corpo é de: " + velocidadeFinal + " m/s");

        input.close();
    }
}
