public class Celula {
    private String dado;
    private Celula proxima;

    public Celula(String dado) {
        this.dado = dado;
        this.proxima = null;
    }

    public String getDado() {
        return dado;
    }

    public Celula getProxima() {
        return proxima;
    }

    public void setProxima(Celula proxima) {
        this.proxima = proxima;
    }
}
