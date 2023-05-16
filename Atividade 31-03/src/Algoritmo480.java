import java.util.Scanner;

public class Algoritmo480 {
    public static int reverso(int num) {
        int soma = 0, r;
        while (num != 0) {
            r = num % 10;
            soma = soma * 10 + r;
            num = num / 10;
        }
        return soma;
    }
    public static void main(String[] args) {
        int n, x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        n = scanner.nextInt();
        x = reverso(n);

        System.out.println(n + " - " + x);
        if (x == n){
            System.out.println("é um numero capicua");
        } else System.out.println("Nao é um numero capicua");
    }
}
