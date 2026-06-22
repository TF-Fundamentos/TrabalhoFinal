import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int opcao = 0;//Var. 1 switch
        int opcaoCase2 = 0;//Var. 2 switch
        
        Equipe equipe []= new Equipe[2]; //numero temporario
        Jogador jogador[] = new Jogador[4];//numero temporario
       
        
        
        do{
        System.out.println("\nGerenciamento de campeonato de Valorant");
        System.out.println("1. cadasrar equipe");
        System.out.println("2. ver estatisticas de jogador");
        System.out.println("3. ver próxima partida");
        System.out.println("4. sair");
         opcao = scanner.nextInt();
            
            switch (opcao) {
            case 1:
                for (int i = 0; i < equipe.length; i++){
                System.out.print("Digite o NOME e a TAG da equipe: ");
                 equipe[i] = new Equipe(scanner.next(), scanner.next(), null);
                
                System.out.println("Equipe " + equipe[i].getNome() + " cadastrada com sucesso!");
                
                //for que cadastra os jogadores, dentro de for equipe pq ccada equipe tem seus jogadores.
                for (int j = 0; j < (jogador.length)/2; j++){
                System.out.println("Cadastro de jogadores para a equipe " + equipe[i].getNome());
                 int indice = (i *(jogador.length)/2 ) + j;

                System.out.println("Digite o nickname e o agente do jogador: ");
                    jogador [indice] = new Jogador(scanner.next(), scanner.next(), 0, 0, 0, 0.0);
               

                //Possivelmente temporario, para testar o cadastro de kills, mortes e assistências. E funcionar o ToString do jogador[].    
                System.out.printf("Digite o número de kills, mortes e assistências do jogador %s: ", jogador[indice].getNickname());
                     jogador[indice] = new Jogador(jogador[indice].getNickname(), jogador[indice].getAgente(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), 0.0);
               

                System.out.println("Jogador " + jogador[indice].getNickname() + " cadastrado com sucesso na equipe " + equipe[i].getNome());
                }//fim do for jogaodor
                }//fim do for equipe
                break;

            case 2:
                
                while (opcaoCase2 != 1){
                    if (jogador[0] == null){
                        System.out.println("Nenhum jogador cadastrado, por favor cadastre um jogador para acessar as estatísticas.");
                        break;
                    }else
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

