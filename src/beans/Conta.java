package beans;

public class Conta {

	private int numeroConta;
	private double saldo;
	private double limiteEspecial;
	private String tipoConta;
	private String cliente;
	
	public Conta() {}

	public Conta(int numeroConta, double limiteEspecial, String tipoConta, String cliente) {
		super();
		this.numeroConta = numeroConta;
		this.limiteEspecial = limiteEspecial;
		this.tipoConta = tipoConta;
		this.cliente = cliente;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimiteEspecial() {
		return limiteEspecial;
	}

	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double saque (double quantidade) {
		if (quantidade > limiteEspecial) {
			System.out.println("Sem saldo");
		}
		System.out.println("Sucesso");
		return saldo -= quantidade;
	}
	
	public double deposito (double quantidade) {
		return saldo += quantidade;
	}
	
	public double definirLimite(double limite) {
		if (tipoConta.equalsIgnoreCase("Corrente") && limite >= 0.0) {
			System.out.println("Sucesso");
			return limiteEspecial = limite;
		}
		System.out.println("Tipo de Conta inválida");
		return limiteEspecial = limite;
	}
	
	public String extrato() {
		return "Número da conta: " + numeroConta + " - Saldo: " + saldo + " - Limite especial: " + limiteEspecial;
	}
	
}
