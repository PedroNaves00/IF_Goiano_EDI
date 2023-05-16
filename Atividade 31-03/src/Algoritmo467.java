import javax.swing.*;
import java.util.Scanner;

public class Algoritmo467 {
    public static double logaritmo(int base, int expo){
        double i;
        i = Math.log(base) / Math.log(expo);
        return i;
    }
    public static void main(String[] args) {
        int z, l, b;
        Scanner scanner = new Scanner(System.in);

        for (int c = 0; c <= 3; c++){
            System.out.println("Digite logaritmando maior do que 0: ");
            l = scanner.nextInt();
            while (l<=0){
                System.out.println("Valor ivalido. Digite logaritimando maior que 0: ");
                l = scanner.nextInt();
            }  System.out.println("Digite uma base maior que 0 e diferente de 1: ");
            b = scanner.nextInt();
            while (b < 0 || b ==1 ) {
                System.out.println("Valor invalido. Digite base maior que 0 e diferente de 1: ");
                b = scanner.nextInt();
            }
            System.out.println("Logaritmo é "+ logaritmo(l,b));
        }
    }
}
