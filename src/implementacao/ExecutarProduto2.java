package implementacao;

import javax.swing.JOptionPane;

import beans.Produto;

public class ExecutarProduto2 {

	public static void main(String[] args) {
		
		int resp;
		Produto impressora = new Produto() {};
		
		impressora.setDescricao("Deskjet");
		System.out.println(impressora.getDescricao());
		
		impressora.setDescricao(JOptionPane.showInputDialog("Descricao"));
		impressora.setMarca(JOptionPane.showInputDialog("Marca"));
		impressora.setValor(Float.parseFloat(JOptionPane.showInputDialog("Preço")));
		impressora.setPromocao(false);
		resp = JOptionPane.showConfirmDialog(null, "Promoção?", "Digite", JOptionPane.YES_NO_OPTION);
		
		if (resp == 0) {
			impressora.setPromocao(true);
		}
		
		System.out.println(impressora.detalhe());
	}

}
