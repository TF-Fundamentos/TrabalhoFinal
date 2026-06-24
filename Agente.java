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
}