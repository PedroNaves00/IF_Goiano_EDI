import java.util.Scanner;

public class Algoritmo358 {
    public static void main(String[] args) {
        double[] precocompra = new double[100];
        double[] precovenda = new double[100];
        double lucro;
        Scanner scanner = new Scanner(System.in);
        int totlucromenor10=0, totlucromenor20=0,totlucromaior20=0, a;

        for (a=0; a<100; a++){
            System.out.print("Preco de compra: ");
            precocompra[a] = scanner.nextInt();
            System.out.print("Preço de venda: ");
            precovenda[a] = scanner.nextInt();
        }
        for (a = 0; a<100; a++){
            lucro = (precovenda[a] - precocompra[a]);
            if (lucro<10.0){
                totlucromenor10++;
            } else if (lucro<=20.0) {
                totlucromenor20++;
            } else {
                totlucromaior20++;
            }

        }
    System.out.println("total de mercadorias com lucro < 10%: "+totlucromenor10);
    System.out.println("total de mercadorias com 10% <= lucro <= 20%: "+totlucromenor20);
    System.out.println("total de mercadorias com lucro > 20%: "+totlucromaior20);


    }
}
