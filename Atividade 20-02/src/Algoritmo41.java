import java.util.Scanner;

public class Algoritmo41 {
    public static void main(String[] args){
        float a,b,c,d,mp;
        Scanner input = new Scanner(System.in);
        System.out.println("entre com o 1 numero: ");
        a = input.nextFloat();
        System.out.println("entre com o 2 numero: ");
        b = input.nextFloat();
        System.out.println("entre com o 3 numero: ");
        c = input.nextFloat();
        System.out.println("entre com o 4 numero: ");
        d = input.nextFloat();
        mp = (a*1 + b*2 + c*3 + d*4) / 10;

        System.out.println("media ponderada: "+mp);
    }
}
