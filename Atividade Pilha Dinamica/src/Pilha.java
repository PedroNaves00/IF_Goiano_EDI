public class Pilha {
    private Celula topo;

    public Pilha() {
        this.topo = null;
    }

    public boolean estaVazia() {
        return topo == null;
    }

    public void empilhar(int dado) {
        Celula novaCelula = new Celula(dado);
        novaCelula.setProxima(topo);
        topo = novaCelula;
    }

    public void desempilhar() {
        topo = topo.getProxima();
    }

    public int getTopo() {
        if (estaVazia()) {
            System.out.println("pilha vazia");
        }

        return topo.getDado();
    }

    public void imprimirPilha() {
        if (estaVazia()) {
            System.out.println("A pilha está vazia.");
            return;
        }

        Celula atual = topo;
        while (atual != null) {
            System.out.print(atual.getDado() + " ");
            atual = atual.getProxima();
        }
        System.out.println();
    }
}

