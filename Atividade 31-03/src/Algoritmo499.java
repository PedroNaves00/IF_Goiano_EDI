import java.util.Scanner;
public class Algoritmo499 {
        public static void main(String[] args) {
            int[] num = new int[5];
            int L, flag = 0, op;
            Scanner input = new Scanner(System.in);

            for (L = 0; L < 5; L++) {
                num[L] = 0;
            }

            do {
                System.out.println("\n\nMENU VETOR - FUNÇÃO");
                System.out.println("\n1 Dados do VETOR");
                System.out.println("\n2 Ordena VETOR");
                System.out.println("\n3 Imprime VETOR");
                System.out.println("\n4 Sai do programa");
                System.out.print("\nOPÇÃO: ");

                op = input.nextInt();

                switch (op) {
                    case 1:
                        entrada(num, 5);
                        flag = 1;
                        break;

                    case 2:
                        if (flag == 1) {
                            ordena(num, 5);
                        } else {
                            System.out.println("\nEscolha primeiro opção 1");
                        }
                        break;

                    case 3:
                        if (flag == 1) {
                            imprime(num, 5);
                        } else {
                            System.out.println("\nEscolha primeiro opção 1");
                        }
                        break;

                    case 4:
                        System.out.println("\nSaindo do Algoritmo");
                        break;

                    default:
                        System.out.println("\nOpção inválida");
                }
            } while (op != 4);

            System.out.println();
        }

        public static void entrada(int[] num, int tam) {
            Scanner input = new Scanner(System.in);

            for (int L = 0; L < tam; L++) {
                System.out.print("\nDigite o número " + (L+1) + ": ");
                num[L] = input.nextInt();
            }
        }

        public static void ordena(int[] num, int tam) {
            int aux;

            for (int i = 0; i < tam-1; i++) {
                for (int j = i+1; j < tam; j++) {
                    if (num[i] > num[j]) {
                        aux = num[i];
                        num[i] = num[j];
                        num[j] = aux;
                    }
                }
            }

            System.out.println("\nVETOR ORDENADO\n");

            for (int L = 0; L < tam; L++) {
                System.out.println((L+1) + " - " + num[L]);
            }
        }

        public static void imprime(int[] num, int tam) {
            System.out.println("\nVETOR\n");

            for (int L = 0; L < tam; L++) {
                System.out.println((L+1) + " - " + num[L]);
            }
        }
    }

