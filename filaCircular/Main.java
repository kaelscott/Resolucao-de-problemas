package filaCircular;

public class Main {
    public static void main(String[] args) {
        FilaCircular<Integer> fila = new FilaCircular<>(5);

        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);
        fila.enqueue(40);

        System.out.println("Removido: " + fila.dequeue()); // Removido: 10

        fila.enqueue(50);

        System.out.println("Fila cheia? " + fila.isFull()); // Fila cheia? false

        fila.enqueue(60);

        System.out.println("Fila cheia? " + fila.isFull()); // Fila cheia? true

        while (!fila.isEmpty()) {
            System.out.println("Removido: " + fila.dequeue());
        }

        System.out.println("Fila vazia? " + fila.isEmpty()); // Fila cheia? true

        fila.dequeue(); // Fila vazia
    }
}
