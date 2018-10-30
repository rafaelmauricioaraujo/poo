package poo.hunger.model;

public class Bebida extends ItemCardapio {
	
	private static int qtdEstoque = 1000;
	public int qtd;
	
	public Bebida (String nome, double valor, int qtd) {
		super(nome, valor);
		this.qtd = qtd;
		qtdEstoque -= this.qtd;
	}
	
	public int getQtdEstoque() {
		return qtdEstoque;
	}
	
	public void setQtdEstoque(int qtd) {
		qtdEstoque += qtd;
	}
}
