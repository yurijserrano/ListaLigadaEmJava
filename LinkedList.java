/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Serrano
 */
public class LinkedList<E>
        implements PositionList<E> {

    private Node<E> header; // início da lista ligada
    private int size;       // quantidade de elementos na lista ligada

    public LinkedList() {
        // inicializa a lista como vazia
        header = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Position<E> first() {
        return header;
    }

    public Position<E> last() {
        Node n;
        if (header == null) // lista está vazia
        {
            return null;
        }
        for (n = header; n.getNext() != null; n = n.getNext()); // percorre a lista até encontrar o último elemento
        return n;
    }

    public Position<E> next(Position<E> p)
            throws InvalidPositionException, BoundaryViolationException {
    // Devolve, caso exista, a próxima posição a partir de p    

        if (p == null) // Se posição não contém referência válida
            throw new InvalidPositionException();
        else if (((Node) p).getNext() == null) // Se não existe próximo elemento
                    new BoundaryViolationException();
        return ((Node) p).getNext();

    }

    public E set(Position<E> p, E e) throws InvalidPositionException {
        // Para uma posição válida, altera o elemento desta posição
        if (p == null) // Se posição é inválida
        {
            throw new InvalidPositionException();
        }
        E el = p.element();
        ((Node) p).setElement(e);
        return el;
    }

    public void addFirst(E e) {
        // Adiciona um novo elemento no início da lista
        Node n = new Node(e);
        n.setNext(header);
        header = n;
        size++;
    }

    public void addLast(E e) {
        // Adiciona um elemento no final da lista
        if (header==null){ // Se a lista está vazia
            Node n = new Node(e);
            n.setNext(header);
            header = n;
        }
        else { // Percorre a lista até o final para inserir
               Node n=(Node) last();
               Node nw=new Node(e);
               n.setNext(nw);
        }
        size++;
    }

    public void addAfter(Position<E> p, E e) throws InvalidPositionException {
        // Adiciona o elemento e imediatamente após uma posição p válida
        if (p==null)  // Se a posição não é valida
            throw new InvalidPositionException();
        else{
            Node n = new Node(e);
            n.setNext(((Node)p).getNext());
            ((Node)p).setNext(n);
        }
        size++;
    }

    public void addBefore(Position<E> p, E e) throws InvalidPositionException {
        // Adiciona o elemento e imediatamente antes de uma posição p válida
        if (p==null)  // Se a posição não é valida
            throw new InvalidPositionException();
        else if (p==header) // Se a posição é cabeça da lista
                 addFirst(e);
              else { // Posição está no meio da lista
                Node ant;
                for (ant = header; ant.getNext() != p; ant = ant.getNext()); // Localiza elemento anterior a p
                addAfter(ant,e);
              }
        
    }

    public E remove(Position<E> p) throws InvalidPositionException {
        // Remove uma posição p válida e devolve o elemento armazenado na posição removida
        E elem;
        if (p==null || header==null)  // Se a posição não é valida ou lista está vazia
            throw new InvalidPositionException();
        elem=p.element();
        if (p==header) // remoção do primeiro elemento da lista
            header=header.getNext();
        else {  // remoção de outros nós diferentes do primeiro elemento
              Node ant; 
              for (ant = header; ant.getNext() != p; ant = ant.getNext()); // Localiza elemento anterior a p
              ant.setNext(ant.getNext());
             }
        size--;
        return elem;
    }
}
