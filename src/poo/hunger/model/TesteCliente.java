package poo.hunger.model;

public class TesteCliente {
	
	public static void main(String args[]) {
		
		Cliente rafael = new Cliente("Rafael");
		
		System.out.println(rafael.getNome());
		System.out.println(rafael.getEndereco());
		System.out.println(rafael.getTelefone());
	}

}
