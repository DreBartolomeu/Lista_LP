import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        int nota1 = input.nextInt();

        System.out.println("Digite a segunda nota: ");
        int nota2 = input.nextInt();

        int media = (nota1+nota2)/2;

        System.out.println("A média da sua nota é " + media + ".");

        input.close();

    }
}