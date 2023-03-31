import java.util.Scanner;

public class Algoritmo493 {
    public static int busca(int[] vet, int tam) {
        int i, x, l;
        for (i = 0; i < tam - 1; i++) {
            if (vet[i] < vet[i + 1]) {
                x = 0;
                return x;
            }
        }
        x = 1;
        return x;
    }

    public static int busca1(int[] vet, int tam) {
        int i, x, l;
        for (i = 0; i < tam - 1; i++) {
            if (vet[i] > vet[i + 1]) {
                x = 0;
                return x;
            }
        }
        x = 1;
        return x;
    }

    public static int verificaordem(int[] vetor, int t) {
        int r, res, l;
        r = busca(vetor, t);
        if (r == 1) {
            res = 2;
            return res;
        } else {
            r = busca1(vetor, 1);
            if (r == 1) {
                res = 1;
                return res;
            } else {
                res = 0;
                return res;
            }
        }
    }

    public static void main(String[] args) {
        int l, c, aux;
        int[] num = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (l=0;l<10;l++){
            System.out.println("Digite numero "+ (l+1) + ": ");
            num[l] = scanner.nextInt();
        }
        c = verificaordem(num,10);
        if (c==1){
            System.out.println("Ordenaçao crescente");
        } else if (c==2){
            System.out.println("Ordenaçao decrescente");
        } else {
            System.out.println("Nao esta ordenado");
        }

    }
}
