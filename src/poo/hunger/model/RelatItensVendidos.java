/*Itens vendidos: relata, para cada item de cardápio, 
 * quantas unidades foram vendidas naquela noite; 
 * se houve pico de procura, 
 * ou seja, se em um único pedido fora incluída mais do que 5 unidades daquele item de cardápio*/

package poo.hunger.model;

import java.util.ArrayList;
import java.util.List;

public class RelatItensVendidos {
	
	private List<Pedido>pedidos = new ArrayList<>();
	private int contadorLanche;
	private int contadorRefeicao;
	private int contadorBebida;
	private int contadorSobremesa;
	
	public void adiciona(Pedido pedidos) {
		this.pedidos.add(pedidos);
	}
	
	public void gera() {
		Pedido pedidoAux = new Pedido();
		ItemCardapio itemAux = new ItemCardapio();
		System.out.println("Relatorio de Entregadores :");
		for(int i = 0; i <this.pedidos.size(); i++) {
			
			pedidoAux = this.pedidos.get(i);
			for(int j = 0; i < pedidoAux.tamanho(); i++) {
				
			}
				
			
			nome = aux.getNome();
			qtdEntregas = aux.getEntregas();
			total = aux.getPedido().total();
			comissao = aux.calculaComissao();
			
			System.out.print(nome + " | " + qtdEntregas + " | " + total +  " | " + comissao);
			System.out.println();
		}
	}
	}
	
}
