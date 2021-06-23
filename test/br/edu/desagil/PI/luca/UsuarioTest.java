package br.edu.desagil.PI.luca;

import org.junit.jupiter.api.BeforeEach;

//import java.util.ArrayList;
//import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class UsuarioTest {
	//private static double DELTA = 0.01;
	//private Video V;
	//private Video Vid;
	private Produto P;
	private Usuario U;	
	private Usuario UA;	

	@BeforeEach
	public void setUp() {
		U = new Usuario("Luca");
		UA = new Usuario("Luca autor do vídeo");
		P = new Produto("PC", 100.0);
		// não é necessário pois o método postaVideo já constrói
		// e devolve um vídeo
		//V = new Video(1, UA, P);
		//Vid = new Video(1, UA, P);
	}

	@ Test
	public void testeUm() {
		// o método postaVideo devolve a construção de um vídeo
		Video V = UA.postaVideo(10, P);
		V.adicionaAvaliacao(UA, 4);
		V.adicionaAvaliacao(U, 0);
		V.adicionaAvaliacao(U, 6);
		assertEquals(0, UA.totalAvaliacoes());
	}
	@ Test
	public void testeDois() {
		Video V = UA.postaVideo(10, P);
		V.adicionaAvaliacao(U, 4);
		assertEquals(4, UA.totalAvaliacoes());
	}
	@ Test
	public void testeTres() {
		Video V = UA.postaVideo(10, P);
		// tem que ser diferentes
		V.adicionaAvaliacao(new Usuario("Joao"), 2);
		V.adicionaAvaliacao(new Usuario("Zé"), 5);
		// 4,5 arredonda pra 5
		assertEquals(4, UA.totalAvaliacoes());
	}
	@ Test
	public void testeQuatro() {
		Video V = UA.postaVideo(10, P);
		V.adicionaAvaliacao(U, 4);
		V.adicionaAvaliacao(U, 3);
		V.adicionaAvaliacao(U, 3);
		// 3, 33 arredonda pra 3
		assertEquals(3, UA.totalAvaliacoes());
	}
	@ Test
	public void testeCinco() {
		Video V = UA.postaVideo(10, P);
		V.adicionaAvaliacao(new Usuario("Joao"), 5);
		V.adicionaAvaliacao(new Usuario("Zé"), 5);
		Video Vi = UA.postaVideo(15, P);
		Vi.adicionaAvaliacao(new Usuario("Leo"), 5);
		assertEquals(10, UA.totalAvaliacoes());
	}
}
