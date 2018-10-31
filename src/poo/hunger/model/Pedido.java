package poo.hunger.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
	 
	private List<ItemCardapio>itens = new ArrayList<>();
	private Date data;
	private boolean pedidoAberto;
	private boolean atendido;
	private boolean pgto;
	private Cliente cliente;
	
	public Pedido() {
		this.data = new Date();
		this.atendido = false;
		this.pedidoAberto = true;
	}
	
	public void adiciona(ItemCardapio item) {
		if(this.pedidoAberto == false) {
			System.out.println("Pedido Não Está Aberto");
		}else {
			this.itens.add(item);
		}
	}
	
	public void remove(ItemCardapio item) {
		if(this.pedidoAberto == false) {
			System.out.println("Pedido Não Está Aberto");
		}else if(item instanceof Bebida) {
			((Bebida) item).setQtdEstoque(((Bebida) item).qtd);
		}else {
			this.itens.remove(item);
		}
	}
	
	public void cancela(Pedido pedido) {
		ItemCardapio aux = new ItemCardapio();
		for(int i = 0; i < this.itens.size(); i++) {
			remove(aux);
		}
		this.itens.clear();
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
	public void setAtendido() {
		this.atendido = true;
	}
	public boolean getAtendido() {
		return this.atendido;
	}
	
	public void fecharPedido() {
		this.pedidoAberto = false;
	}
	
	public void setPgto() {
		this.pgto = true;
	}
	
	public boolean getPgto() {
		return this.pgto;
	}
	
	public ItemCardapio pega(int i) { //método útil para geração de relatórios
		return this.itens.get(i);
	}
}