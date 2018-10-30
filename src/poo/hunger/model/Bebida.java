package poo.hunger.model;

public class Bebida extends ItemCardapio {
	
	private static int qtdEstoque = 1000;
	
	public Bebida (String nome, double valor, int qtd) {
		super(nome, valor);
		qtdEstoque -= qtd;
	}
	
	public int getQtdEstoque() {
		return qtdEstoque;
	}
}
