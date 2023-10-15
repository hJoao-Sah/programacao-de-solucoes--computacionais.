package pratica_2;

import javax.swing.JOptionPane;

public class Media {

	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("Informe primeira nota(Entre 1 a 10)");
		String input2 = JOptionPane.showInputDialog("Informe segunda nota(Entre 1 a 10");
		String input3 = JOptionPane.showInputDialog("Informe terceira nota(Entre 1 a 10");

		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		int num3 = Integer.parseInt(input3);

		double media = num1 + num2 + num3 / 3;
		if (num1 > 0 && num1 <= 10 && num2 > 0 && num2 <= 10 && num3 > 0 && num3 <= 10) {

			if (media >= 0 && media < 3) {
				JOptionPane.showMessageDialog(null, "REPROVADO!!!");
			} else if (media >= 3 && media < 7) {
				JOptionPane.showMessageDialog(null, "EXAME!!!");
			} else {
				JOptionPane.showMessageDialog(null, "APROVADO!!!");
			}

		} else {
			JOptionPane.showMessageDialog(null, "É necessário informar as notas entre 1 a 10!!!");
		}
	}

}
