import java.util.Scanner;
public class Algoritmo497 {
        public static void main(String[] args) {
            int[] num = new int[10];
            int n, c;
            Scanner sc = new Scanner(System.in);

            for (int i = 0; i < 10; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                num[i] = sc.nextInt();
            }

            System.out.print("Digite o número a ser buscado: ");
            n = sc.nextInt();

            ordena(num, 10);

            System.out.println("\nVETOR");
            for (int i = 0; i < 10; i++) {
                System.out.println((i + 1) + " - " + num[i]);
            }

            c = busca(num, 10, n) + 1;
            if (c != 0) {
                System.out.println("\nPosição no vetor: " + c);
            } else {
                System.out.println("\nNão encontrado.");
            }
        }

        public static int busca(int[] vet, int tam, int chave) {
            int ini = 0;
            int fim = tam - 1;
            int meio = (ini + fim) / 2;

            while (ini <= fim) {
                if (chave == vet[meio]) {
                    return meio;
                } else {
                    if (chave < vet[meio]) {
                        fim = meio - 1;
                    } else {
                        ini = meio + 1;
                    }
                }
                meio = (ini + fim) / 2;
            }

            return -1;
        }

        public static void ordena(int[] vet, int tam) {
            int aux;
            for (int i = 0; i < tam - 1; i++) {
                for (int j = i + 1; j < tam; j++) {
                    if (vet[i] > vet[j]) {
                        aux = vet[i];
                        vet[i] = vet[j];
                        vet[j] = aux;
                    }
                }
            }
        }
    }

