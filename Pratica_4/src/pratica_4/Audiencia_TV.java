package pratica_4;

import javax.swing.JOptionPane;

public class Audiencia_TV {

	public static void main(String[] args) {
		int i = 1, canal_2 = 0, canal_4 = 0, canal_5 = 0, canal_7 = 0, canal_12 = 0, total_pessoas = 0;
		boolean processamento = true;

		while (processamento) {
			String escolhaInput = JOptionPane.showInputDialog(i + "º casa informe o número do canal: " + "\n1 - Canal 2"
					+ "\n2 - Canal 4" + "\n3 - Canal 5" + "\n4 - Canal 7" + "\n5 - Canal 12" + "\n0 - encerrar");

			int escolha = Integer.parseInt(escolhaInput);

			if (escolha == 0) {
				processamento = false;
			} else {
				String pessoasInput = JOptionPane.showInputDialog("Quantas pessoas estão assistindo o canal? ");
				int pessoas = Integer.parseInt(pessoasInput);

				switch (escolha) {
				case 1:
					canal_2 += pessoas;
					total_pessoas += pessoas;
					break;
				case 2:
					canal_4 += pessoas;
					total_pessoas += pessoas;
					break;
				case 3:
					canal_5 += pessoas;
					total_pessoas += pessoas;
					break;
				case 4:
					canal_7 += pessoas;
					total_pessoas += pessoas;
					break;
				case 5:
					canal_12 += pessoas;
					total_pessoas += pessoas;
					break;
				}
			}
			i++;
		}

		double canal2_percentual = ((double) canal_2 / total_pessoas) * 100;
		double canal4_percentual = ((double) canal_4 / total_pessoas) * 100;
		double canal5_percentual = ((double) canal_5 / total_pessoas) * 100;
		double canal7_percentual = ((double) canal_7 / total_pessoas) * 100;
		double canal12_percentual = ((double) canal_12 / total_pessoas) * 100;

		String mensagem = "A audiência da TV é de " + total_pessoas + " pessoas\n" + "O canal 2 tem " + canal_2
				+ " pessoas. O percentual de audiência é de " + canal2_percentual + "%\n" + "O canal 4 tem " + canal_4
				+ " pessoas. O percentual de audiência é de " + canal4_percentual + "%\n" + "O canal 5 tem " + canal_5
				+ " pessoas. O percentual de audiência é de " + canal5_percentual + "%\n" + "O canal 7 tem " + canal_7
				+ " pessoas. O percentual de audiência é de " + canal7_percentual + "%\n" + "O canal 12 tem " + canal_12
				+ " pessoas. O percentual de audiência é de " + canal12_percentual + "%";

		JOptionPane.showMessageDialog(null, mensagem);
	}
}
