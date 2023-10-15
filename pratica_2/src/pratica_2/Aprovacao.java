package pratica_2;
import javax.swing.JOptionPane;

public class Aprovacao {

    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Informe a primeira nota:");
        String input2 = JOptionPane.showInputDialog("Informe a segunda nota:");

        
        int n1 = Integer.parseInt(input1);
        int n2 = Integer.parseInt(input2);

        double media = (n1 + n2) / 2;

        if (media >= 7) {
            JOptionPane.showMessageDialog(null, "Aprovado!!!");
        } else {
            JOptionPane.showMessageDialog(null, "Reprovado!!!");
        }
    }
}

//import java.util.Scanner;
//
//public class Aprovacao {
//	
//	public static void main(String[] args) {
//	Scanner input = new Scanner(System.in);
//	
//	System.out.println("Informe suas notas: ");
//		int n1, n2;
//	
//		n1 = input.nextInt();
//		n2 = input.nextInt();
//		double media =  n1 + n2 / 2;
//	
//		if(media >= 7) {
//		
//			System.out.println("Aprovado!!!");
//		}else {
//		
//			System.out.println("Reprovado!!!");
//		}
//
//	}
//
//}
