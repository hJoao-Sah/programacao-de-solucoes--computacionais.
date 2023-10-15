package pratica_4;

import javax.swing.JOptionPane;

public class Aprovacao_Alunos {

	public static void main(String[] args) {

		String entrada;
		int i = 1;
		
		entrada = JOptionPane.showInputDialog("Informe sua matricula: ");
		int matricula = Integer.parseInt(entrada);

		do {
			if (matricula < 0) {
				JOptionPane.showMessageDialog(null, "A matricula informada é negativa, gentileza informar novamente.");
				break;
			}
			entrada = JOptionPane.showInputDialog(i + "º aluno informe sua nota: ");
			double nota = Double.parseDouble(entrada);

			if (nota >= 70) {
				JOptionPane.showMessageDialog(null, i + "º aluno foi aprovado!");
			}
			if (nota > 60 && nota < 70) {
				JOptionPane.showMessageDialog(null, i + "º aluno está de recuperação!");
			}
			if (nota < 60) {
				JOptionPane.showMessageDialog(null, i + "º aluno foi reprovado!");
			}
			entrada = JOptionPane.showInputDialog("Deseja continuar ? (S)im ou (N)ão");
			i++;
		} while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));

		System.exit(0);
	}
}
