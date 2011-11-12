import static org.junit.Assert.*;

import org.junit.Test;


public class QuebraLinhaTest {

	@Test
	public void deveQuebrarLinhaJabuti() {
		Object[] linhas = QuebraLinha.quebrar("Um pequeno jabuti xereta viu dez cegonhas felizes.", 20);
		assertArrayEquals(new Object[] {"Um pequeno jabuti", "xereta viu dez", "cegonhas felizes."}, linhas);
	}

	@Test
	public void deveQuebrarLinhaRato() {
		Object[] linhas = QuebraLinha.quebrar("O rato roeu a roupa do rei de roma.", 12);
		assertArrayEquals(new Object[] {"O rato roeu", "a roupa do", "rei de roma."}, linhas);
	}
	@Test
	public void deveQuebrarLinhaAvai() {
		Object[] linhas = QuebraLinha.quebrar("Cade o meu chinelo do Avai!", 7);
		assertArrayEquals(new Object[] {"Cade o", "meu", "chinelo","do","Avai!"}, linhas);
	}
	@Test
	public void deveQuebrarLinhaPalavraNaoCabe() {
		Object[] linhas = QuebraLinha.quebrar("Champanhe de pobre é sonrisal.", 8);
		assertArrayEquals(new Object[] {"Champanhe Não pode ser quebrada no espaço especificado"}, linhas);
	}
}
