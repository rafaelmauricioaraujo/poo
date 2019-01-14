package poo.hunger.model;

public class Entregador {

	private String nome;
	private String placaVeiculo;
	private Pedido pedido;
	private int qtdEntregas;
	private double comissao;
	
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
		this.pedido.fecharPedido(); // a partir daqui não é possível mais remover ou adicionar itens
		this.pedido.setAtendido(); // parar informar que o pedido foi entregue ao cliente
		this.qtdEntregas++;
	}
	public Pedido getPedido() {
		return this.pedido;
	}
	public int getEntregas() {
		return this.qtdEntregas;
	}
	
	
	public double calculaComissao() {
		return this.comissao = 0.05*(this.pedido.total());
	}
	
	/*
	public boolean pedidoFechado() {
		return this.pedidoFechado();
	}
	*/
}
