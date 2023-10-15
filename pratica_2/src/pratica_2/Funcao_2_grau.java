package pratica_2;

import javax.swing.JOptionPane;

public class Funcao_2_grau {

    public static void validacao(double a, double b, double c, double delta, double x1, double x2) {
        if (a == 0 && b == 0 && c == 0) {
            JOptionPane.showMessageDialog(null, "Igualdade confirmada: 0 = 0");
        } else if (a == 0 && b == 0 && c != 0) {
            JOptionPane.showMessageDialog(null, "Coeficientes informados incorretamente");
        } else if (a == 0 && b != 0) {
            JOptionPane.showMessageDialog(null, "Esta é uma equação de primeiro grau. X:" + (-c / b));
        } else if (a != 0) {
            JOptionPane.showMessageDialog(null, "Esta é uma equação de segundo grau");

            if (delta < 0) {
                JOptionPane.showMessageDialog(null, "Esta equação não possui raízes reais");
            } else if (delta == 0) {
                JOptionPane.showMessageDialog(null, "Esta equação possui duas raízes reais iguais");
                JOptionPane.showMessageDialog(null, "X = " + String.format("%.2f", -b / (2 * a)));
            } else {
                JOptionPane.showMessageDialog(null, "Esta equação possui duas raízes reais diferentes.");
                JOptionPane.showMessageDialog(null, "X1 = " + String.format("%.2f", x1));
                JOptionPane.showMessageDialog(null, "X2 = " + String.format("%.2f", x2));
            }
        }
    }

    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Informe o valor de a:");
        String input2 = JOptionPane.showInputDialog("Informe o valor de b:");
        String input3 = JOptionPane.showInputDialog("Informe o valor de C:");

        Double a = Double.parseDouble(input1);
        Double b = Double.parseDouble(input2);
        Double c = Double.parseDouble(input3);

        double delta = (b * b) - 4 * a * c;
        double raizQuadrada = Math.sqrt(delta);
        double x1 = (-b + raizQuadrada) / (2 * a);
        double x2 = (-b - raizQuadrada) / (2 * a);

        validacao(a, b, c, delta, x1, x2);
    }
}
