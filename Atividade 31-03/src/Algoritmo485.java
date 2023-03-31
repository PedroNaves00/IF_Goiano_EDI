import java.util.Scanner;

public class Algoritmo485 {
    public static void multiventor(int[] vet1, String[] vet2, int tam){
        int i, w;
        for (i=0; i<tam;i++){
            System.out.println("\n");
            for (w=0; w < vet1[i]; w++){
                System.out.println(vet2[i]);
            }
        }
    }

    public static void main(String[] args) {
        int l, c;
        int[] num = new int[6];
        String[] num1 = new String[6];
        Scanner scanner = new Scanner(System.in);

        for (l=0;l<6;l++){
            System.out.println("Digite um numero: "+(l+1)+": ");
            num[l] = scanner.nextInt();
        }
        for (l=0;l<6;l++){
            System.out.println("Digite caratere: "+(l+1)+ ": ");
            num1[l] = scanner.nextLine();
        }
        multiventor(num, num1, 6);
    }
}
