public class Ex05 {
    public static class ListaCircularComCabeca<T> {
        private Nodo<T> cabeca;
        private int tamanho;

        public ListaCircularComCabeca() {
            cabeca = new Nodo<>();
            cabeca.setProximo(cabeca);
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
            cabeca.setProximo(novoNodo);
            tamanho++;
        }

        public void inserirFim(T dado) {
            Nodo<T> novoNodo = new Nodo<>(dado);
            Nodo<T> ultimo = cabeca;

            while (ultimo.getProximo() != cabeca) {
                ultimo = ultimo.getProximo();
            }

            ultimo.setProximo(novoNodo);
            novoNodo.setProximo(cabeca);
            tamanho++;
        }

        public void removerInicio() {
            if (vazia()) {
                return;
            }

            Nodo<T> primeiro = cabeca.getProximo();
            cabeca.setProximo(primeiro.getProximo());
            tamanho--;
        }

        public void removerFim() {
            if (vazia()) {
                return;
            }

            Nodo<T> anterior = cabeca;
            Nodo<T> atual = cabeca.getProximo();

            while (atual.getProximo() != cabeca) {
                anterior = atual;
                atual = atual.getProximo();
            }

            anterior.setProximo(cabeca);
            tamanho--;
        }

        public void imprimir() {
            if (vazia()) {
                System.out.println("A lista está vazia.");
                return;
            }

            Nodo<T> atual = cabeca.getProximo();

            while (atual != cabeca) {
                System.out.print(atual.getDado() + " ");
                atual = atual.getProximo();
            }

            System.out.println();
        }

        private static class Nodo<T> {
            private T dado;
            private Nodo<T> proximo;

            public Nodo() {
                this.dado = null;
                this.proximo = null;
            }

            public Nodo(T dado) {
                this.dado = dado;
                this.proximo = null;
            }

            public T getDado() {
                return dado;
            }

            public void setDado(T dado) {
                this.dado = dado;
            }

            public Nodo<T> getProximo() {
                return proximo;
            }

            public void setProximo(Nodo<T> proximo) {
                this.proximo = proximo;
            }
        }
    }

}
