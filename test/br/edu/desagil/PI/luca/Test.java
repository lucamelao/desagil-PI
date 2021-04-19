package br.edu.desagil.PI.luca;

import java.util.HashMap;
import java.util.Map;

//import java.util.ArrayList;
//import java.util.List;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {
	//private static double DELTA = 0.01;

	private Video V;
	private Map<String, Integer> avaliacoes;

	@BeforeEach
	public void setUp() {
		V = new Video(76, "Jorge", ("Fogão", 99.5));
		avaliacoes = new HashMap<>();
	}

	@Test
	public void tentaAdicionar() {
		V.adicionaAvalicao("Fulano", 4);
		V.adicionaAvalicao("Ciclano", 0.5);
		V.adicionaAvalicao("Beltrano", 6);
		
//		d.put(k, v)
//		d.put(k, v)
//		d.put(k, v)

		assertEquals(4, V.mediaAvaliacoes(c), DELTA);
	}

