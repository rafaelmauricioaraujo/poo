package poo.hunger.model;

public class Cliente {
	
	private String nome;
	private String endereco;
	private String telefone;
	private int referencia;
	private boolean ativo = true;
	private Pedido pedido;
	private Cheque cheque;
	private int inadiplencia = 0;
	
	public Cliente(String nome) {
		this.nome = nome;
		this.ativo = true;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEndereco() {
		return this.endereco;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getTelefone() {
		return this.telefone;
	}
	
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Pedido getPedido() {
		return this.pedido;
	}
	
	public void associaCheque(Cheque cheque) {
		this.cheque = cheque;
	}
	public void paga(Cheque cheque) {
		double totalCheque = this.cheque.getValor();
		double totalPedido = this.pedido.total();
		if(totalCheque == totalPedido) {
			this.pedido.setPgto();
		}else {
			this.pedido.cancela(pedido);
			this.inadiplencia++;
		}
	}
	public void desativarCliente() {
		if(this.inadiplencia > 2) {
			this.ativo = false;
		}
	}
	
	public void ativaCliente() {
		this.inadiplencia = 0;
		this.ativo = true;
	}
}