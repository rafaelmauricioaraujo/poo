package poo.hunger.model;

public class Bebida extends ItemCardapio {
	
	private static int qtdEstoque = 1000;
	private static int numero;
	public int qtd;
	
	
	public Bebida (String nome, double valor, int qtd) {
		super(nome, valor);
		this.qtd = qtd;
		qtdEstoque -= this.qtd;
		numero += qtd;
	}
	
	public int getQtdEstoque() {
		return qtdEstoque;
	}
	
	public void setQtdEstoque(int qtd) {
		qtdEstoque += qtd;
	}
	
	public int getNumero() {
		return numero;
	}
}
