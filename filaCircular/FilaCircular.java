package filaCircular;

public class FilaCircular<T> {
    private int base = 0; // primeiro da fila
    private int top = -1; // topo da pilha (-1 pq a pilha está vazia)
    private int size = 0; // numero de elementos na fila
    private T[] data;     // array generico

    public FilaCircular(int capacity) {
        data = (T[]) new Object[capacity];
    }

    public void enqueue(T item) { // adiciona item no topo
        if (isFull()) {
            System.out.println("Fila cheia");
            return;
        }
        top = (top + 1) % data.length; // faz a fila circular
        data[top] = item; // adiciona o item no topo
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Fila vazia");
            return null;
        }
        T item = data[base]; // pega o primeiro da fila
        base = (base + 1) % data.length; // faz a fila circular
        size--;
        return item;
    }

    public void clear() {
        base = 0;
        top = -1;
        size = 0;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}