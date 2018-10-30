package poo.hunger.view;

import poo.hunger.model.ItemCardapio;
import poo.hunger.model.Pedido;

public class Main {
	
	public static void main(String args[]) {
		
		ItemCardapio lasanha = new ItemCardapio("Lasanha", 15.00);
		System.out.println("nome do item: " + lasanha.getNome());
		System.out.println("valor do item: " + lasanha.getValor());
		
		ItemCardapio pizza = new ItemCardapio("Pizza", 20.00);
		ItemCardapio sushi = new ItemCardapio("Sushi", 10.00);
		
		Pedido pedido001 = new Pedido();
		pedido001.adiciona(lasanha);
		pedido001.adiciona(sushi);
		pedido001.adiciona(pizza);
		
		System.out.println(pedido001.tamanho());
	}

}
