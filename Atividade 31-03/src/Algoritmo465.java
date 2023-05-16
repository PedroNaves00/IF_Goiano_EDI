import java.util.Scanner;

public class Algoritmo465 {
    public static void verifica(int n1, int n2) {
        if (n1 < n2){
            System.out.println("maior numero: "+n2);
        } else System.out.println("maior numero: "+n1);
    }
    public static void main(String[] args) {
        System.out.println("Digite o numero 1: ");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        System.out.println("Digite o numero 2: ");
        int n2 = scanner.nextInt();
        verifica(n1,n2);
    }
}
