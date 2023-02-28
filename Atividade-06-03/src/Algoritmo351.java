import java.util.Scanner;

public class Algoritmo351 {
    public static void main(String[] args) {
        int l, num;
        String[] nomes = new String[5];
        Scanner scanner = new Scanner(System.in);

        for (l = 0; l<= 4; l++){
            System.out.println("Nome "+(l+1)+": ");
            nomes[l] = scanner.nextLine();
        }
        System.out.println("Digite o numero da pessoa: ");
        num = scanner.nextInt();
        while (num < 1 || num > 5){
            System.out.println("Digite o numero da pessoa: ");
            num = scanner.nextInt();

        }
        System.out.println(nomes[num -1]);
    }
}
