import java.util.Scanner;

public class Algoritmo356 {
    public static void main(String[] args) {
        int l, t, c;
        Scanner scanner = new Scanner(System.in);
        double[] media = new double[15];
        int[] pr1 = new int[15];
        int[] pr2 = new int[15];
        String[] nomes = new String[15], sit = new String[15];

        for (l = 0; l <= 14; l++) {
            System.out.println("Digite " + (l + 1) + " nome: ");
            nomes[l] = scanner.nextLine();
            while (nomes[l].length() > 30) {
                System.out.println("Nomes com ate 30 caracteres!");
                System.out.println("Digite " + (l + 1) + " nome: ");
                nomes[l] = scanner.nextLine();
            }

            t = (30 - nomes[l].length());
            for (c = -1; c <= t; c++) {
                nomes[l] = (nomes[l] + " ");
            }
            System.out.println("Digite a 1 nota: ");
            String spr1 = scanner.nextLine();
            spr1 = Integer.toString(pr1[l]);
            System.out.println("Digite a 2 nota: ");
            String spr2 = scanner.nextLine();
            spr2 = Integer.toString(pr2[l]);
            media[l] = ((pr1[l] + pr2[l]) / 2);
            if (media[l] >= 5) {
                sit[l] = "APROVADO";
            } else {
                sit[l] = "REPROVADO";
        }}
        System.out.println("Relação Final");
        for (l = 0; l <= 14; l++) {
            System.out.println((l + 1) + "- " + nomes[l]+"\t"+ pr1[l] + "\t"+pr2[l] +"\t"+ media[l] +"\t"+ sit[l]);
        }
}}
