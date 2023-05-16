public class Ex02 {
    public class ListaDuplamenteEncadeada<T> {
        private Nodo<T> cabeca;
        private int tamanho;

        public ListaDuplamenteEncadeada() {
            cabeca = new Nodo<>(null);
            cabeca.setProximo(cabeca);
            cabeca.setAnterior(cabeca);
            tamanho = 0;
        }

        public boolean vazia() {
            return tamanho == 0;
        }

        public int tamanho() {
            return tamanho;
        }

        public void inserirInicio(T dado) {
            Nodo<T> novoNodo = new Nodo<>(dado);
            novoNodo.setProximo(cabeca.getProximo());
            novoNodo.setAnterior(cabeca);
            cabeca.getProximo().setAnterior(novoNodo);
            cabeca.setProximo(novoNodo);
            tamanho++;
        }

        public void inserirFim(T dado) {
            Nodo<T> novoNodo = new Nodo<>(dado);
            novoNodo.setProximo(cabeca);
            novoNodo.setAnterior(cabeca.getAnterior());
            cabeca.getAnterior().setProximo(novoNodo);
            cabeca.setAnterior(novoNodo);
            tamanho++;
        }

        public void inserirApos(Nodo<T> nodoAtual, T dado) {
            Nodo<T> novoNodo = new Nodo<>(dado);
            novoNodo.setProximo(nodoAtual.getProximo());
            novoNodo.setAnterior(nodoAtual);
            nodoAtual.getProximo().setAnterior(novoNodo);
            nodoAtual.setProximo(novoNodo);
            tamanho++;
        }

        public void remover(Nodo<T> nodo) {
            nodo.getAnterior().setProximo(nodo.getProximo());
            nodo.getProximo().setAnterior(nodo.getAnterior());
            tamanho--;
        }

        public Nodo<T> buscar(T dado) {
            Nodo<T> nodoAtual = cabeca.getProximo();

            while (nodoAtual != cabeca) {
                if (nodoAtual.getDado().equals(dado)) {
                    return nodoAtual;
                }
                nodoAtual = nodoAtual.getProximo();
            }

            return null;
        }

        // ...
    }

    class Nodo<T> {
        private T dado;
        private Nodo<T> anterior;
        private Nodo<T> proximo;

        public Nodo(T dado) {
            this.dado = dado;
        }

        public T getDado() {
            return dado;
        }

        public Nodo<T> getAnterior() {
            return anterior;
        }

        public void setAnterior(Nodo<T> anterior) {
            this.anterior = anterior;
        }

        public Nodo<T> getProximo() {
            return proximo;
        }

        public void setProximo(Nodo<T> proximo) {
            this.proximo = proximo;
        }
    }

}
