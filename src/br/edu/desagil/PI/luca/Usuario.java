package br.edu.desagil.PI.luca;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nome;
	private List<Video> videos;
	
	// faz o contrutor e inicializa a lista nele
	public Usuario(String nome) {
		this.nome = nome;
		this.videos = new ArrayList<>();
	}
	
	public Video postaVideo(int id, Produto produto) {
		//USA THIS PARA PASSAR A SI MESMO COMO ARGUMENTO
		Video v = new Video(id, this, produto);
		//videos.add(v);
		this.videos.add(v);
		return v;
	}		
	public int totalAvaliacoes() {
		int soma = 0;
		for (Video video: this.videos) {
			soma += video.mediaAvaliacoes();
		}
		return soma;
	}
	// getter para poder ser lido por outras classes
	public String getNome() {
		return nome;
	}
}
