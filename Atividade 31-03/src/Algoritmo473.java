import java.util.Scanner;

public class Algoritmo473 {
    public static int maiuscula(String letra){
        if (letra.equals("a") || (letra.equals("e")) || (letra.equals("i")) || (letra.equals("o")) || (letra.equals("u"))){
            return 1;
        } else return 0;
    }
    public static void main(String[] args) {
        String c; int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        c = scanner.nextLine().toLowerCase();
        x = maiuscula(c);
        if (x == 1){
            System.out.println("Não é uma consoante");
        } else System.out.println("É uma consoante");

    }
}
