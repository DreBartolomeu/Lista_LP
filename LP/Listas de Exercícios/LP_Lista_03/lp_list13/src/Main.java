//Calculadora geométrica: exibir em um menu a opção de escolha entre três formageométricas: círculo, triangulo retângulo ou retângulo. Após a seleção da opção oprograma deverá solicitar que o usuário insira os dados necessário para realizar os cálculos de área e perímetro da forma selecionada, os resultados devem ser exibidos em seguida.Exemplo:
//
//        ```plaintext
//Menu:
//        1. Círculo
//        2. Triangulo Retângulo
//        3. Retângulo
//    --------------------------
//Escolha uma opção: 2
//        --------------------------
//Informe a base: 3
//Informe a altura: 4
//        --------------------------
//Área = 6
//Perímetro = 12
//        ```


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("    1. Círculo");
        System.out.println("    2. Triângulo Retângulo");
        System.out.println("    3. Retângulo");
        System.out.println("--------------------------");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        System.out.println("--------------------------");

        switch (opcao) {
            case 1: // Círculo
                System.out.print("Informe o raio: ");
                double raio = scanner.nextDouble();
                double areaCirculo = Math.PI * raio * raio;
                double perimetroCirculo = 2 * Math.PI * raio;
                System.out.printf("Área = %.2f\n", areaCirculo);
                System.out.printf("Perímetro = %.2f\n", perimetroCirculo);
                break;

            case 2: // Triângulo Retângulo
                System.out.print("Informe a base: ");
                double base = scanner.nextDouble();
                System.out.print("Informe a altura: ");
                double altura = scanner.nextDouble();
                double areaTriangulo = (base * altura) / 2;
                // Hipotenusa
                double hipotenusa = Math.sqrt(base * base + altura * altura);
                double perimetroTriangulo = base + altura + hipotenusa;
                System.out.printf("Área = %.2f\n", areaTriangulo);
                System.out.printf("Perímetro = %.2f\n", perimetroTriangulo);
                break;

            case 3: // Retângulo
                System.out.print("Informe a largura: ");
                double largura = scanner.nextDouble();
                System.out.print("Informe a altura: ");
                double alturaRet = scanner.nextDouble();
                double areaRetangulo = largura * alturaRet;
                double perimetroRetangulo = 2 * (largura + alturaRet);
                System.out.printf("Área = %.2f\n", areaRetangulo);
                System.out.printf("Perímetro = %.2f\n", perimetroRetangulo);
                break;

            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
