

/**
 *
 * @author Serrano
 */
public class Exercicio2 {

    public static void main(String args[]) {

        LinkedList cidades = new LinkedList();
        Cidades cidade1 = new Cidades("São Paulo", 5, 40);
        Cidades cidade2 = new Cidades("Londrina", -20, -50);
        Cidades cidade3 = new Cidades("Espírito Santo", 10, -80);
        Cidades cidade4 = new Cidades("Ourinhos", 15, 20);
        Cidades cidade5 = new Cidades("São Vicente", -33, 13);

        cidades.addFirst(cidade1);
        cidades.addLast(cidade2);
        cidades.addLast(cidade3);
        cidades.addLast(cidade4);
        cidades.addLast(cidade5);

    }
}
