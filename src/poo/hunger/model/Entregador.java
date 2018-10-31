package poo.hunger.model;

public class Entregador {

	private String nome;
	private String placaVeiculo;
	private Pedido pedido;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setPlaca(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}
	public String getPlaca() {
		return this.placaVeiculo;
	}
	public void atendePedido(Pedido pedido) {
		this.pedido = pedido;
		this.pedido.fecharPedido();
		this.pedido.setAtendido();
	}
	public boolean pedidoFechado() {
		return this.pedidoFechado();
	}
}
