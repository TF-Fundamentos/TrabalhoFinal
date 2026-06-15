public class Jogador{
    private String nickname;
    private Agente[] agentes;
    private int kills;
    private int mortes;
    private int assistencias;
    private double kda;
    public Jogador(String nickname, Agente[] agentes, int kills, int mortes, int assistencias, double kda) {
        this.nickname = nickname;
        this.agentes = agentes;
        this.kills = kills;
        this.mortes = mortes;
        this.assistencias = assistencias;
        this.kda = kda;
    }
    public Jogador(){
        this.nickname = "";
        this.agentes = new Agente[0];
        this.kills = 0;
        this.mortes = 0;
        this.assistencias = 0;
        this.kda = 0.0;
    }
    public String getNickname() {
        return nickname;
    }
    public Agente[] getAgentes() {
        return agentes;
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
}