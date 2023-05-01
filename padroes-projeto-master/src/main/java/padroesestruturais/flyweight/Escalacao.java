package padroesestruturais.flyweight;

public class Escalacao {

    private String nome;
    private String funcao;

    public Escalacao(String nome, String funcao) {
        this.nome = nome;
        this.funcao = funcao;
    }

    public String getNome() {
        return nome;
    }

    public String getFuncao() {
        return funcao;
    }
}
