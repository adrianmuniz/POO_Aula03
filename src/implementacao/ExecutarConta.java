package implementacao;

import javax.swing.JOptionPane;

import beans.Conta;

public class ExecutarConta {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.setNumeroConta(Integer.parseInt(JOptionPane.showInputDialog("Número da Conta")));
		
		conta.setTipoConta(JOptionPane.showInputDialog("Qual o tipo da Conta?"));
		
		conta.setCliente(JOptionPane.showInputDialog("Cliente"));
		
		conta.definirLimite(Double.parseDouble(JOptionPane.showInputDialog("Defina um limite")));

		conta.deposito(Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade do deposito")));
		
		conta.saque(Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade do saque")));
	
		System.out.println(conta.extrato());
		
	}

}
