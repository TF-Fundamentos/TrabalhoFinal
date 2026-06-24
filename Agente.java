public class Agente {
    private String nome;
    private String funcao;
    private String habilidadeUltimate;
    private int custoUltimate;

    public Agente(String nome, String funcao, String habilidadeUltimate, int custoUltimate) {
        this.nome = nome;
        this.funcao = funcao;
        this.habilidadeUltimate = habilidadeUltimate;
        this.custoUltimate = custoUltimate;
    }

    public Agente() {
        this.nome = "Desconhecido";
        this.funcao = "Desconhecida";
        this.habilidadeUltimate = "Desconhecida";
        this.custoUltimate = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getFuncao(){
        return funcao;
    }

    public String getHabilidadeUltimate() {
        return habilidadeUltimate;
    }

    public int getCustoUltimate() {
        return custoUltimate;
    }

//Array com todos os personagens selecionaveis (até o momento)
public static Agente[] listaDeAgentes() {
    Agente[] agentes = new Agente[29];

    //Duelistas (0-7)
    agentes[0] = new Agente("Jett", "Duelista", "Blade Storm", 7);
    agentes[1] = new Agente("Reyna", "Duelista", "Empress", 6);
    agentes[2] = new Agente("Phoenix", "Duelista", "Run It Back", 6);
    agentes[3] = new Agente("Raze", "Duelista", "Showstopper", 8);
    agentes[4] = new Agente("Yoru", "Duelista", "Dimensional Drift",8);
    agentes[5] = new Agente("Neon", "Duelista", "Overdrive", 8);
    agentes[6] = new Agente("Iso", "Duelista", "Kill Contract", 7);
    agentes[7] = new Agente("Waylay", "Duelista", "Convergence", 7);
    
    //Iniciadores (8-14)
    agentes[8]  = new Agente("Sova", "Iniciador", "Hunter's Fury", 7);
    agentes[9]  = new Agente("Breach", "Iniciador", "Rolling Thunder", 8);
    agentes[10] = new Agente("Skye", "Iniciador", "Seekers", 7);
    agentes[11] = new Agente("KAY/O", "Iniciador", "NULL/cmd", 7);
    agentes[12] = new Agente("Fade", "Iniciador", "Nightfall", 7);
    agentes[13] = new Agente("Gekko", "Iniciador", "Thrash", 7);
    agentes[14] = new Agente("Tejo", "Iniciador", "Armageddon", 7);

    //Controladores (15-21)
    agentes[15] = new Agente("Brimstone", "Controlador", "Orbital Strike", 7);
    agentes[16] = new Agente("Omen", "Controlador", "From the Shadows", 7);
    agentes[17] = new Agente("Viper", "Controlador", "Viper's Pit", 7);
    agentes[18] = new Agente("Astra", "Controlador", "Astral Form / Nova Pulse", 7);
    agentes[19] = new Agente("Harbor", "Controlador", "Reckoning", 7);
    agentes[20] = new Agente("Clove", "Controlador", "Not Dead Yet", 6);
    agentes[21] = new Agente("Miks", "Controlador", "Melodia Sismica", 7);

    //Sentinelas (22-28)
    agentes[22] = new Agente("Sage", "Sentinela", "Resurrection", 8);
    agentes[23] = new Agente("Cypher", "Sentinela", "Neural Theft", 6);
    agentes[24] = new Agente("Killjoy", "Sentinela", "Lockdown", 8);
    agentes[25] = new Agente("Chamber", "Sentinela", "Tour De Force", 8);
    agentes[26] = new Agente("Deadlock", "Sentinela", "Annihilation", 8);
    agentes[27] = new Agente("Vyse", "Sentinela", "Steel Garden", 8);
    agentes[28] = new Agente("Veto", "Sentinela", "Evolucao", 7);

    return agentes;
    }
}