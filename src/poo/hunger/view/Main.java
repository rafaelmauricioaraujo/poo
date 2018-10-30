package poo.hunger.view;

import poo.hunger.model.Bebida;
import poo.hunger.model.ItemCardapio;
import poo.hunger.model.Pedido;
import poo.hunger.model.Refeicao;
import poo.hunger.model.Sobremesa;

public class Main {
	
	public static void main(String args[]) {
		
		ItemCardapio lasanha = new Refeicao("Lasanha", 15.00);
		ItemCardapio pizza = new Refeicao("Pizza", 20.00);
		ItemCardapio sushi = new Refeicao("Sushi", 10.00);
		ItemCardapio coca = new Bebida("Coca", 6.00, 2);
		ItemCardapio milkshake = new Sobremesa("MilkShake", 10.00);
		
		Bebida suco = new Bebida("Suco", 12.00, 2);
		System.out.println("estoque: " + suco.getQtdEstoque());
		
		Pedido pedido001 = new Pedido();
		pedido001.adiciona(lasanha);
		pedido001.adiciona(sushi);
		pedido001.adiciona(pizza);
		pedido001.adiciona(coca);
		pedido001.adiciona(milkshake);
		
		System.out.println(pedido001.tamanho());
		System.out.println("TOTAL PEDIDO: " + pedido001.total());
		System.out.println("Data: " + pedido001.getData());
		
		
	}

}
