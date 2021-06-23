package br.edu.desagil.PI.luca;

public class Produto {
	private String nome;
	private double preco;
	
	protected Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return this.nome;
	}
	public double getPreco() {
		return this.preco;
	}
}

// pre�o e nome podem pode ser lido por outras classes,
// mas n�o podem ser escritos por outras classes.