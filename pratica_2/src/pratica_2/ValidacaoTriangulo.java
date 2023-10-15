package pratica_2;

import javax.swing.JOptionPane;

public class ValidacaoTriangulo {

	public static boolean tringulo(double x, double y, double z) {
		if(y - z < x && x < y + z && x - z < y && y < x + z && x - y < z && z < x + y) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("Informe o valor do X:");
		String input2 = JOptionPane.showInputDialog("Informe o valor do Y:");
		String input3 = JOptionPane.showInputDialog("Informe o valor do Z:");

		double x = Double.parseDouble(input1);
		double y = Double.parseDouble(input2);
		double z = Double.parseDouble(input3);

		tringulo(x, y, z);
		
		if(tringulo(x, y, z)) {
			JOptionPane.showMessageDialog(null, "O triângulo pode ser formado!!");
		}else {
			JOptionPane.showMessageDialog(null, "O triângulo não pode ser formado!!");
		}
	}

}
