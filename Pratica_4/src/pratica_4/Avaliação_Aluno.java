package pratica_4;

import javax.swing.JOptionPane;

public class Avaliação_Aluno {

    public static void main(String[] args) {
        int alunos_90 = 0, alunos_reprovados = 0, i = 1, aluno = 0;
        double soma_notas = 0, maior_nota = 0, menor_nota = 100;
        String entrada;
        
        do {
            entrada = JOptionPane.showInputDialog(i + "- aluno informe a sua nota: ");
            double nota = Double.parseDouble(entrada);
            
            if (nota < 0) {
                JOptionPane.showMessageDialog(null, "Informamos que o usuário informou uma nota negativa, gentileza digitar novamente.");
                break;
            }
            aluno++;
            entrada = JOptionPane.showInputDialog(i + "- aluno informe a quantidade de faltas: ");
            int faltas = Integer.parseInt(entrada);

            soma_notas += nota;
            
            if (nota >= 90) {
                alunos_90++;
            }
            if (nota < 70 || faltas > 20) {
                alunos_reprovados++;
            }
            if (nota > maior_nota) {
                maior_nota = nota;
            }
            if (nota <= menor_nota) {
                menor_nota = nota;
            }
            entrada = JOptionPane.showInputDialog("Deseja continuar ? (S)im ou (N)ão");
            i++;
        }while(entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));
        
        if (soma_notas > 0) {
            double media = soma_notas / aluno;
            JOptionPane.showMessageDialog(null, "Quantidade de aluno(s) com nota final maior que 90 pontos: " + alunos_90);
            JOptionPane.showMessageDialog(null, "Quantidade de aluno(s) foram reprovados: " + alunos_reprovados);
            JOptionPane.showMessageDialog(null, "A maior nota foi " + maior_nota);
            JOptionPane.showMessageDialog(null, "A menor nota foi " + menor_nota);
            JOptionPane.showMessageDialog(null, "A média de nota foi " + media);
        }
    }
}
