package implementacao;

import javax.swing.JOptionPane;

import beans.Produto;

public class ExecutarProduto2 {

	public static void main(String[] args) {
		
		Produto impressora = new Produto() {};
		
		impressora.setDescricao("Deskjet");
		System.out.println(impressora.getDescricao());
		
		impressora.setDescricao(JOptionPane.showInputDialog("Descricao"));
		impressora.setMarca(JOptionPane.showInputDialog("Marca"));
		impressora.setValor(Float.parseFloat(JOptionPane.showInputDialog("Pre�o")));
		impressora.setPromocao(Boolean.parseBoolean( JOptionPane.showInputDialog("Promo��o?")));
		
		System.out.println(impressora.detalhe());
	}

}
