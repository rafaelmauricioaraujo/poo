package poo.hunger.model;

public class Cheque {
		private int numero;
		private int conta;
		private int agencia;
		private int banco;
		private double valor;
		
		public void setNumero(int numero) {
			this.numero = numero;
		}
		
		public int getNumero() {
			return this.numero;
		}
		
		public void setConta(int conta) {
			this.conta = conta;
		}
		
		public int getConta() {
			return this.conta;
		}
		
		public void setAgencia(int agencia) {
			this.agencia = agencia;
		}
		
		public int getAgencia() {
			return this.agencia;
		}
		
		public void setBanco(int banco) {
			this.banco = banco;
		}
		
		public int getBanco() {
			return this.banco;
		}
		
		public void setValor(double valor) {
			this.valor = valor;
		}
		public double getValor() {
			return this.valor;
		}
}
