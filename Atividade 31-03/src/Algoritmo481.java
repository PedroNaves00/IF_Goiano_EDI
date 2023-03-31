import java.util.Scanner;

public class Algoritmo481 {
    public static int converte(int num, int base){
        int nb, r, b;
        b = 0;
        nb = 0;
        while (num >= base){
            r = num % base;
            nb += Math.pow(10, b) * r;
            num = num / base;
            b++;
        }
        nb += Math.pow(10, b) * num;
        return nb;
    }
    public static void main(String[] args) {
        int num, base, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero maior ou igual a 0: ");
        num = scanner.nextInt();

        while (num < 0){
            System.out.println("Numero negativo. Digite numero maior ou igual a 0: ");
            num = scanner.nextInt();
        }
        System.out.println("Digite a base que deseja representa-lo(2-10): ");
        base = scanner.nextInt();
        while (base < 2 || base > 10){
            System.out.println("Nao sei converter. digite a base que deseja representa-lo(2-10): ");
            base = scanner.nextInt();
        }
        c = converte(num, base);
        System.out.println("Numero decimal: "+ num);
        System.out.println("Numero da base "+ base + ": " + c);
    }
}
