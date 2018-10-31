/*mostra, para cada entregador, 
 * quantas entregas ele fez, 
 * a soma dos valores totais dos pedidos entregues e 
 * quanto ele deve receber de comissão (entregadores recebem 5% do valor dos pedidos entregues);*/ 

package poo.hunger.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RelatEntregadores {
	
	private List<Entregador>entregadores = new ArrayList<>();
	private List<Pedido>pedidos = new ArrayList<>();
	
	public void adiciona(Entregador entregador) {
		this.entregadores.add(entregador);
		this.pedidos.add(entregador.getPedido());
	}
	
	public void gera() {
		Entregador aux = new Entregador();
		String nome;
		int qtdEntregas;
		double total;
		double comissao;
		System.out.println("Relatorio de Entregadores :");
		for(int i = 0; i <this.entregadores.size(); i++) {
			
			aux = this.entregadores.get(i);
			nome = aux.getNome();
			qtdEntregas = aux.getEntregas();
			total = aux.getPedido().total();
			comissao = aux.calculaComissao();
			
			System.out.print(nome + " | " + qtdEntregas + " | " + total +  " | " + comissao);
			System.out.println();
		}
	}
}
