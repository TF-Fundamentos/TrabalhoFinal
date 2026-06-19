import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int opcao = 0;//Var. 1 switch
        int opcaoCase2 = 0;//Var. 2 switch

        Jogador jogador[] = new Jogador[3];
        //Criando jogadores para o switch case 2
        jogador[0] = new Jogador("Thiikkj", "Naruto", 4, 3, 9, 4.3333333);
        jogador[1] = new Jogador("leleco", "Itachi", 99, 1, 23, 122.0);
        jogador[2] = new Jogador("JoPaReis", "Tsunade", 0, 1, 30, 30.0);
        
        
        
        do{
        System.out.println("Gerenciamento de campeonato de Valorant");
        System.out.println("1. cadasrar equipe");
        System.out.println("2. ver estatisticas de jogador");
        System.out.println("3. ver próxima partida");
        System.out.println("4. sair");
         opcao = scanner.nextInt();

            switch (opcao) {
            case 1:
                System.out.print("Digite o nome e a tag da equipe: ");
                Equipe equipe = new Equipe(scanner.next(), scanner.next(), null);

                System.out.println("Equipe " + equipe.getNome() + " cadastrada com sucesso!");

                System.out.println("Cadastro de jogadores para a equipe " + equipe.getNome());

                System.out.print("Digite o nome e o agente do jogador: ");
                
                
                System.out.println("Jogador " + jogador[0].getNickname() + " cadastrado com sucesso na equipe " + equipe.getNome());

                break;

            case 2:
                
                while (opcaoCase2 != 1){
                System.out.println("\nJogadores Disponíveis: ");
                    
                //aqui vai agregar um número para cada jogador, para o usuário escolher qual jogador ele quer ver as estatísticas.
                     for (int i = 0; i < jogador.length; i++){
                    System.out.println("Número: " + i + " - " + jogador[i].getNickname());
                   }

                //Escolhe o número do jogador para ver as estatísticas
                    System.out.println("\nEscolha o número do jogador para ver suas estatísticas: "); 
                    int i= scanner.nextInt();

                    System.out.println(jogador[i].toString());
                

                System.out.println("1. " + "Sair.");
                System.out.println("2. " + "Ver estatísticas de outro jogador.");
                opcaoCase2 = scanner.nextInt();

                switch (opcaoCase2) {
                    case 1: 
                    
                        System.out.println("Saindo...");
                        break;

                    case 2:
                        System.out.println("Carregando...");
                        break;
                    


                default:
                    System.out.println(")Opção inválida");
                }
            }
                
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
            
        }while(opcao!= 4);
        scanner.close();
        random.doubles();
        
    }
}

