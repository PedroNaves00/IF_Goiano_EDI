import java.util.Scanner;

public class Algoritmo460 {
        public static int dob(int x) {
            return 2 * x;
        }
        public static void main(String[] args) {
            int a, c;
            for (c = 0; c < 3; c++) {
                System.out.print("Digite numero: ");
                Scanner scanner = new Scanner(System.in);
                a = scanner.nextInt();
                System.out.println("dobro: " + dob(a));
            }
            System.out.println("\n");
    }
}