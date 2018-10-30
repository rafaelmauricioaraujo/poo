package poo.hunger.view;

import poo.hunger.model.*;

public class Main {
	
	public static void main(String args[]) {
		
		ItemCardapio lasanha = new Refeicao("Lasanha", 15.00);
		ItemCardapio pizza = new Refeicao("Pizza", 20.00);
		ItemCardapio sushi = new Refeicao("Sushi", 10.00);
		ItemCardapio coca = new Bebida("Coca", 6.00, 2);
		ItemCardapio milkshake = new Sobremesa("MilkShake", 10.00);
		
		Bebida suco = new Bebida("Suco", 12.00, 2);
		System.out.println("estoque: " + suco.getQtdEstoque());
		Bebida cocazero = new Bebida("Coca-Zero", 6.00, 2);
		
		
		Pedido pedido001 = new Pedido();
		pedido001.adiciona(lasanha);
		pedido001.adiciona(sushi);
		pedido001.adiciona(pizza);
		pedido001.adiciona(coca);
		pedido001.adiciona(milkshake);
		
		System.out.println(pedido001.tamanho());
		System.out.println("TOTAL PEDIDO: " + pedido001.total());
		System.out.println("estoque: " + cocazero.getQtdEstoque());
		
		Cliente rafael = new Cliente("Rafael");
		rafael.setPedido(pedido001);
		System.out.println("Total do pedido do Rafael: " + rafael.getPedido().total());
	}
}
