
import javax.swing.JOptionPane;

/**
 *
 * @author Serrano
 */
public class Exercicio4 {

    public static void main(String[] args) throws InvalidPositionException, BoundaryViolationException {
        int qtdCidades = Integer.valueOf(JOptionPane.showInputDialog("Quantas cidades deseja cadastrar?"));

        if (qtdCidades > 0) {
            LinkedList<Node> listaLigada = new LinkedList<Node>();

            for (int i = 0; i < qtdCidades; i++) {
                Cidades cidade1 = new Cidades();
                cidade1.setCidade(JOptionPane.showInputDialog("Nome da cidade: [" + (i + 1) + "]"));
                cidade1.setLatitude(Integer.valueOf(JOptionPane.showInputDialog("Latitude: [" + (i + 1) + "]")));
                cidade1.setLongitude(Integer.valueOf(JOptionPane.showInputDialog("Longitude: [" + (i + 1) + "]")));
                Node<Cidades> node1 = new Node<Cidades>(cidade1);

                if (i > 0) {
                    listaLigada.first().element().setNext(node1);
                }
                listaLigada.addFirst(node1);
                JOptionPane.showMessageDialog(null, "Cadastrada!\n" + node1.element());
            }
            String busca = JOptionPane.showInputDialog("Deseja pesquisar alguma cidade? ");
            Node currentNode = listaLigada.last().element();
            Cidades cid = (Cidades) currentNode.element();

            while (currentNode.getNext() != null && !cid.getCidade().equals(busca)) {
                currentNode = (Node) listaLigada.next(currentNode);
                cid = (Cidades) currentNode.element();
            }

            if (cid.getCidade().equals(busca)) {
                JOptionPane.showMessageDialog(null, cid);
            } else {
                JOptionPane.showMessageDialog(null, "Cidade não encontrada! Tente outra vez.");
            }
        }
    }
}
