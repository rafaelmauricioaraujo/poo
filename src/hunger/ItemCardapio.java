package hunger;

public class ItemCardapio {
	
	private Object tipo;
	private String nome;
	private double valor;
	
	public void setTipo(Object tipo) {
		this.tipo = tipo;
	}
	public Object getTipo() {
		return this.tipo;
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
