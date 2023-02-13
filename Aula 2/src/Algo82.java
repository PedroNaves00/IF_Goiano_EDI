import javax.swing.JOptionPane;
public class Algo82 {
    public static void main(String[] args) {
        String sOP;

        Calculadora calc = new Calculadora();

        calc.fNum1 = Float.parseFloat(JOptionPane.showInputDialog("Entre com o valor do primero termo"));
        calc.fNum2 = Float.parseFloat(JOptionPane.showInputDialog("Entre com o valor do segundo termo"));

        sOP = JOptionPane.showInputDialog("Entre com o valor da operaçao: 1 - soma, 2 - subtraçao, 3 - mutiplicaçao, 4 - divisao");

        switch (sOP) {
            case "1": calc.fResp = calc.fNum1 + calc.fNum2;
                    JOptionPane.showMessageDialog(null, "O valor encontrado é..:"+calc.fResp);
                    break;
            case "2": calc.fResp = calc.fNum1 - calc.fNum2;
                    JOptionPane.showMessageDialog(null, "O valor encontrado é..:"+calc.fResp);
                    break;
            case "3": calc.fResp = calc.fNum1 * calc.fNum2;
                    JOptionPane.showMessageDialog(null, "O valor encontrado é..:"+calc.fResp);
                    break;
            case "4": calc.fResp = calc.fNum1 / calc.fNum2;
                    JOptionPane.showMessageDialog(null, "O valor encontrado é..:"+calc.fResp);
                    break;
            default:JOptionPane.showMessageDialog(null, "Opçao Inválida");

        }

    }
}
