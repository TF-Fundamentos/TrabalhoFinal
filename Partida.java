public class Partida {
    private String id;
    private Equipe equipe1;
    private Equipe equipe2;
    private int placarEquipe1;
    private int placarEquipe2;
    public Partida(String id, Equipe equipe1, Equipe equipe2, int placarEquipe1, int placarEquipe2) {
        this.id = id;
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
        this.placarEquipe1 = placarEquipe1;
        this.placarEquipe2 = placarEquipe2;
    }
    public Partida(){
        this.id = "Desconhecido";
        this.equipe1 = new Equipe();
        this.equipe2 = new Equipe();
        this.placarEquipe1 = 0;
        this.placarEquipe2 = 0;
    }
    public String getId() {
        return id;
    }
    public Equipe getEquipe1() {
        return equipe1;
    }
    public Equipe getEquipe2() {
        return equipe2;
    }
    public int getPlacarEquipe1() {
        return placarEquipe1;
    }
    public int getPlacarEquipe2() {
        return placarEquipe2;
    }
}

