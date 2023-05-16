import java.util.Scanner;
public class Algoritmo495 {
        public static void ordena(String[][] nome, int tam) {
            String aux;
            for (int i = 0; i < tam - 1; i++) {
                for (int j = i + 1; j < tam; j++) {
                    if (nome[i][0].compareTo(nome[j][0]) > 0) {
                        for (int k = 0; k < 20; k++) {
                            aux = nome[i][k];
                            nome[i][k] = nome[j][k];
                            nome[j][k] = aux;
                        }
                    }
                }
            }
        }
        public static void main(String[] args) {
            int L, c;
            String[][] nome = new String[5][20];
            Scanner sc = new Scanner(System.in);

            for (L = 0; L < 5; L++) {
                System.out.print("Digite nome: ");
                nome[L][0] = sc.nextLine();
            }

            ordena(nome, 5);

            System.out.println("\n\nNOMES ORDENADOS");
            for (L = 0; L < 5; L++) {
                System.out.print("\n" + (L + 19) + " - ");
                for (c = 0; c < 20; c++) {
                    System.out.print(nome[L][c]);
                }
            }
            System.out.println("\n");

            sc.close();
        }
    }


