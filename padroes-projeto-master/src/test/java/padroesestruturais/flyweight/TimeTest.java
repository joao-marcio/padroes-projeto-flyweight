package padroesestruturais.flyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void deveRetornarJogadores() {
        Time time = new Time();
        time.escalar("Fabrício Bruno", "Zagueiro", "Defender ultimo homem");
        time.escalar("Gerson", "Volante", "Saida de jogo");
        time.escalar("Arrascaeta", "Meia", "Armacao");
        time.escalar("Gabigol", "Atacante", "Fazer gol");

        List<String> saida = Arrays.asList(
                "Jogador{nome='Fabrício Bruno', nomePosicao='Zagueiro', funcao='Defender ultimo homem'}",
                "Jogador{nome='Gerson', nomePosicao='Volante', funcao='Saida de jogo'}",
                "Jogador{nome='Arrascaeta', nomePosicao='Meia', funcao='Armacao'}",
                "Jogador{nome='Gabigol', nomePosicao='Atacante', funcao='Fazer gol'}");

        assertEquals(saida, time.obterJogadores());
    }

    @Test
    void deveRetornarTotalPosicoes() {
        Time time = new Time();
        time.escalar("Fabrício Bruno", "Zagueiro", "Defender ultimo homem");
        time.escalar("David Luiz", "Zagueiro", "Defender ultimo homem");
        time.escalar("Gerson", "Volante", "Saida de jogo");
        time.escalar("Arrascaeta", "Meia", "Armacao");
        time.escalar("Gabigol", "Atacante", "Fazer gol");

        assertEquals(4, JogadorFactory.getTotalPosicoes());
    }

}