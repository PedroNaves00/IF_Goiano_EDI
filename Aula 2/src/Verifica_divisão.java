import javax.swing.JOptionPane;
public class Verifica_divisão {
    public static void main(String[] args){
        Num n = new Num();

        n.numerador = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor do numerador"));
        n.denominador = Integer.parseInt(JOptionPane.showInputDialog("Entre com o denominador"));

        if (n.denominador != 0) {
            n.resultado = n.numerador / n.denominador;
            JOptionPane.showMessageDialog(null,"O resultado da divisão é "+n.resultado);
        }else {
            JOptionPane.showMessageDialog(null, "O resultado da divisão não é possivel, pois o denominador é igual a 0");

        }
        
    }
}
