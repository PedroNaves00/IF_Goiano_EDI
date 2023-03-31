import java.util.Scanner;

public class Algoritmo463 {
    public static double radiano(float angulo) {
        return angulo * (Math.PI / 180);
    }

    public static void main(String[] args) {
        System.out.println("Digite angulo em graus: ");
        Scanner scanner = new Scanner(System.in);
        float ang = scanner.nextFloat();
        System.out.println("Graus: "+ang +" radianos: " + radiano(ang));;
    }
}
