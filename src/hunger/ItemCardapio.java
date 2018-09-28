package hunger;

public class ItemCardapio {
	
	private TipoItem tipoItem;
	private String nome;
	private double valor;
	
	public void setTipo(String tipo) {
		this.tipoItem = tipo;
	}
	public String getTipo() {
		return this.tipoItem;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getValor() {
		return this.valor;
	}

}
