import java.util.Scanner;

public class Algoritmo44 {
    public static void main(String[] args){
        double base, logaritmo, numero;
        Scanner input = new Scanner(System.in);
        System.out.print("entre com o logaritmando: ");
        numero = input.nextDouble();
        System.out.print("entre com a base: ");
        base = input.nextDouble();

        logaritmo = Math.log(numero) / Math.log(base);
        System.out.println("Logaritmo: "+ logaritmo);
    }
}
