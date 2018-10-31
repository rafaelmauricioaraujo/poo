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
		
		Cliente cliente01 = new Cliente();
		cliente01.setNome("Rafael");
		cliente01.setTelefone("(85)98888-8888");
		cliente01.setPedido(pedido001);
		System.out.println("Total do pedido do Rafael: " + cliente01.getPedido().total());
		
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
		
		Cliente cliente02 = new Cliente();
		cliente02.setNome("Nathercia");
		cliente02.setTelefone("(85)99999-9999");
		
		Entregador pereira = new Entregador();
		pereira.setNome("Pereira");
		pereira.setPlaca("BBB456");
		pereira.atendePedido(pedido002);
		
		cliente02.setPedido(pedido002);
		
		Cheque cheque1 = new Cheque();
		cheque1.setAgencia(1234);
		cheque1.setBanco(1234);
		cheque1.setConta(1234);
		cheque1.setNumero(1234);
		cheque1.setValor(18.00);
		cliente02.associaCheque(cheque1);
		
		cliente02.paga(cheque1);
		
		System.out.println(pedido002.getPgto());
		
		/*RELATÓRIOS*/
		
		RelatPedidosDoDia relatorio1 = new RelatPedidosDoDia();
		relatorio1.adiciona(cliente01);
		relatorio1.adiciona(cliente02);
		
		relatorio1.gera();
		
		RelatEntregadores relatorio2 = new RelatEntregadores();
		relatorio2.adiciona(joao);
		relatorio2.adiciona(pereira);
		
		relatorio2.gera();
		
		
	
				
	}
}
