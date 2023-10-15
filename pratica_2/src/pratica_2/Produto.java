package pratica_2;

import javax.swing.JOptionPane;

public class Produto {

	public static void main(String[] args) {

		String input1 = JOptionPane.showInputDialog("Informe o codigo do Produto:");

		double codigo = Double.parseDouble(input1);

		if (codigo == 1) {
			JOptionPane.showMessageDialog(null, "O sapato custa: R$99,99");
		} else if (codigo == 2) {
			JOptionPane.showMessageDialog(null, "A bolsa custa: R$103,99");
		} else if (codigo == 3) {
			JOptionPane.showMessageDialog(null, "A camisa custa: R$49,98");
		} else if (codigo == 4) {
			JOptionPane.showMessageDialog(null, "A calça custa: R$89,72");
		} else if (codigo == 5) {
			JOptionPane.showMessageDialog(null, "A blusa custa: R$97,35");
		}else {
			JOptionPane.showMessageDialog(null, "Codigo informado não existe.");
			JOptionPane.showMessageDialog(null, "Tente novamente.");
		}
	}

}
