public class Jogador{

    private String nickname;
    private Agente agente;
    private int kills;
    private int mortes;
    private int assistencias;
    private double kda;

    public Jogador(String nickname, Agente agente, int kills, int mortes, int assistencias) {
        this.nickname = nickname;
        this.agente = agente;
        this.kills = kills;
        this.mortes = mortes;
        this.assistencias = assistencias;
        calcularKda();
    }

    public Jogador(){
        this.nickname = "";
        this.agente = new Agente();
        this.kills = 0;
        this.mortes = 0;
        this.assistencias = 0;
        this.kda = 0.0;
    }

    public String getNickname() {
        return nickname;
    }

    public Agente getAgente() {
        return agente;
    }

    public int getKills() {
        return kills;
    }

    public int getMortes() {
        return mortes;
    }
    
    public int getAssistencias() {
        return assistencias;
    }
    
    public double getKda() {
        return kda;
    }


    public void calcularKda() {
        this.kda = (double)(kills + assistencias) / (mortes + 1);
    }

    @Override
    public String toString(){
        return "Nickname: " + nickname + ", Agente: " + agente.getNome() + ", Kills: " +  kills + ", Mortes: " + mortes + ", Assistencia: "  + assistencias + ", KDA: " + kda;
    }

    public void setNickname(String nickname) {
    this.nickname = nickname;
    }

    public void setAgente(Agente agente) {
    this.agente = agente;
    }
}