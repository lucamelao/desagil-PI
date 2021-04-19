package br.edu.desagil.PI.luca;

import java.util.ArrayList;
import java.util.List;


public class Vendedor extends Usuario {
	private List<Produto> produtos;

	public void cadastraProduto(String nome, double preco) {
		this.produtos = new ArrayList<>();
		Produto p = new Produto(nome, preco);
		this.produtos.add(p);				
	}
}
