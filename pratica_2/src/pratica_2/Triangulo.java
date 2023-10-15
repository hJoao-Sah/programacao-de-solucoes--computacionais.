package pratica_2;
import javax.swing.JOptionPane;


public class Triangulo {

	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("Informe o lado esquerdo do Triângulo: ");
		String input2 = JOptionPane.showInputDialog("Informe o lado direito do Triângulo: ");
		String inptu3 = JOptionPane.showInputDialog("Informe a base do Triângulo: ");
		
		double num1 = Double.parseDouble(input1);
		double num2 = Double.parseDouble(input2);
		double num3 = Double.parseDouble(inptu3);
		
		if(num1 == num2 && num2 == num3) {
			JOptionPane.showMessageDialog(null, "É um triângulo Equilátero!!");
		
		}else if(num1 == num2 || num2 == num3 || num1 == num3) {
			JOptionPane.showMessageDialog(null ,"É um triângulo Isósceles!!");
		}else {
			JOptionPane.showMessageDialog(null, "É um triângulo Escaleno!!");
		}
	}
	
}


//import java.util.Scanner;
//public class Triangulo {
//
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("Informe os lado do triangulo: ");
//		
//		double lado1, lado2, lado3;
//		
//		lado1 = input.nextDouble();
//		lado2 = input.nextDouble();
//		lado3 = input.nextDouble();
//		
//		if(lado1 == lado2 && lado2 == lado3) {
//			System.out.println("Eh um triângulo Equilátero:");
//			
//		}else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
//			System.out.println("Eh um triângulo Isósceles:");
//		}else {
//			System.out.println("Eh um triângulo Escaleno:");
//		}
//	
//
//	}
//
//}
