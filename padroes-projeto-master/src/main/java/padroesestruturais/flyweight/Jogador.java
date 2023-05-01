package padroesestruturais.flyweight;

public class Jogador {

    private String nome;
    private Escalacao escalacao;

    public Jogador(String nome, Escalacao escalacao) {
        this.nome = nome;
        this.escalacao = escalacao;
    }

    public String obterJogador() {
        return "Jogador{" +
                "nome='" + this.nome + '\'' +
                ", nomePosicao='" + escalacao.getNome() + '\'' +
                ", funcao='" + escalacao.getFuncao() + '\'' +
                '}';
    }
}
