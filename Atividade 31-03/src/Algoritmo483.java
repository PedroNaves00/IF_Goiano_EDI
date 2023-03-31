import java.util.Scanner;

public class Algoritmo483 {
    public static int produtointerno(int[] vet1, int[] vet2, int qtd ){
        int prod, i;
        prod = 0;

        for (i = 0; i<qtd; i++){
            prod += (vet1[i] * vet2[i]);
        }
        return prod;
    }

    public static void main(String[] args) {
        int l, c, aux;
        Scanner scanner = new Scanner(System.in);
        int num[] = new int[4];
        int num1[] = new int[4];

        for (l=0;l<4;l++){
            System.out.println("Digite 1 numero "+ (l+1)+ ": ");
            num[l] = scanner.nextInt();
        }
        for (l=0;l<4;l++){
            System.out.println("Digite 2 numero "+(l+1) +": ");
            num1[l] = scanner.nextInt();
        }
        c = produtointerno(num, num1, 4);
        System.out.println("Vetor A Vetor B");
        for (l=0;l<4;l++){
            System.out.println(num[l]+ num1[l]);
            System.out.println("Produto interno: "+c);
        }
    }
}
