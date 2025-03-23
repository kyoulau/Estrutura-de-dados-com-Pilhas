public class No<E> {

    E element;
    No <E> next;

    public No(E element) {
        this.element = element;
        this.next = null;
    }

    //o elemento e a referência para o próximo nó
    public No(E element, No<E> next) {
        this.element = element;
        this.next = next;
    }
}
