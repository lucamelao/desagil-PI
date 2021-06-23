package br.edu.desagil.PI.luca;

import java.util.ArrayList;
import java.util.List;


public class Vendedor extends Usuario {
	private List<Produto> produtos;
	
	public Vendedor(String nome) {
		super(nome);
		this.produtos = new ArrayList<>();
	}
	public void cadastraProduto(String nome, double preco) {
		Produto p = new Produto(nome, preco);
		this.produtos.add(p);				
	}
}

// lista inicializada vazia e não pode ser
// lida nem escrita por outras classes

// nao devolve nada -> public void