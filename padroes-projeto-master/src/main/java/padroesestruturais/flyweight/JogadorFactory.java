package padroesestruturais.flyweight;

import java.util.HashMap;
import java.util.Map;

public class JogadorFactory {
    private static Map<String, Escalacao> jogadores = new HashMap<>();

    public static Escalacao getJogadores(String nome, String funcao) {
        Escalacao escalacao = jogadores.get(nome);
        if (escalacao == null) {
            escalacao = new Escalacao(nome, funcao);
            jogadores.put(nome, escalacao);
        }
        return escalacao;
    }

    public static int getTotalPosicoes() {
        return jogadores.size();
    }

}




