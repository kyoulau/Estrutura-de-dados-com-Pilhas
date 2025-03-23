//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pilha<String> pilha = new Pilha<>();

        System.out.println("Pilha vazia ?\n" + pilha.isEmpty());
        System.out.println("\nEmpilhando elementos...");
        pilha.push("Java");
        pilha.push("Python");
        pilha.push("PHP");
        pilha.push("JavaScript");


        System.out.println("Pilha: "+ pilha.toString());
        System.out.println("Tamanho: " + pilha.size());
        System.out.println("Elemento no topo: " + pilha.peek());

        System.out.println("\nDesempilhando elementos...");
        System.out.println("Elemento removido: " + pilha.pop());
        System.out.println("Pilha após pop: " + pilha.toString());

        System.out.println("Pilha vazia? " + pilha.isEmpty());

        System.out.println("\nDemonstrando criação e manipulação direta de nós:");
        No<Integer> no1 = new No<>(10);
        No<Integer> no2 = new No<>(20, no1);
        No<Integer> no3 = new No<>(30, no2);

        System.out.println("Nó 3 -> Nó 2 -> Nó 1");
        System.out.println("Valor do nó 3: "+ no3.element);
        System.out.println("Valor do nó 2: " + no3.next.element);
        System.out.println("Valor do nó 1: " + no3.next.next.element);


    }
}