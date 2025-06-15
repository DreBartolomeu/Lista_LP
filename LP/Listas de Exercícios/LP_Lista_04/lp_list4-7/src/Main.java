public class Main {
    public static void main(String[] args) {
        for (int num = 1; num <= 10; num++) {
            System.out.println("Tabuada de " + num + ":");
            for (int i = 0; i <= 10; i++) {
                System.out.printf("%d x %d = %d\n", num, i, num * i);
            }
            System.out.println();
        }
    }
}