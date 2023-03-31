import java.util.Scanner;

public class Algoritmo487 {
    public static void inverte(int[] vet, int max){
        int k, i, aux;
        k = max;
        for (i=0;i<max/2;i++){
            aux = vet[i];
            k--;
            vet[i] = vet[k];
            vet[k] = aux;
        }
    }
    public static void main(String[] args) {
        int l, n;
        int[] num = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (l=0;l<10;l++){
            System.out.println("Digite um numero: "+ (l+1) + ": ");
            num[l] = scanner.nextInt();
        }
        inverte(num,10);
        System.out.println("Vetor");
        for (l=0;l<10;l++){
            System.out.println("\n" + (l+1) + "-" + num[l]);
        }
    }
}
