package pratica_1;
import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua primeira nota:");
        double num1 = scanner.nextDouble();
        
        System.out.println("Digite sua segunda nota:");
        double num2 = scanner.nextDouble();
        
       System.out.println("Digite sua terceira nota:");
       double num3 = scanner.nextDouble();
       
       double media_num = (num1 + num2 + num3)/ 3;
       System.out.print("A media é " + media_num);
    }
}
