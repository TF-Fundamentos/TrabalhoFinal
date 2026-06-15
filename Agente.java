public class Agente {
    private String nome;
    private String funcao;
    private String habilidadeUltimate;
    private double custoUltimate;

    public Agente(String nome, String funcao, String habilidadeUltimate, double custoUltimate) {
        this.nome = nome;
        this.fucao = funcao;
        this.habilidadeUltimate = habilidadeUltimate;
        this.custoUltimate = custoUltimate;
    }

    public Agente() {
        this.nome = "Desconhecido";
        this.funcao = "Desconhecida";
        this.habilidadeUltimate = "Desconhecida";
        this.custoUltimate = 0.0;
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

    public double getCustoUltimate() {
        return custoUltimate;
    }
}