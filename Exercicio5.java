
import javax.swing.JOptionPane;

/**
 *
 * @author Serrano
 */
public class Exercicio5 {

    public static void main(String[] args) throws InvalidPositionException, BoundaryViolationException {
        
        int qtdCidades = Integer.valueOf(JOptionPane.showInputDialog("Qual cidade deseja cadastrar?"));
        if (qtdCidades > 0) {
            LinkedList<Node> listaLigada = new LinkedList<Node>();
            for (int i = 0; i < qtdCidades; i++) {
                Cidades cidade1 = new Cidades();
                cidade1.setCidade(JOptionPane.showInputDialog("Informe a cidade: [" + (i + 1) + "]"));
                cidade1.setLatitude(Integer.valueOf(JOptionPane.showInputDialog("Latitude: [" + (i + 1) + "]")));
                cidade1.setLongitude(Integer.valueOf(JOptionPane.showInputDialog("Longitude: [" + (i + 1) + "]")));
                Node<Cidades> node1 = new Node<Cidades>(cidade1);
                if (i > 0) {
                    listaLigada.last().element().setNext(node1);
                }
                listaLigada.addLast(node1);
                JOptionPane.showMessageDialog(null, "Cadastrada!\n" + node1.element());
            }
            Node currentNode = listaLigada.first().element();
            Cidades cid = (Cidades) currentNode.element();
            if (listaLigada.size() > 2) {
                for (int i = 2; i < listaLigada.size(); i++) {
                    currentNode = (Node) listaLigada.next(currentNode);
                    cid = (Cidades) currentNode.element();
                }
            }
            JOptionPane.showMessageDialog(null, cid);

        }
    }
}