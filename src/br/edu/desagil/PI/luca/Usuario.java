package br.edu.desagil.PI.luca;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nome;
	private List<Video> videos;
	
	public Video constroiVideo(int id, Produto produto) {
		this.videos = new ArrayList<>();
		Video v = Video(id, produto);
		videos.add(v);
		return v;
	}		
	public int somaMedias() {
		int somaMedias = 0;
		int total = avaliacoes.size();
		for (int i = 0; i < total; i++) {
			soma += avaliacoes.get(i);
		}
		double media = soma/total;
		return Math.round(media);
	}
}
