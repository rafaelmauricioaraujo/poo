package poo.hunger.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
	
	private boolean atendido;
	private Date data; 
	private List<ItemCardapio>itens = new ArrayList<>(); //<> diamond operator
	
	public Pedido() {
		this.data = new Date();
		this.atendido = false;
	}
	
	public Pedido(ItemCardapio item) {
		this.itens.add(item);
		this.data = new Date();
		this.atendido = false;
	}
	
	public void adiciona(ItemCardapio item) {
		this.itens.add(item);
	}
	
	public int tamanho() {
		return this.itens.size();
	}
	public Date getData() {
		return this.data;
	}
	
	public double total() {
		double valorTotal = 0;
		ItemCardapio aux = new ItemCardapio();
		for(int i = 0; i < this.itens.size(); i++) {
			aux = this.itens.get(i);
			valorTotal = valorTotal + aux.getValor();
		}
		return valorTotal;
	}
}
