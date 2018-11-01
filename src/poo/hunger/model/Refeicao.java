package poo.hunger.model;

public class Refeicao extends ItemCardapio {
	
	private static int numero;
	
	public Refeicao(String nome, double valor) {
		super(nome, valor);
		numero++;
	}
	
	public int getNumero() {
		return numero;
	}

}
