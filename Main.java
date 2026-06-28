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
        System.out.print("1. Cadasrar Equipe.");         System.out.println("          7. Editar Jogador.");
        System.out.print("2. Listar Equipe.");           System.out.println("            8. Buscar Jogador.");
        System.out.print("3. Editar Equipe.");           System.out.println("            9. Exibir estatisticas de jogador.");
        System.out.print("4. Buscar Equipe.");           System.out.println("            10. Gerar equipes balanceadas.");
        System.out.print("5. Cadastrar Jogador.");       System.out.println("        11. Sair.");
        System.out.println("6. Listar Jogador.");


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
                 equipe[i] = new Equipe(scanner.next(), scanner.next());
                
                System.out.println("Equipe " + equipe[i].getNome() + " cadastrada com sucesso!");
                
                }//fim do for equipe
                break;
            

            //Listar equipe, mostrar todas as equipes cadastradas.    
            case 2:
                if (equipe[1]==null){
                    System.out.println("Nenhuma equipe cadastrada. Por favor cadastre duas equipe antes.");

                }else{
                int i;
                for(i=0; i<equipe.length; i++){
                    System.out.println("Equipe: " + equipe[i].getNome());
                }
                
                }
            
            break;


            //Editar equipe. Edita nome, TAG, Jogadores[]        
            case 3:
            
            break;


            //Buscar equipe. Buscar equipe por nome (Especifica), exibe informações da equipe
            case 4:
            
            break;


            //Cadastrar os jogadores + Escolher agente do jogador
            case 5: 
                if(equipe[1]== null) {
                    System.out.println("===Nenhuma equipe cadastrada, por favor cadastre as 2 equipes antes de cadastrar jogadores===");
                } else {
                    Agente[] agentes = Agente.listaDeAgentes();
                    
                for (int i = 0; i < equipe.length; i++){
                    System.out.println("\nCadastro de jogadores para a equipe " + equipe[i].getNome());

                    for (int j = 0; j < equipe[i].getJogadores().length; j++) {

                        System.out.println("Digite o nickname do jogador " + (j + 1) + ": ");
                        String nickname = scanner.next();

                        int indiceAgente = escolherAgente(scanner, agentes);
                        Agente agenteEscolhido = agentes[indiceAgente];

                        Jogador novoJogador = new Jogador(nickname, agenteEscolhido, 0, 0, 0);
                        equipe[i].adicionarJogador(novoJogador);

                        System.out.println("Jogador " + nickname + " Cadastrado com sucesso na equipe " + equipe[i].getNome() + "!");
                    }
                }
            }
            break;

            // Mostrar Jogadores cadastrados. Mostrar Nickname, Agente, equipe pertencente.    
            case 6:
            
            break;


            //Editar jogadores. Permite editar dados como nickname, equipe, e agente.
            case 7:
                if (equipe[1] == null) {
                    System.out.println("===Nenhum equipe cadastrada, por favor cadastre as 2 equipes antes de editar jogadores===");
                } else if (equipe[0].getQuantidadeJogadores() == 0 && equipe[1].getQuantidadeJogadores() == 0) {
                    System.out.println("===Nenhum jogador cadastrado ainda. Cadastre jogadores antes de editar===");
                } else {
                    System.out.println("Digite o nickname do jogador que deseja editar: ");
                    String nicknameBusca = scanner.next();

                    Jogador jogadorEncontrado = equipe[0].buscarJogadorPorNickname(nicknameBusca);
                    if (jogadorEncontrado == null) {
                        jogadorEncontrado = equipe[1].buscarJogadorPorNickname(nicknameBusca);
                    }
                    
                    if (jogadorEncontrado == null) {
                        System.out.println("Jogador não encontrado.");
                    } else {
                        System.out.println("Jogador encontrado: " + jogadorEncontrado.toString());

                        System.out.println("Digite o novo nickname do jogador: ");
                        String novoNickname = scanner.next();
                        jogadorEncontrado.setNickname(novoNickname);

                        Agente[] agentes = Agente.listaDeAgentes();
                        System.out.println("Escolha o novo agente do jogador: ");
                        int indiceAgente = escolherAgente(scanner, agentes);
                        jogadorEncontrado.setAgente(agentes[indiceAgente]);

                        System.out.println("Jogador atualizado com sucesso! " + jogadorEncontrado.toString());
                    }
                }
            break;


            //Buscar Jogador. Mostrar Nickname, Agente, equipe pertencente.
            case 8:
                if (equipe[1] == null) {
                    System.out.println("===Nenhuma equipe cadastrada, por favor cadastre as 2 equipes antes de buscar jogadores===");

                } else if (equipe[0].getQuantidadeJogadores() == 0 && equipe[1].getQuantidadeJogadores() == 0) {
                    System.out.println("===Nenhum jogador cadastrado ainda. Cadastre jogadores antes de buscar===");
                } else {
                    System.out.println("Digite o nickname do jogador que deseja buscar: ");
                    String nicknameBuscado = scanner.next();

                    Jogador jogadorBuscado = equipe[0].buscarJogadorPorNickname(nicknameBuscado);
                    String nomeEquipeEncontrada = equipe[0].getNome();

                    if (jogadorBuscado == null) {
                        jogadorBuscado = equipe[1].buscarJogadorPorNickname(nicknameBuscado);
                        nomeEquipeEncontrada = equipe[1].getNome();
                    }

                    if (jogadorBuscado == null) {
                        System.out.println("Jogador não encontrado.");
                    } else {
                        System.out.println("\n--- Jogador encontrado ---");
                        System.out.println("Equipe: " + nomeEquipeEncontrada);
                        System.out.println(jogadorBuscado.toString());
                    }
                }
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
            
        } while(opcao!= 11);
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
