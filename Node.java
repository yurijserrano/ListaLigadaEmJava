/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Serrano
 */
public class Node<E>
        implements Position<E> {

    private E element;	// elemento armazenado no nó
    private Node next;	// próximo elemento da lista

    public Node(E element) {
        this.element = element;
        this.next = null;
    }

    public E element() {
        // Devolve o elemento armazenado no nó
        return element;
    }
    public Node getNext(){
        // Devolve o próximo elemento do nó
        return next;
    }
    
    public void setNext(Node no) {
        // Altera o apontador next do nó para um novo nó n
        this.next = no;
    }

    public void setElement(E e) {
        // Altera elemento armazenado no nó
        this.element = e;
    }

}
