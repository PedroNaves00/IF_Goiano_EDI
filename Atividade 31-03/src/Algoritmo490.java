import java.util.Scanner;

public class Algoritmo490 {
    public static int restantes(String[] vet, int tam, String x){
        int i, cont;
        cont = 0;
        for (i=0;i<tam;i++){
            if (vet[i]==x){
                vet[i] = "*"; cont++;}
            }
        return cont;
        }

    public static void main(String[] args) {
        String[] nome = new String[10];
        int l;
        Scanner scanner = new Scanner(System.in);

        for (l=0;l<10;l++){
            System.out.println("Digite uma palavra "+ (l+1)+ ": ");
            nome[l] = scanner.nextLine().toLowerCase();
            restantes(nome, nome[l].length(), "c");
    }
        for (l=0;l<10;l++){
            System.out.println("\n"+(l+1)+ "-"+nome[l]);
        }
    }
}
