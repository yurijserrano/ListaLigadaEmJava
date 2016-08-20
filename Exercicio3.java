
import javax.swing.JOptionPane;


/**
 *
 * @author Serrano
 */
public class Exercicio3 extends Exercicio2 {

    public static void main(String[] args) {

        int qtdCidades = Integer.valueOf(JOptionPane.showInputDialog("Quantas cidades deseja cadastrar?"));
        
        if (qtdCidades > 0) {
            LinkedList<Node> listaLigada = new LinkedList<Node>();
            Cidades cid = new Cidades();
           
            for (int i = 0; i < qtdCidades; i++) {
                cid.setCidade(JOptionPane.showInputDialog("Nome da Cidade: [" + (i + 1) + "]"));
                cid.setLatitude(Integer.valueOf(JOptionPane.showInputDialog("Latitude: [" + (i + 1) + "]")));
                cid.setLongitude(Integer.valueOf(JOptionPane.showInputDialog("Longitude: [" + (i + 1) + "]")));
                Node<Cidades> node1 = new Node<Cidades>(cid);
               
                if (i > 0) {
                    listaLigada.first().element().setNext(node1);
                }
                listaLigada.addFirst(node1);
                JOptionPane.showMessageDialog(null, "Cidade "+ node1.element() +" cadastrada!" );
            }
        }
    }
}
