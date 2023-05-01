package padroesestruturais.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Time {

    private List<Jogador> jogadors = new ArrayList<>();

    public void escalar(String nomeJogador, String nomePosicao, String funcao) {
        Escalacao escalacao = JogadorFactory.getJogadores(nomePosicao, funcao);
        Jogador jogador = new Jogador(nomeJogador, escalacao);
        jogadors.add(jogador);
    }

    public List<String> obterJogadores() {
        List<String> saida = new ArrayList<String>();
        for (Jogador jogador : this.jogadors) {
            saida.add(jogador.obterJogador());
        }
        return saida;
    }


}
