package implementacao;

import javax.swing.JOptionPane;

import beans.Produto;

public class ExecutarProduto3 {

	public static String texto(String msg) {
		return JOptionPane.showInputDialog(msg);
	}
	
	public static float decimal (String msg) {
		return Float.parseFloat(texto("preço"));
	}
	
	public static void main(String[] args) {
	
		Produto note = new Produto(texto("Descricao"),
				texto("Marca"), 				Float.parseFloat(texto("Preço")),
				Boolean.parseBoolean(texto("Promoção")));

		System.out.println(note.detalhe());
	}

}
