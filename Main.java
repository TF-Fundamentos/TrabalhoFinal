import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int opcao = 0;//Var. 1 switch
        int opcaoCase3 = 0;//Var. case 3 switch
        
        Equipe equipe []= new Equipe[2]; //numero temporario
        Jogador jogador[] = new Jogador[4];//numero temporario
       

        do{
        //Menu principal do programa
        System.out.println("\n======Gerenciamento de campeonato de Valorant======");
        System.out.println("1. Cadasrar Equipe.");
        System.out.println("2. Listar Equipe.");
        System.out.println("3. Editar Equipe.");
        System.out.println("4. Buscar Equipe.");
        System.out.println("5. Cadasrar Jogador.");
        System.out.println("6. Listar Jogador.");
        System.out.println("7. Editar Jogador.");
        System.out.println("8. Buscar Jogador.");
        System.out.println("9. Exibir estatisticas de jogador.");
        System.out.println("10. Gerar equipes balanceadas.");
        System.out.println("11. Sair.");


         opcao = scanner.nextInt();
            

            switch (opcao) {

            //Esse if verifica se já existem 2 equipes cadastradas, caso sim, não permite cadastrar mais equipes.
            case 1:
                if (equipe[1] != null){
                    System.out.println("====Já existem 2 equipes cadastradas, não é possível cadastrar mais equipes.====");
                  
                }else
                for (int i = 0; i < equipe.length; i++){
                System.out.print("Digite o NOME e a TAG da equipe: ");
                System.out.println(" EX: NomeDaEquipe (de enter), TAG");
                 equipe[i] = new Equipe(scanner.next(),(scanner.next()), null);
                
                System.out.println("Equipe " + equipe[i].getNome() + " cadastrada com sucesso!");
                
                }//fim do for equipe
                break;
            

            //Listar equipe, mostrar todas as equipes cadastradas.    
            case 2:
            
            break;


            //Editar equipe. Edita nome, TAG, Jogadores[]        
            case 3:
            
            break;


            //Buscar equipe. Buscar equipe por nome (Especifica), exibe informações da equipe
            case 4:
            
            break;


            //Cadastrar os jogadores + Escolher agente do jogador
            case 5: 
                if(equipe[1]== null){
                    System.out.println("====Nenhuma equipe cadastrada, por favor cadastre uma equipe antes de cadastrar jogadores====");
                    
                }else{
                System.out.println("Cadastro de jogadores para as equipes " + equipe[0].getNome() + " e " + equipe[1].getNome());
                
                for (int i = 0; i < equipe.length; i++){

                for (int j = 0; j < (jogador.length)/2; j++){
                System.out.println("Cadastro de jogadores para a equipe " + equipe[i].getNome());
                 int indice = (i *(jogador.length)/2 ) + j;

                System.out.println("Digite o nickname do jogador: ");
                    jogador [indice] = new Jogador(scanner.next(),null, 0, 0, 0, 0.0);
                
                System.out.println("Digite o agente do jogador: ");
                  //falta fazer.
                

                //Possivelmente temporario, para testar o cadastro de kills, mortes e assistências. E funcionar o ToString do jogador[].    
                System.out.printf("Digite o número de kills, mortes e assistências do jogador %s: ", jogador[indice].getNickname());
                     jogador[indice] = new Jogador(jogador[indice].getNickname(), jogador[indice].getAgente(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), 0.0);
               

                System.out.println("Jogador " + jogador[indice].getNickname() + " cadastrado com sucesso na equipe " + equipe[i].getNome());
                }
                }//fim do for jogaodor
                }//fim do else
                break;
            

            // Mostrar Jogadores cadastrados. Mostrar Nickname, Agente, equipe pertencente.    
            case 6:
            
            break;


            //Editar jogadores. Permite editar dados como nickname, equipe, e agente.
            case 7:
            
            break;


            //Buscar Jogador. Mostrar Nickname, Agente, equipe pertencente.
            case 8:
            
            break;


            // Ver as estátisticas de todos os jogadores.
            case 9:    
                while (opcaoCase3 != 1){
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
                opcaoCase3 = scanner.nextInt();

                switch (opcaoCase3) {
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


            //Gerar equipes balanceadas. 
            case 10:
            
            break; 


            case 11:
                System.out.println("Sair");
                break;

            default:
                System.out.println("Opção inválida");
        }
            
        } while(opcao!= 5);
        scanner.close();
        random.doubles();
    }


//Novo metodo para escolher o Agente + Variável para lembrar qual foi a última função impressa
public static int escolherAgente(Scanner scanner, Agente[] agentes) {
    String funcaoAtual = "";

    //Menu (imprime cada agente na tela)
    for (int i = 0; i < agentes.length; i++) {
        if (!agentes[i].getFuncao().equals(funcaoAtual)) {
            funcaoAtual = agentes[i].getFuncao();
            System.out.println("\n--- " + funcaoAtual + "s ---");
        }
        //Imprime o número e o nome do agente        
        System.out.println((i + 1) + " - " + agentes[i].getNome());
    }
        System.out.print("\nEscolha o número do agente: ");
        int escolha = scanner.nextInt();

        while (escolha < 1 || escolha > agentes.length) {
            System.out.print("Opção inválida! Escolha um número entre 1 e " + agentes.length + ": ");
            escolha = scanner.nextInt();
        }

        return escolha - 1;
    }
}
