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

// preço e nome podem pode ser lido por outras classes,
// mas não podem ser escritos por outras classes.