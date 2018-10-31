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
		
		Entregador joao = new Entregador();
		Entregador carlos = new Entregador();
		joao.setNome("João");
		joao.setPlaca("HHH888");
		
		joao.atendePedido(pedido001);
		
		pedido001.remove(cocazero);
		System.out.println("Estoque após devolução: " + cocazero.getQtdEstoque());
		
		
		Pedido pedido002 = new Pedido();
		
		ItemCardapio sanduice = new Lanche("Sanduíche", 8.00);
		ItemCardapio cocacola = new Bebida("Coca Cola", 4.00, 1);
		ItemCardapio chocolate = new Sobremesa("Chocolate", 6.00);
		
		pedido002.adiciona(sanduice);
		pedido002.adiciona(cocacola);
		pedido002.adiciona(chocolate);
		
		Cliente nathercia = new Cliente("Nathercia");
		
		Entregador pereira = new Entregador();
		pereira.setNome("Pereira");
		pereira.setPlaca("BBB456");
		pereira.atendePedido(pedido002);
		
		nathercia.setPedido(pedido002);
		
		Cheque cheque1 = new Cheque();
		cheque1.setAgencia(1234);
		cheque1.setBanco(1234);
		cheque1.setConta(1234);
		cheque1.setNumero(1234);
		cheque1.setValor(18.00);
		nathercia.associaCheque(cheque1);
		
		nathercia.paga(cheque1);
		
		System.out.println(pedido002.getPgto());
				
	}
}
