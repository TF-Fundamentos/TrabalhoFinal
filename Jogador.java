public class Jogador{

    private String nickname;
    private String agente;
    private int kills;
    private int mortes;
    private int assistencias;
    private double kda;

    public Jogador(String nickname, String agente, int kills, int mortes, int assistencias, double kda) {

        this.nickname = nickname;
        this.agente = agente;
        this.kills = kills;
        this.mortes = mortes;
        this.assistencias = assistencias;
        this.kda = (kills+assistencias)/(mortes+1);
        //aqui já define o cálculo para kda, somando 1 para mortes, assim evitando divisao p/0
    }

    public Jogador(){

        this.nickname = "";
        this.agente = "";
        this.kills = 0;
        this.mortes = 0;
        this.assistencias = 0;
        this.kda = 0.0;
    }

    public String getNickname() {
        return nickname;
    }

    public String getAgente() {
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

    @Override
    public String toString(){
        return "Nickname: " + nickname + ", Agente: " + agente + ", Kills: " +  kills + ", Mortes: " + mortes + ", Assistencia: "  + assistencias + ", KDA: " + kda;
    }
}