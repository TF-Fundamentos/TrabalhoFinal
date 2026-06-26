public class Equipe {
    private String nome;
    private String tag;
    private Jogador[] jogadores;
    public Equipe(String nome, String tag, Jogador[] jogadores) {
        this.nome = nome;
        this.tag = tag;
        this.jogadores = jogadores;
    }
    public Equipe(){
        this.nome = "";
        this.tag = "";
        this.jogadores = new Jogador[2];
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
}