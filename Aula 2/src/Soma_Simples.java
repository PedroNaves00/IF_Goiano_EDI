
import javax.swing.JOptionPane;
public class Soma_Simples {
    public static void main(String[] args) {
        Fatores numbers = new Fatores();
        String s;
        boolean valor;
        char opcao;

        s = JOptionPane.showInputDialog("Entre com o valor do primeiro fator");

        numbers.num1 = Integer.parseInt(s);
        numbers.num2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o segundo fator"));

        if (numbers.num1 > 10){
            valor = true;
        }else
            valor = false;

        System.out.println("A soma dos valores é: "+ (numbers.num1+ numbers.num2));
        System.out.println("O resultado do valor é"+ valor);

        opcao = 's';
        System.out.println("Opçao escolhida..: "+opcao);
    }
}
