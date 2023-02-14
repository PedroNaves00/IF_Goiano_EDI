import javax.swing.JOptionPane;
import java.util.Scanner;

public class Algoritmo23 {
    public static void main(String[] args){
        int a, d;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero de 3 casas: ");
        String s = input.nextLine();

        a = Integer.parseInt(s);

        d = a % 100 / 10;

        System.out.println("Algarismo da casa das dezenas: " + d);

    }
}
