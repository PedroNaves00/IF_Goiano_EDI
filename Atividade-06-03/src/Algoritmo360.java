import java.util.Scanner;

public class Algoritmo360 {
    public static void main(String[] args) {
        int[] ultimosdias = new int[12];
        int data, i, dia, mes;
        String sultimodia, sdata;
        String[] signo = new String[12];
        Scanner scanner = new Scanner(System.in);

        for (i=0; i<12; i++){
            System.out.println("Digite signo: ");
            signo[i] = scanner.nextLine();
            System.out.println("Digite seu ultimo dia: ");
            sultimodia = scanner.nextLine();
            ultimosdias[i] = Integer.parseInt(sultimodia);
        }
        System.out.println("Digite data no formato ddmm ou 9999 para terminar: ");
        sdata = scanner.nextLine();
        data = Integer.parseInt(sdata);

        while (data!=9999){
            dia = (data / 100);
            mes = (data % 100);
            mes--;

            if (dia > ultimosdias[mes]){
                mes = (mes+1) % 12;
            }
            System.out.println("Signo: "+signo[mes]);
            System.out.println("Digite no formato ddmm ou 9999 para terminar: ");
            sdata = scanner.nextLine();
            data = Integer.parseInt(sdata);
        }
    }
}
