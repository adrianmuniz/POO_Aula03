package implementacao;

import beans.Produto;

public class ExecutarProduto {

	public static void main(String[] args) {
		System.out.println("Aula 03");
		
		Produto micro = new Produto("dell", "Notebook");
		
		System.out.println(micro.detalhe());
		
		Produto tv = new Produto();
		tv.setDescricao("UltraSin");
		tv.setMarca("Samsung");
		System.out.println(tv.detalhe());
		
		Produto impressora = new Produto("HP DeskInk", 250.0f);
		
		System.out.println(impressora.detalhe());
		System.out.println(impressora.getValor());
		
		Produto game = new Produto("PS5", "Sony", 4000f);
		System.out.println(game.detalhe());
		System.out.println(game.getValor());
		
	}

}
