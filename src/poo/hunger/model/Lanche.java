package poo.hunger.model;

public class Lanche extends ItemCardapio{
	
	private static int numero;
	
	public Lanche(String nome, double valor) {
		super(nome, valor);
		numero++;
	}
	public int getNumero() {
		return numero;
	}
	
}
