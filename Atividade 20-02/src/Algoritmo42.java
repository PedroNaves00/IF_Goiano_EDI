import java.util.Scanner;

public class Algoritmo42 {
    public static void main(String[] args) {
        double angulo, radiano;
        Scanner input = new Scanner(System.in);
        System.out.println("digite um angulo em graus: ");
        angulo = input.nextInt();

        radiano = angulo*Math.PI / 180;

        System.out.println("seno: "+ Math.sin(radiano));
        System.out.println("cosseno: "+Math.cos(radiano));
        System.out.println("tangente: "+Math.tan(radiano));
        System.out.println("cossecante: "+1 / Math.sin(radiano));
        System.out.println("secante: "+ 1/ Math.cos(radiano));
        System.out.println("cotangente: "+ 1/ Math.tan(radiano));
    }
}
