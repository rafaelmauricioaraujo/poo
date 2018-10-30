package poo.hunger.model;

public class Bebida extends ItemCardapio {
	
	private int qtdEstoque = 1000;
	
	public Bebida (String nome, double valor, int qtd) {
		super(nome, valor);
		this.qtdEstoque -= qtd;
	}
	
	public int getQtdEstoque() {
		return this.qtdEstoque;
	}
}
