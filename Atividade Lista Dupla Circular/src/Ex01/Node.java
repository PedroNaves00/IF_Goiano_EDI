package Ex01;

public class Node<T extends Comparable<T>> {
    private T elemento;
    private Node<T> proximo, anterior;


    public Node(T elemento) {
        this.elemento = elemento;
        this.anterior = null;
        this.proximo = null;
    }

    public Node(T elemento, Node proximo, Node anterior) {
        this.elemento = elemento;
        this.anterior = anterior;
        this.proximo = proximo;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }

    public Node getAnterior() {
        return anterior;
    }

    public void setAnterior(Node anterior) {
        this.anterior = anterior;
    }

}

