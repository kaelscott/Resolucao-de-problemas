public class Main {
    public static void main(String[] args) {
        PilhaEstatica<Integer> pilha = new PilhaEstatica<>(5);

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        System.out.println(pilha.pop()); // 30
        System.out.println(pilha.pop()); // 20

        pilha.clear();

        System.out.println(pilha.isEmpty()); // true
    }
}