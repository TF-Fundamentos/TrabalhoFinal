public class Equipe {
    private String nome;
    private String tag;
    private Jogador[] jogadores;
    private int quantidadeJogadores;

    //Construtor padrão (com parâmetros)
    public Equipe(String nome, String tag, Jogador jogadores[]) {
        this.nome = nome;
        this.tag = tag;
        this.jogadores = new Jogador[5];
        this.quantidadeJogadores = 0;
    }

    //Construtor padrão (sem parâmetros)
    public Equipe(){
        this.nome = "";
        this.tag = "";
        this.jogadores = new Jogador[5];
        this.quantidadeJogadores = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getTag() {
        return tag;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public int getQuantidadeJogadores() {
        return quantidadeJogadores;
    }
    
    public void setNome(String nome){
        this.nome= nome;
    }

    public void setTag(String tag){
        this.tag= tag;
    }

    //Adiciona um jogador no próximo espaço livre do vetor
    public boolean adicionarJogador(Jogador jogador) {
        if (quantidadeJogadores >= jogadores.length) {
            System.out.println("A equipe " + nome + " já possui o número máximo de jogadores.");
            return false;
        }
        jogadores[quantidadeJogadores] = jogador;
        quantidadeJogadores++;
        return true;
    }

    public Jogador buscarJogadorPorNickname(String nickname) {
    for (int i = 0; i < quantidadeJogadores; i++) {
        if (jogadores[i].getNickname().equalsIgnoreCase(nickname)) {
            return jogadores[i];
        }
    }
    return null;
    }

    @Override
    public String toString() {
        String tela = ("Nome da equipe: " + nome + "["+ tag +"]");
        tela += "/nQuantidade de jogadores: " + quantidadeJogadores;
        if (quantidadeJogadores == 0) {
            tela += (" Nenhum jogador cadastrado na equipe.");
        } else {
            tela += ("Jogadores da equipe:");
            for (int i = 0; i < quantidadeJogadores; i++) {
                tela += (jogadores[i].getNickname() + " - " + jogadores[i].getAgente().getNome() + "\n");
            }
            
        }

        return tela;
    }
}