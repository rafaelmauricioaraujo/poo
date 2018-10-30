package poo.hunger.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Pedido {
	
	private boolean atendido;
	private Calendar data;
	private List<ItemCardapio>itens = new ArrayList<>(); //<> diamond operator
	
	public Pedido() {
		this.data = Calendar.getInstance();
		this.atendido = false;
	}
	
	public Pedido(ItemCardapio item) {
		this.itens.add(item);
		this.data = Calendar.getInstance();
		this.atendido = false;
	}
	
	public void adiciona(ItemCardapio item) {
		this.itens.add(item);
	}
	
	public int tamanho() {
		return this.itens.size();
	}
	public Calendar getData() {
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
