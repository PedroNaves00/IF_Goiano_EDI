import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        Stack<String> pilha1 = new Stack<>();

        String[] texto = ("ESARF ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC FI ONAIOG SUPMAC SOHNIRROM HE MU SOD SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED SAIOG").split(" ");

        for (int i = 0; i < texto.length; i++) {
            pilha1.push(texto[i]);
        }

        Stack<String> pilha1Invertida = new Stack<>();

        while (!pilha1.isEmpty()) {
            String str = pilha1.pop();
            StringBuilder stringInvertida = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--) {
                stringInvertida.append(str.charAt(i));
            }
            pilha1Invertida.push(stringInvertida.toString());
        }
        System.out.println("As strings ivertida são:");
        while (!pilha1Invertida.isEmpty()) {
            System.out.print(pilha1Invertida.pop() + " ");
        }
    }

}