public class Pilha {
    private Celula topo;

    public Pilha() {
        this.topo = null;
    }

    public boolean estaVazia() {
        return topo == null;
    }

    public void empilhar(String dado) {
        Celula novaCelula = new Celula(dado);
        novaCelula.setProxima(topo);
        topo = novaCelula;
    }

    public String desempilhar() {
        if (estaVazia()) {
            throw new RuntimeException("A pilha está vazia");
        }

        String dado = topo.getDado();
        topo = topo.getProxima();
        return dado;
    }

    public String getTopo() {
        if (estaVazia()) {
            throw new RuntimeException("A pilha está vazia");
        }

        return topo.getDado();
    }
}
