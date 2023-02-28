import java.util.Scanner;

public class Algoritmo348 {
    public static void main(String[] args) {
        int l;
        String[] nomes = new String[5];
        Scanner scanner = new Scanner(System.in);
        int[] pr1 = new int[5], pr2 = new int[5], media = new int[5];

        for ( l = 0; l <= 4; l ++) {
            System.out.println("Digite " + (l + 1) + " nome: ");
            nomes[l] = scanner.nextLine();
            System.out.println("Digite a primeira nota: ");
            pr1[l] = scanner.nextInt();
            System.out.println("Digite a segunda nota: ");
            pr2[l] = scanner.nextInt();
            media[l] = (pr1[l] + pr2[l]) / 2;
        }
        System.out.println("Relação Final");
        for (l = 0; l <= 4; l++){
            System.out.println(l+1+"-"+nomes[l]);
            System.out.println(pr1[l]+pr2[l]+media[l]);
            }
    }
}