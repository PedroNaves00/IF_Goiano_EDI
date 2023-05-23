public class Celula {
    private int dado;
    private Celula proxima;

    public Celula(int dado) {
        this.dado = dado;
        this.proxima = null;
    }

    public int getDado() {
        return dado;
    }

    public Celula getProxima() {
        return proxima;
    }

    public void setProxima(Celula proxima) {
        this.proxima = proxima;
    }
}
