import java.util.Scanner;

public class Algoritmo161 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c;
        int num = 0;

        for (c=1; c <=5; c++){
            System.out.println("numero: ");
            num = scanner.nextInt();
            System.out.println("quadrado: "+(Math.pow(num, 2)));
        }
    }
}