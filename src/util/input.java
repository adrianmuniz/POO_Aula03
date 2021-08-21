package util;

import javax.swing.JOptionPane;

public class input {
	public static String texto(String msg) {
		return JOptionPane.showInputDialog(msg);
	}
	
	public static float decimal (String msg) {
		return Float.parseFloat(texto("preço"));
	}
	
	public static boolean logico (String msg) {
		if (JOptionPane.showConfirmDialog(null, msg, "Pergunta",JOptionPane.YES_NO_OPTION) == 0) {
			return true;
		}
		return false;
	}
	
}
