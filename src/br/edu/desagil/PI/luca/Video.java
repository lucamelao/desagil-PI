package br.edu.desagil.PI.luca;

import java.util.HashMap;
import java.util.Map;

public class Video {
	private int id;
	private Usuario nome;
	private Produto produto;
	private Map<String, Integer> avaliacoes;

	
	public void adicionaAvaliacao(Usuario nome, int avaliacao) {
		avaliacoes = new HashMap<>();
		if avaliacoes.containsKey(nome) = false {
			if int 1 <= avalicao <= int 5 {
			avaliacoes.put(nome, avaliacao);
				}
		}
	}
	public double mediaAvaliacoes() {
		int total = avaliacoes.size();
		double soma = 0;
		for (int i = 0; i < total; i++) {
			soma += avaliacoes.get(i);
		}
		double media = soma/total;
		return Math.round(media);
	}
}