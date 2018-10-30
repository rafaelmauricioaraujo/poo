package poo.hunger.model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private boolean atendido = false;
	private String data;
	private List<ItemCardapio>itens = new ArrayList<ItemCardapio>();
	
	public Pedido() {
		
	}
	
	public Pedido(ItemCardapio item) {
		this.itens.add(item);
	}
	
	public void adiciona(ItemCardapio item) {
		this.itens.add(item);
	}
	
	public int tamanho() {
		return this.itens.size();
	}
}
