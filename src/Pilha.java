import org.w3c.dom.Node;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Pilha<E> {
    private int size;
    private No<E> top;

//    A classe Pilha agora utiliza uma referência ao tipo Node<E> para o topo
//    A notação Node<E> indica que queremos nós que armazenem o mesmo tipo de dados da pilha

    public Pilha() {
        this.size = 0;
        this.top  = null;
    }

    //isEmpty()
    public boolean isEmpty(){
        return top == null;
    }

    //size()
    public int size(){
        return size;
    }

    //peek() -> retorna elemento do nó da fila
    public E peek(){
        if(isEmpty()){
            throw new EmptyStackException();
      }

        // campo de dados do nó que está no topo da pilha.
        return top.element;
    }


    public E pop(){
        E data = peek();

        top = top.next;
        size --;
        return data;

    }

    public void push(E element) {
        No<E> no = new No<>(element);
        no.next = top;
        top = no;
        size++;
    }

//    public void push(E element){
//        No newNo = new No(element);
//
//        if(isEmpty()){
//            top = newNo;
//        }else{
//            newNo.next = top;
//            top = newNo;
//        }
//
//        size++;
//    }
@Override
public String toString() {
    StringBuilder sb = new StringBuilder("[");
    No<E> current = top;
    while (current != null) {
        sb.append(current.element);
        if (current.next != null) {
            sb.append(", ");
        }
        current = current.next;
    }
    sb.append("]");
    return sb.toString();
}

}
