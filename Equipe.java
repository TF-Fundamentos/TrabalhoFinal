public class Equipe {
    private String nome;
    private String tag;
    private Jogador[] jogadores;
    private int quantidadeJogadores;

    //Construtor padrão (com parâmetros)
    public Equipe(String nome, String tag) {
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
}