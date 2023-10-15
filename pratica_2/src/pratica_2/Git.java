package pratica_2;

import java.util.Scanner;

public class Git {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um comando Git (git clone, git fetch ou git pull): ");
        String comando = scanner.nextLine();

        switch (comando) {
            case "git clone":
                System.out.println("Comando: git clone");
                System.out.println("Explicação: O comando 'git clone' é usado para clonar um repositório Git existente em um novo diretório.");
                System.out.println("Exemplo: git clone https://github.com/seu-usuario/seu-repositorio.git");
                break;
            case "git fetch":
                System.out.println("Comando: git fetch");
                System.out.println("Explicação: O comando 'git fetch' é usado para buscar as alterações remotas do repositório Git, mas não mesclá-las automaticamente com a sua cópia local.");
                System.out.println("Exemplo: git fetch origin");
                break;
            case "git pull":
                System.out.println("Comando: git pull");
                System.out.println("Explicação: O comando 'git pull' é usado para buscar as alterações remotas do repositório Git e mesclá-las automaticamente com a sua cópia local.");
                System.out.println("Exemplo: git pull origin master");
                break;
            default:
                System.out.println("Comando não reconhecido. Por favor, digite 'git clone', 'git fetch' ou 'git pull'.");
        }

        
    }
}

