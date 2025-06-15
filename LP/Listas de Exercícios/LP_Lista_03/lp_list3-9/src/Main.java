//Dados três valores, verificar se eles podem ser valores dos lados de um triângulo. Se forem, imprima se é um triângulo equilátero, isósceles ou escaleno.
//    >**Condição de existência de um triângulo**: <br>
//A medida de qualquer um dos lados de um triângulo deve ser menor do que a soma dos outros dois lados e maior que diferença entre essas mesmas medidas. <br>
//    - **Triângulo equilátero:** possui todos os lados iguais.
//    - **Triângulo isósceles:** possui apenas dois lados iguais.
//    - **Triângulo escaleno**: todos os lados são diferentes.10.



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro lado: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o segundo lado: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o terceiro lado: ");
        double c = scanner.nextDouble();

        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c) {
                System.out.println("Triângulo equilátero.");
            } else if (a == b || b == c || a == c) {
                System.out.println("Triângulo isósceles.");
            } else {
                System.out.println("Triângulo escaleno.");
            }
        } else {
            System.out.println("Os valores não formam um triângulo.");
        }

        scanner.close();
    }
}
