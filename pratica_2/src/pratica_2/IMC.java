package pratica_2;

import javax.swing.JOptionPane;

public class IMC {

	public static void main(String[] args) {

		String input1 = JOptionPane.showInputDialog("Informe seu Peso para calcular o IMC: ");
		String input2 = JOptionPane.showInputDialog("Informe sua altura para calular o IMC: ");

		double peso = Double.parseDouble(input1);
		double altura = Double.parseDouble(input2);

		double imc = peso / (altura * altura);

		if (imc < 20) {
			JOptionPane.showMessageDialog(null, "Situação: Abaixo do Peso!");

		} else if (imc < 25) {
			JOptionPane.showMessageDialog(null, "Situação: Normal!");
		} else if (imc < 30) {
			JOptionPane.showMessageDialog(null, "Situação: Sobrepeso!");
		} else if (imc < 40) {
			JOptionPane.showMessageDialog(null, "Situação: Obesidade!");
		} else {
			JOptionPane.showMessageDialog(null, "Situação: Obesidade Mórbida!");
		}
	}

}
