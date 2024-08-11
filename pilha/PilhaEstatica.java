package pilha;

public class PilhaEstatica<T> { // <T> tipo generico q permite armazenar qlqer tipo de objeto
    private int top = -1; // topo da pilha (-1 pq a pilha está vazia)
    private T[] data; // array generico

    public PilhaEstatica(int size) {
        data = (T[]) new Object[size]; // inicializa o array
    }

    public void push(T item) { // add item no topo da pilha
        if (top < data.length - 1) {
            top++;
            data[top] = item;
        } else { // se a pilha estiver cheia
            System.out.println("Pilha cheia");
        }
    }

    public T pop() { // remove item do topo da pilha
        if (!isEmpty()) {
            T item = data[top];
            top--;
            return item;
        } else {
            System.out.println("Pilha vazia");
            return null;
        }
    }

    public void clear() { // limpa a pilha
        top = -1;
    }

    public boolean isFull() { // verifica se a pilha está cheia
        return top == data.length - 1;
    }

    public boolean isEmpty() { // verifica se a pilha está vazia
        return top == -1;
    }

}
