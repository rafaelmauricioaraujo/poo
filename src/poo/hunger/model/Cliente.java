package poo.hunger.model;

public class Cliente {
	
	private String nome;
	private String endereco;
	private String telefone;
	private int referencia;
	private boolean ativo;
	
	public Cliente() {
		
	}
	
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
	
}
