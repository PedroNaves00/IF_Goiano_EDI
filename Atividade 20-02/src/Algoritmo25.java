import java.util.Scanner;

public class Algoritmo25 {
    public static void main(String[] args) {
        int data,dia,mes,ano;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite data no formato ddmmaa: ");
        data = input.nextInt();

        dia = data / 10000;
        mes = data % 10000 / 100;
        ano = data % 100;

        System.out.println("DIA:"+dia);
        System.out.println("MÊS:"+mes);
        System.out.println("ANO:"+ano);
    }
}
