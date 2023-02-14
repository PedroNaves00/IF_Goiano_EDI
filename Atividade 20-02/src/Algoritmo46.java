import java.util.Scanner;

public class Algoritmo46 {
    public static void main(String[] args){
        double saldo,nsaldo;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o saldo: ");
        saldo = input.nextDouble();

        nsaldo = saldo * 1.01;
        System.out.println("Novo saldo: "+nsaldo);

    }
}
