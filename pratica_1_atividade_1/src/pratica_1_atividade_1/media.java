package pratica_1_atividade_1;
import java.util.Scanner;

public class media {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua primeira nota:");
        int num1 = scanner.nextInt();
        
        System.out.println("Digite sua segunda nota:");
        int num2 = scanner.nextInt();
        
       System.out.println("Digite sua terceira nota:");
       int num3 = scanner.nextInt();
       
       double media_num = (num1 + num2 + num3)/ 3;
       System.out.print("A media é " + media_num);
    }
}
