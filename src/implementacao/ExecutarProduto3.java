package implementacao;

import javax.swing.JOptionPane;

import beans.Produto;

public class ExecutarProduto3 {

	public static String texto(String msg) {
		return JOptionPane.showInputDialog(msg);
	}
	
	public static float decimal (String msg) {
		return Float.parseFloat(texto("pre�o"));
	}
	
	public static void main(String[] args) {
	
		Produto note = new Produto(texto("Descricao"),
				texto("Marca"), 				Float.parseFloat(texto("Pre�o")),
				Boolean.parseBoolean(texto("Promo��o")));

		System.out.println(note.detalhe());
	}

}
