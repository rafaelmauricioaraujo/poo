package poo.hunger.model;

public class Sobremesa extends ItemCardapio{
	
	private static int numero;
	
	public Sobremesa(String nome, double valor) {
		super(nome, valor);
		numero++;
	}
	
	public int getNumero() {
		return numero;
	}

}
