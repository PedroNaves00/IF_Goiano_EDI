import java.util.Scanner;

public class Algoritmo346 {
    public static void main(String[] args) {
        String frase;
        String sop;
        int x;
        Scanner scanner = new Scanner(System.in);

        int op;
        do {
            System.out.println("\nMenu");
            System.out.println("1- Imprime o comprimento da frase ");
            System.out.println("2- Imprime os dois primeiros e os dois ultimos caracteres da frase");
            System.out.println("3- Imprime a frase espelhada ");
            System.out.println("4- termina o algoritmo");
            System.out.println("Opção: ");
            sop = scanner.nextLine();
            op = Integer.parseInt(sop);

            if (op == 1) {
                System.out.print("Digite uma frase: ");
                frase = scanner.nextLine().toLowerCase().replaceAll("\\s+", " ").trim();
                System.out.println("Numero de caracteres da frase: " + frase.length());
            } else if (op == 2) {
                System.out.println("Digite uma frase: ");
                frase = scanner.nextLine();
                if (frase.length() < 2) {
                    System.out.println("A frase não possui mais de 2 caracteres");
                }else {
                    System.out.println("Os dois primeiros caracteres da frase: " + frase.substring(0, 2));
                    System.out.printf("Os dois ultimos caracteres: %s%n", frase.substring(frase.length() -2));
                }} else if (op == 3) {
                System.out.println("Digite uma frase: ");
                frase = scanner.nextLine();
                System.out.print("Frase espelhada: ");
                for (x = Integer.parseInt(String.valueOf(frase.length())) -1 ; x>=0; x--){
                    System.out.print(frase.charAt(x));
                }
            }else if (op == 4){
                System.out.println("Fim do programa");
            } else {
                System.out.println("Opção indispponível");
            }
        } while (op != 4);
    }
}
