import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int intervalo = 5;

        ArrayList<Pessoas> pessoas = new ArrayList<Pessoas>();
        for (int i = 0; i <= 20; i++) {
            Pessoas pessoa =  new Pessoas("Pessoa "+ i, "Telefone "+ i, "Endereço "+i, "Cpf "+ i);
            pessoas.add(pessoa);
        }

        Random random = new Random();
        while (pessoas.size() > 1){
            int index = random.nextInt(pessoas.size());
            pessoas.remove(index);
            index = (index + intervalo - 1) % pessoas.size();
        }
        Pessoas sobrevivente = pessoas.get(0);
        System.out.println("A pessoa que sobreviveu foi: "+ sobrevivente.getNome());
    }
}