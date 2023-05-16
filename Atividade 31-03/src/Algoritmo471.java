import java.util.Scanner;

public class Algoritmo471 {
    public static int divisor(int x, int y) {
        int r, n1;
        n1 = 0;
        r = x % y;

        while (r == 0){
            n1++;
            x = x / y;
            r = x % y;
        }
        return n1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, num1, n;
        System.out.println("Digite dividendo: ");
        num = scanner.nextInt();
        System.out.println("Digite divisor: ");
        num1 = scanner.nextInt();

        while (num1 > num) {
            System.out.println("Invalido. digite numero menor do que o dividendo: ");
            num1 = scanner.nextInt();
        }
        n = divisor(num, num1);
        if (n == 0){
            System.out.println("Nenhuma vez");
        } else System.out.println("Numero de vezes: "+ n);
    }
}
