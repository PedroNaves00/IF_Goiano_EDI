import java.util.Scanner;

public class Algoritmo40 {
    public static void main(String[] args){
        int dividendo, divisor, quociente, resto;
        Scanner input = new Scanner(System.in);
        System.out.println("entre com o dividendo: ");

        dividendo = input.nextInt();
        System.out.println("entre com o divisor: ");
        divisor = input.nextInt();

        quociente = dividendo / divisor;
        resto = dividendo % divisor;
        System.out.println("dividendo: "+dividendo);
        System.out.println("divisor: "+divisor);
        System.out.println("quociente: "+quociente);
        System.out.println("resto: "+resto);


    }
}
