package poo.hunger.model;

public class Entregador {

	private String nome;
	private String placaVeiculo;
	private Pedido pedido;
	
	public Entregador() {
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setPlaca(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}
	public String getPlava() {
		return this.placaVeiculo;
	}
	public void atendePedido(Pedido pedido) {
		this.pedido = pedido;
		pedido.setAtendido();
		
	}
}
