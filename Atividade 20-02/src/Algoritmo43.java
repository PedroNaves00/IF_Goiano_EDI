import java.util.Scanner;

public class Algoritmo43 {
    public static void main(String[] args) {
        double numero, logaritmo;
        Scanner input = new Scanner(System.in);
        System.out.print("entre com o logaritmando: ");
        numero = input.nextDouble();

        logaritmo = Math.log(numero) / Math.log(10);

        System.out.println("logaritmo: "+logaritmo);
    }
}
