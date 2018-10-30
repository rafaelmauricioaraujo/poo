package poo.hunger.model;

public class ItemCardapio {
	
	private String nome;
	private double valor;
	
	public ItemCardapio() {
		
	}
	
	public ItemCardapio(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getValor() {
		return this.valor;
	}

}
