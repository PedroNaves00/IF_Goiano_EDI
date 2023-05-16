import java.util.Scanner;

public class Algoritmo462 {
    public static float media(float x,float y ,float z){
        return (x + y + z)/ 3;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a nota 1: ");
        float n1 = scanner.nextInt();
        System.out.println("Digite a nota 2: ");
        float n2 = scanner.nextInt();
        System.out.println("Digite a nota 3: ");
        float n3 = scanner.nextInt();
        float m = media(n1, n2, n3);
        System.out.println("Média aritmética: "+m);
    }
}
