public class Ex03 {
    public static class ListaCircular<T extends Comparable<T>> {
        private Nodo<T> cabeca;
        private int tamanho;

        public ListaCircular() {
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
                cabeca = novoNodo;
            } else {
                novoNodo.setProximo(cabeca);
                Nodo<T> ultimo = cabeca;
                while (ultimo.getProximo() != cabeca) {
                    ultimo = ultimo.getProximo();
                }
                ultimo.setProximo(novoNodo);
                cabeca = novoNodo;
            }

            tamanho++;
        }

        public void inserirFim(T dado) {
            Nodo<T> novoNodo = new Nodo<>(dado);

            if (vazia()) {
                novoNodo.setProximo(novoNodo);
                cabeca = novoNodo;
            } else {
                novoNodo.setProximo(cabeca);
                Nodo<T> ultimo = cabeca;
                while (ultimo.getProximo() != cabeca) {
                    ultimo = ultimo.getProximo();
                }
                ultimo.setProximo(novoNodo);
            }

            tamanho++;
        }

        public int contarElementos() {
            if (vazia()) {
                return 0;
            }

            int count = 1;
            Nodo<T> atual = cabeca.getProximo();

            while (atual != cabeca) {
                count++;
                atual = atual.getProximo();
            }

            return count;
        }
        public void concatenar(ListaCircular<T> outraLista) {
            if (outraLista.vazia()) {
                return;
            }

            if (vazia()) {
                cabeca = outraLista.cabeca;
            } else {
                Nodo<T> ultimo = cabeca;
                while (ultimo.getProximo() != cabeca) {
                    ultimo = ultimo.getProximo();
                }
                ultimo.setProximo(outraLista.cabeca);
            }

            tamanho += outraLista.tamanho;
        }

        private void ordenarLista() {
            if (vazia() || tamanho == 1) {
                return;
            }

            Nodo<T> atual = cabeca;
            do {
                Nodo<T> proximo = atual.getProximo();
                while (proximo != cabeca) {
                    if (atual.getDado().compareTo(proximo.getDado()) > 0) {
                        T temp = atual.getDado();
                        atual.setDado(proximo.getDado());
                        proximo.setDado(temp);
                    }
                    proximo = proximo.getProximo();
                }
                atual = atual.getProximo();
            } while (atual != cabeca);
        }
        public ListaCircular<T> copiar() {
            ListaCircular<T> novaLista = new ListaCircular<>();
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
    }
    }

    class Nodo<T> {
        private T dado;
        private Nodo<T> proximo;

        public Nodo(T dado) {
            this.dado = dado;
            this.proximo = null;
        }

        public T getDado() {
            return dado;
        }

        public Nodo<T> getProximo() {
            return proximo;
        }

        public void setProximo(Nodo<T> proximo) {
            this.proximo = proximo;
        }
        public void setDado(T dado) {
            this.dado = dado;
        }
    }





