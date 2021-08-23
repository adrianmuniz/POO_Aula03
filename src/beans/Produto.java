package beans;

public class Produto {
	private String descricao;
	private String marca;
	private float valor;
	private boolean promocao;
	
	public Produto() {};
	public Produto(String descricao, String marca) {
		this.descricao = descricao;
		this.marca = marca;
	}
	
	public Produto(String descricao, float valor) {
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public Produto(String descricao, String marca, float valor) {
		super();
		this.descricao = descricao;
		this.marca = marca;
		this.valor = valor;
	}
	
	public Produto(String descricao, String marca, float valor, boolean promocao) {
		super();
		this.descricao = descricao;
		this.marca = marca;
		this.valor = valor;
		this.promocao = promocao;
	}
	
	// getters e setters
	
	//setters = acessar, atribuir
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	// getters = retornar
	public String getDescricao() {
		return descricao;
	}
	
	
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		if (valor < 0) {
			this.valor = 0;
		} else {
			this.valor = valor;
		}
	}
	
	public boolean isPromocao() {
		return promocao;
	}
	public void setPromocao(boolean promocao) {
		this.promocao = promocao;
	}
	public String detalhe() {
		return "Produto:" + descricao + " - Marca:" + marca + " - Preço: " + valor + " - Promoção: " + promocao; 
	}
}
