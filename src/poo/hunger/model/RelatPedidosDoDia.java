/*Pedidos do dia: 
 * inclui nome e telefone do cliente, data, hora e valor total do pedido para
	cada pedido feito naquele dia;*/

package poo.hunger.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RelatPedidosDoDia {
	
	private List<Cliente>clientes = new ArrayList<>();
	
	public void adiciona(Cliente cliente) {
		if(cliente.situacao()) {
			this.clientes.add(cliente);
		}
	}
	public void gera() {
		Cliente aux = new Cliente();
		String nome;
		String telefone;
		Date data;
		double total;
		System.out.println("Relatorio de Pedidos do dia :");
		for(int i = 0; i <this.clientes.size(); i++) {
			
			aux = this.clientes.get(i);
			nome = aux.getNome();
			telefone = aux.getTelefone();
			data = aux.getPedido().getData();
			total = aux.getPedido().total();
			
			System.out.print(nome + " | " + telefone +  " | " + data + " | " + total);
			System.out.println();
		}
		
	}

}
