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
		System.out.println("Relatorio de Itens Vendidos :");
		for(int i = 0; i <this.pedidos.size(); i++) {
			
			pedidoAux = this.pedidos.get(i);
			
			for(int j = 0; j < pedidoAux.tamanho(); j++) {
				
				itemAux = pedidoAux.pega(j);
				if(itemAux instanceof Lanche) {
					this.contadorLanche++;
				}else if(itemAux instanceof Refeicao) {
					this.contadorRefeicao++;
				}else if(itemAux instanceof Bebida) {
					this.contadorBebida++;
				}else {
					this.contadorSobremesa++;
				}	
			}
		}
		System.out.println("Número de itens Lanche : " + this.contadorLanche);
		System.out.println("Número de itens Refeicao : " + this.contadorRefeicao);
		System.out.println("Número de itens Bebida : " + this.contadorBebida);
		System.out.println("Número de itens Sobremesa : " + this.contadorSobremesa);
		
		if(this.contadorLanche >= 5) {
			System.out.println("Houve pico de procura de Lanche");
		}
		if(this.contadorRefeicao >= 5) {
			System.out.println("Houve pico de procura de Refeicao");
		}
		if(this.contadorBebida >= 5) {
			System.out.println("Houve pico de procura de Bebida");
		}
		if(this.contadorSobremesa >= 5) {
			System.out.println("Houve pico de procura de Sobremesa");
		}
	}
}
