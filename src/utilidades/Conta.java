package utilidades;

public class Conta {
	
	private int numConta;
	private String titular;
	private double saldo;
	
	public Conta(int number, String titular) {
		this.numConta = number;
		this.titular = titular;
	}
	
	public Conta(int number, String titular, double saldoInicial) {
		this.numConta = number;
		this.titular = titular;
		depositar(saldoInicial); 
	}

	public int getNumber() {
		return numConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double saldo) {
		this.saldo += saldo;
	}
	
	public void sacar(double saldo) {
		this.saldo -= saldo + 5;
	}
	
	public String toString() {
		return " Conta "
				+ numConta
				+ ", Titular: "
				+ titular
				+ ",saldo: $"
				+ String.format("%.2f", saldo);
				
	}
	
	
	
	
	
}
