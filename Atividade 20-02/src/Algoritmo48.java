import java.util.Scanner;

public class Algoritmo48 {
    public static void main(String[] args){
        double kwatts,preco,salario,novo_valor,desconto;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o salário minimo: ");
        salario = input.nextDouble();
        System.out.print("Digite o quilowatt gasto: ");
        kwatts = input.nextDouble();

        preco = salario / 700;
        novo_valor = preco * kwatts;
        desconto = novo_valor * 0.9;

        System.out.printf("Valor do quilowatt: %.2f\n", preco);
        System.out.printf("Valor a ser pago: %.2f\n", novo_valor);
        System.out.printf("Valor com desconto: %.2f\n", desconto);
    }
}
