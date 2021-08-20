package implementacao;

import beans.Produto;

public class ExecutarProduto {

	public static void main(String[] args) {
		System.out.println("Aula 03");
		
		Produto micro = new Produto("dell", "Notebook");
		
		//micro.setDescricao("Monitor 25p");
		//micro.setMarca("Samsung");
		System.out.println(micro.detalhe());

	}

}
