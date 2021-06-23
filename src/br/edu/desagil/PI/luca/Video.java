package br.edu.desagil.PI.luca;

import java.util.HashMap;
import java.util.Map;

public class Video {
	private int id;
	private Usuario usuario;
	private Produto produto;
	private Map<String, Integer> avaliacoes;

	// Se est� sendo inicializado n�o precisa passar como argumento no construtor
	//public Video(int id, Usuario usuario, Produto produto, Map<String, Integer> avaliacoes) {
	public Video(int id, Usuario usuario, Produto produto) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.produto = produto;
		this.avaliacoes = new HashMap<>();
	}
	
	public void adicionaAvaliacao(Usuario usuario, int avaliacao) {
		// o usu�rio n�o pode ser quem postou o v�deo 
		
		// this.usuario.getNome() ---- autor do video
		// usuario.getNome() ---- autor da avalia��o
		
		// avalia��o tem que ser um inteiro entre 1 e 5
		if (!this.usuario.getNome().equals(usuario.getNome()) && avaliacao >= 1 && avaliacao <= 5) {
			// coloca no dicion�rio o nome do autor da avalia��o e a nota
			this.avaliacoes.put(usuario.getNome(), avaliacao);
		}
	}
	public int mediaAvaliacoes() {
		int total = avaliacoes.size();
		double soma = 0;
		for (int avaliacao : this.avaliacoes.values()) {
			soma += avaliacao;
		}
		// FAZENDO PELO FOR NORMAL
		//for (int i = 0; i < total; i++) 
			//soma += avaliacoes.get(i);
		//}
		
		// Fazer o casting
		double media = (double) soma/total;
		// Fazer o casting
		int mediaArredondada = (int)Math.round(media);
		return mediaArredondada;
	}
	
	public int getId() {
		return id;
	}
	public Produto getProduto() {
		return produto;
	}

}