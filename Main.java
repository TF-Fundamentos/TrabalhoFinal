import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int opcao = 0;
        do{
        System.out.println("Gerenciamento de campeonato de Valorant");
        System.out.println("1. cadasrar equipe");
        System.out.println("2. ver estatisticas de jogador");
        System.out.println("3. ver próxima partida");
        System.out.println("4. sair");
        int opcao1 = scanner.nextInt();
        switch (opcao1) {
            case 1:
                System.out.print("Digite o nome e a tag da equipe: ");
                Equipe equipe = new Equipe(scanner.next(), scanner.next(), null);
                System.out.println("Equipe " + equipe.getNome() + " cadastrada com sucesso!");
                System.out.println("Cadastro de jogadores para a equipe " + equipe.getNome());
                System.out.print("Digite o nome e oagente do jogador: ");
                Jogador jogador1 = new Jogador(scanner.next(), scanner.next(), 0, 0, 0, 0);
                System.out.println("Jogador " + jogador1.getNickname() + " cadastrado com sucesso na equipe " + equipe.getNome());

                break;
            case 2:
                System.out.println("Ver estatísticas de jogador");
                break;
            case 3:
                System.out.println("Ver próxima partida");
                break;
            case 4:
                System.out.println("Sair");
                break;
            default:
                System.out.println("Opção inválida");
        }
        }while (opcao != 4);
        scanner.close();
        random.doubles();
    }
}

