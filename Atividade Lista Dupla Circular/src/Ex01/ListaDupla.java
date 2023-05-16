package Ex01;

public class ListaDupla<T extends Comparable<T>> {
    private Node<T> head;
    private Node<T> tail;
    private int tamanho;

    public ListaDupla() {
        this.head = null;
        this.tail = null;
        this.tamanho = 0;
    }

    public void concatenar(ListaDupla<T> outraLista) {
        // Verifica se a lista atual está vazia
        if (head == null) {
            head = outraLista.head;
            tail = outraLista.tail;
        } else {
            // Verifica se a outra lista está vazia
            if (outraLista.head != null) {
                // Concatena as listas
                tail.setProximo(outraLista.head);
                outraLista.head.setAnterior(tail);
                tail = outraLista.tail;
            }
        }
    }
    public void separar(ListaDupla<T> lista1, ListaDupla<T> lista2) {
        if (head == null) {
            // A lista atual está vazia, não há nada para separar
            return;
        }

        int tamanho = tamanho();

        int tamanhoLista1 = tamanho / 2;
        int tamanhoLista2 = tamanho - tamanhoLista1;

        Node nodoAtual = head;

        // Percorre até o meio da lista
        for (int i = 1; i < tamanhoLista1; i++) {
            nodoAtual = nodoAtual.getProximo();
        }

        // Configura a lista1
        lista1.head = head;
        lista1.tail = nodoAtual;
        lista1.tail.setProximo(null);

        // Configura a lista2
        lista2.head = nodoAtual.getProximo();
        lista2.tail = tail;
        lista2.head.setAnterior(null);

        // Limpa a lista atual
        head = null;
        tail = null;
    }
    public static <T extends Comparable<T>> ListaDupla<T> intercalar(ListaDupla<T> lista1, ListaDupla<T> lista2) {
        ListaDupla<T> listaIntercalada = new ListaDupla<>();

        Node<T> nodoAtualLista1 = lista1.head;
        Node<T> nodoAtualLista2 = (Node<T>) lista2.head;

        while (nodoAtualLista1 != null && nodoAtualLista2 != null) {
            if (nodoAtualLista1.getElemento().compareTo(nodoAtualLista2.getElemento()) <= 0) {
                listaIntercalada.adicionar(nodoAtualLista1.getElemento());
                nodoAtualLista1 = nodoAtualLista1.getProximo();
            } else {
                listaIntercalada.adicionar(nodoAtualLista2.getElemento());
                nodoAtualLista2 = nodoAtualLista2.getProximo();
            }
        }

        while (nodoAtualLista1 != null) {
            listaIntercalada.adicionar(nodoAtualLista1.getElemento());
            nodoAtualLista1 = nodoAtualLista1.getProximo();
        }

        while (nodoAtualLista2 != null) {
            listaIntercalada.adicionar(nodoAtualLista2.getElemento());
            nodoAtualLista2 = nodoAtualLista2.getProximo();
        }

        return listaIntercalada;
    }
    public int tamanho() {
        int tamanho = 0;
        Node nodoAtual = head;

        while (nodoAtual != null) {
            tamanho++;
            nodoAtual = nodoAtual.getProximo();
        }

        return tamanho;
    }
    public void adicionar(T elemento) {
        Node<T> novoNodo = new Node<>(elemento);

        if (head == null) {
            head = novoNodo;
            tail = novoNodo;
        } else {
            tail.setProximo(novoNodo);
            novoNodo.setAnterior(tail);
            tail = novoNodo;
        }
    }
        @Override
        public String toString () {
            return "Ex01.ListaDupla{" +
                    "inicio=" + head +
                    ", fim=" + tail +
                    ", tamanho=" + tamanho +
                    '}';
        }
    }

