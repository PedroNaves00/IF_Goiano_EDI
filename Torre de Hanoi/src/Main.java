import java.time.Duration;
import java.util.Date;

public class Main{
    static int qtd = 0;
    public static void torreHanoi(int numDiscos, char torreInicial, char torreFinal, char torreAuxiliar) {
        if (numDiscos == 1) {
            System.out.println("Mover disco 1 da torre " + torreInicial + " para a torre " + torreFinal);
            qtd++;
        } else {
            torreHanoi(numDiscos - 1, torreInicial, torreAuxiliar, torreFinal);
            System.out.println("Mover disco " + numDiscos + " da torre " + torreInicial + " para a torre " + torreFinal);
            qtd++;
            torreHanoi(numDiscos - 1, torreAuxiliar, torreFinal, torreInicial);
        }
    }
    public static void main(String[] args) {

        int numDiscos = 40;
        char torreInicial = 'A';
        char torreFinal = 'C';
        char torreAuxiliar = 'B';

        Date tempoInicial = new Date();
        torreHanoi(numDiscos, torreInicial, torreFinal, torreAuxiliar);
        Date tempoFinal = new Date();
        System.out.println("Quantidade de movimentos: "+ qtd);

        Duration duracao = Duration.ofMillis(tempoFinal.getTime() - tempoInicial.getTime());
        String tempoFormatado = String.format("%02d:%02d:%02d:%03d", duracao.toHours(), duracao.toMinutesPart(), duracao.toSecondsPart(), duracao.toMillisPart());
        System.out.println("Tempo de execução: " + tempoFormatado);
    }

/// Ex - 1 disco 10 discos 20 discos 30 discos 40 discos 41 discos
    // 2ˆ40 - 1 = 1,099,511,627,775
    // 2ˆ41 - 2 = 2,199,023,255,551
}
