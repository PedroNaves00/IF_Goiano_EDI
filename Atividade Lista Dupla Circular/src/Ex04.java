public class Ex04 {
    public static class ListaCircularDuplamenteEncadeada<T extends Comparable<T>> {
        private Nodo<T> cabeca;
        private int tamanho;

        public ListaCircularDuplamenteEncadeada() {
            cabeca = null;
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

            if (vazia()) {
                novoNodo.setProximo(novoNodo);
                novoNodo.setAnterior(novoNodo);
                cabeca = novoNodo;
            } else {
                Nodo<T> ultimo = cabeca.getAnterior();
                novoNodo.setProximo(cabeca);
                novoNodo.setAnterior(ultimo);
                cabeca.setAnterior(novoNodo);
                ultimo.setProximo(novoNodo);
                cabeca = novoNodo;
            }

            tamanho++;
        }

        public void inserirFim(T dado) {
            Nodo<T> novoNodo = new Nodo<>(dado);

            if (vazia()) {
                novoNodo.setProximo(novoNodo);
                novoNodo.setAnterior(novoNodo);
                cabeca = novoNodo;
            } else {
                Nodo<T> ultimo = cabeca.getAnterior();
                novoNodo.setProximo(cabeca);
                novoNodo.setAnterior(ultimo);
                cabeca.setAnterior(novoNodo);
                ultimo.setProximo(novoNodo);
            }

            tamanho++;
        }

        public void concatenar(ListaCircularDuplamenteEncadeada<T> outraLista) {
            if (outraLista.vazia()) {
                return;
            }

            if (vazia()) {
                cabeca = outraLista.cabeca;
            } else {
                Nodo<T> ultimoAtual = cabeca.getAnterior();
                Nodo<T> ultimoOutra = outraLista.cabeca.getAnterior();

                cabeca.getAnterior().setProximo(outraLista.cabeca);
                outraLista.cabeca.setAnterior(ultimoAtual);

                outraLista.cabeca.getAnterior().setProximo(cabeca);
                cabeca.setAnterior(ultimoOutra);
            }

            tamanho += outraLista.tamanho;
        }

        public ListaCircularDuplamenteEncadeada<T> copiar() {
            ListaCircularDuplamenteEncadeada<T> novaLista = new ListaCircularDuplamenteEncadeada<>();
            if (vazia()) {
                return novaLista;
            }

            Nodo<T> atual = cabeca;
            do {
                novaLista.inserirFim(atual.getDado());
                atual = atual.getProximo();
            } while (atual != cabeca);

            return novaLista;
        }

        public void intercalar(ListaCircularDuplamenteEncadeada<T> outraLista) {
            if (outraLista.vazia()) {
                return;
            }

            if (vazia()) {
                cabeca = outraLista.cabeca;
            } else {
                Nodo<T> ultimoAtual = cabeca.getAnterior();
                Nodo<T> primeiroOutra = outraLista.cabeca;

                cabeca.getAnterior().setProximo(outraLista.cabeca);
                outraLista.cabeca.setAnterior(ultimoAtual);

                outraLista.cabeca.getAnterior().setProximo(cabeca);

                cabeca.setAnterior(primeiroOutra);
            }
            tamanho += outraLista.tamanho;

            ordenarLista();
        }

        private void ordenarLista() {
            if (vazia() || tamanho == 1) {
                return;
            }

            boolean trocou;
            Nodo<T> atual;
            Nodo<T> anterior = null;

            do {
                trocou = false;
                atual = cabeca;

                while (atual.getProximo() != anterior) {
                    if (atual.getDado().compareTo(atual.getProximo().getDado()) > 0) {
                        T temp = atual.getDado();
                        atual.setDado(atual.getProximo().getDado());
                        atual.getProximo().setDado(temp);
                        trocou = true;
                    }
                    atual = atual.getProximo();
                }

                anterior = atual;
            } while (trocou);
        }


class Nodo<T> {
    private T dado;
    private Nodo<T> proximo;
    private Nodo<T> anterior;

    public Nodo(T dado) {
        this.dado = dado;
        this.proximo = null;
        this.anterior = null;
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

    public Nodo<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo<T> anterior) {
        this.anterior = anterior;
    }
        }
    }
}



