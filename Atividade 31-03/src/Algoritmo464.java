import java.util.Scanner;

public class Algoritmo464 {
    public static double graus(float rad) {
        return rad * 180 / Math.PI;
    }

    public static void main(String[] args) {
        System.out.println("Digite um angulo em radianos: ");
        Scanner scanner = new Scanner(System.in);
        float ang = scanner.nextFloat();

        System.out.println("Radianos: "+ ang + " Graus: "+graus(ang));
    }
}
