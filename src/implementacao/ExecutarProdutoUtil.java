package implementacao;

import beans.Produto;
import util.input;

public class ExecutarProdutoUtil {

	public static void main(String[] args) {
		
		Produto listaCompra = new Produto(input.texto("Descricao"), 				input.texto("Marca"), 
				input.decimal("Valor"), 
				input.logico("Promo��o: "));
		
		System.out.println(listaCompra.detalhe());
	}

}
