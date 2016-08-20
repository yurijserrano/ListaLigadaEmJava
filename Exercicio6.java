
import javax.swing.JOptionPane;

/**
 *
 * @author Serrano
 */
public class Exercicio6 {
    public static void main(String[] args) throws InvalidPositionException, BoundaryViolationException {
		int qtdCidades = Integer.valueOf(JOptionPane.showInputDialog("Quantas cidades deseja cadastrar?"));
		
                if (qtdCidades > 0) {
			LinkedList<Node> listaLigada = new LinkedList<Node>();
			
                        for (int i = 0; i < qtdCidades; i++){
				Cidades cidade1 = new Cidades();
				cidade1.setCidade(JOptionPane.showInputDialog("Informe a cidade: ["+(i+1)+"]"));
				cidade1.setLatitude(Integer.valueOf(JOptionPane.showInputDialog("Latitude: ["+(i+1)+"]")));
				cidade1.setLongitude(Integer.valueOf(JOptionPane.showInputDialog("Longitude: ["+(i+1)+"]")));
				Node<Cidades> node1 = new Node<Cidades>(cidade1);
				
                                if (i > 0) {
					listaLigada.last().element().setNext(node1);
				}
				listaLigada.addLast(node1);
				JOptionPane.showMessageDialog(null, "Cidade "+node1.element()+" cadastrada!\n");
			}
			LinkedList<Node> listaInvertida = new LinkedList<Node>();
			StringBuffer sb = new StringBuffer();
			Node currentNode;
			
                        for (int i = 1; i < listaLigada.size(); i++){
				currentNode = listaLigada.first().element();
				
                                for (int j = listaLigada.size(); j > i; j--) {
					currentNode = (Node) listaLigada.next(currentNode);
					listaInvertida.addLast(currentNode);
				}
				sb.append(currentNode.element());
				sb.append("\r\n\r\n");
			}
			currentNode = listaLigada.first().element();
			listaInvertida.addLast(currentNode);
                }
}
}