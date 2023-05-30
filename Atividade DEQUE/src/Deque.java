import java.util.NoSuchElementException;

public class Deque<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> previous;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.previous = null;
            this.next = null;
        }
    }

    public Deque() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void addFront(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            newNode.next = front;
            front.previous = newNode;
            front = newNode;
        }
        size++;
    }

    public void addRear(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            newNode.previous = rear;
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public T removeFront() {
        if (isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        T data = front.data;
        if (front == rear) {
            front = null;
            rear = null;
        } else {
            front = front.next;
            front.previous = null;
        }
        size--;
        return data;
    }

    public T removeRear() {
        if (isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        T data = rear.data;
        if (front == rear) {
            front = null;
            rear = null;
        } else {
            rear = rear.previous;
            rear.next = null;
        }
        size--;
        return data;
    }

    public T peekFront() {
        if (isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        return front.data;
    }

    public T peekRear() {
        if (isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        return rear.data;
    }
}
