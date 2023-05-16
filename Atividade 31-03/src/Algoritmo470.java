import java.util.Scanner;

public class Algoritmo470 {

    public static int primo(int n){
        int c, p;
        c = 0;
        p = 2;
        while (c == 0 && p <= n / 2){
            if (n % p == 0) {
                c = 1;
            }
            p++;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, pri;
        System.out.println("Digite um numero > 0: ");
        num = scanner.nextInt();
        pri = primo(num);
        if (pri == 0){
            System.out.println("é primo");
        } else System.out.println("nao é primo");
    }
}
